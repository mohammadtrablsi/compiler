grammar ReactGrammar;

//options {
//    tokenVocab=ReactLexer;
//}

program
  : import_statement* statement* EOF
  ;


  import_statement
    : IMPORT ((DEFAULT | specific_identifier | LBRACE (specific_identifier|USE_HOOK) (COMMA (specific_identifier|USE_HOOK))* RBRACE)
      FROM (STRING | IDENTIFIER | CHARACTERS) (AS specific_identifier)?)? STRING? SEMICOLON
    ;

  specific_identifier
    : IDENTIFIER
    ;

statement
  : ifStatement
  | switchStatement
  | whileStatement
  | doWhileStatement
  | forStatement
  | foreachStatement
  | mapStatement
  | declaration SEMICOLON
  | assignment SEMICOLON
  | expression SEMICOLON
  | function
  | arrowfunction
  | class
  | functionCall SEMICOLON
  | usehooks SEMICOLON
  ;


class
  : class_identifier class_body
  ;

class_identifier
  : EXPORT? DEFAULT? CLASS IDENTIFIER (EXTEND IDENTIFIER)?
  ;

class_body
  : LBRACE RENDER LPAREN RPAREN (statement)* (returnStatement)? RBRACE
  ;

function
  : function_identifier function_body
  ;

function_identifier
  : EXPORT? DEFAULT? ASYNC? FUNCTION IDENTIFIER LPAREN parameter_list RPAREN
  ;

arrowfunction
  : arrow_function_identifier function_body
  ;

arrow_function_identifier
  : EXPORT? DEFAULT? CONST IDENTIFIER ASSIGN (ASYNC)? LPAREN parameter_list RPAREN ARROW
  ;


function_body
  : LBRACE (statement)* (returnStatement)? RBRACE
  ;


/*//functionCall
//  : IDENTIFIER LPAREN parameter_list RPAREN
//  | IDENTIFIER DOT IDENTIFIER LPAREN parameter_list RPAREN
//  ;*/
functionCall
  : IDENTIFIER LPAREN parameter_list RPAREN
  | IDENTIFIER (DOT IDENTIFIER|DOT CURRENT)+ LPAREN parameter_list RPAREN
  ;

//parameter_list
//  : ((IDENTIFIER | (IDENTIFIER DOT IDENTIFIER)) (COMMA IDENTIFIER | (IDENTIFIER DOT IDENTIFIER))*)?
//  ;
  parameter_list
    : ((data_type| (IDENTIFIER DOT (IDENTIFIER|functionCall))) (COMMA data_type| (IDENTIFIER DOT (IDENTIFIER|functionCall)))*)?
    ;

returnStatement
  : RETURN (
      IDENTIFIER
      | CHARACTERS
      | expression
      | functionCall
      | condition
      | (LPAREN jsxStatement RPAREN)
    ) SEMICOLON
  ;

declaration
  : varModifier IDENTIFIER (ASSIGN expression)? //variable
  | CONST IDENTIFIER ASSIGN LBRACKET (element|object*) RBRACKET //array
  ;
data_type: STRING|CHARACTERS|NUMERIC|TRUE|FALSE|IDENTIFIER|NULL;
element: data_type (COMMA data_type)* ;
object: (LBRACE key_value_pair (COMMA key_value_pair)* RBRACE) (COMMA LBRACE key_value_pair (COMMA key_value_pair)* RBRACE)*;
key_value_pair: IDENTIFIER ':' (IDENTIFIER|data_type);


assignment
  : IDENTIFIER ASSIGN (IDENTIFIER | CHARACTERS | functionCall | expression)                     # Assign
  | IDENTIFIER DOT IDENTIFIER ASSIGN (IDENTIFIER | CHARACTERS | functionCall | expression)      # ObjectAssign
  | THIS DOT IDENTIFIER ASSIGN (IDENTIFIER | CHARACTERS | functionCall | expression)            # ThisAssign
  | IDENTIFIER LBRACKET(IDENTIFIER|NUMERIC)RBRACKET ASSIGN (IDENTIFIER | CHARACTERS | functionCall | expression)     # ArrayAssign
  ;

usehooks
  : useState
  | useEffect
  | useRef
  ;

useEffect
  : USE_HOOK LPAREN LPAREN RPAREN ARROW LBRACE statement* RBRACE COMMA LBRACKET parameter_list RBRACKET RPAREN
  ;

/*//useRef
//  : CONST IDENTIFIER ASSIGN USE_HOOK LPAREN RPAREN SEMICOLON
//  ;*/
useRef
  : CONST IDENTIFIER ASSIGN USE_HOOK LPAREN data_type* RPAREN
  ;

useState
  : CONST LBRACKET IDENTIFIER COMMA IDENTIFIER RBRACKET ASSIGN USE_HOOK LPAREN data_type* RPAREN
  ;


//jsxStatement
jsxStatement
  : div
  | p
  | h1
  | h2
  | h3
  | h4
  | h5
  | h6
  | span
  | img
  | a
  | button
  | form
  | input
  | label
  | br
  | hr
  | video
  | audio
  | ul
  | ol
  | li
  | component
  ;


div
  : LESS_THAN DIV_TAG (attributes)* MORE_THAN jsxContent* LESS_THAN DIVIDE DIV_TAG MORE_THAN;

p
  : LESS_THAN PARAGRAPH_TAG (attributes)* MORE_THAN jsxContent* LESS_THAN DIVIDE PARAGRAPH_TAG MORE_THAN;

br
  : LESS_THAN BR_TAG (attributes)* DIVIDE MORE_THAN;

hr
  : LESS_THAN HR_TAG (attributes)* DIVIDE MORE_THAN;

h1
  : LESS_THAN H1_TAG (attributes)* MORE_THAN jsxContent* LESS_THAN DIVIDE H1_TAG MORE_THAN;

h2
  : LESS_THAN H2_TAG (attributes)* MORE_THAN jsxContent* LESS_THAN DIVIDE H2_TAG MORE_THAN;

h3
  : LESS_THAN H3_TAG (attributes)* MORE_THAN jsxContent* LESS_THAN DIVIDE H3_TAG MORE_THAN;

h4
  : LESS_THAN H4_TAG (attributes)* MORE_THAN jsxContent* LESS_THAN DIVIDE H4_TAG MORE_THAN;

h5
  : LESS_THAN H5_TAG (attributes)* MORE_THAN jsxContent* LESS_THAN DIVIDE H5_TAG MORE_THAN;

h6
  : LESS_THAN H6_TAG (attributes)* MORE_THAN jsxContent* LESS_THAN DIVIDE H6_TAG MORE_THAN;

span
  : LESS_THAN SPAN_TAG MORE_THAN jsxContent* LESS_THAN DIVIDE SPAN_TAG MORE_THAN;

img
  : LESS_THAN IMG_TAG (attributes)* srcAttr DIVIDE MORE_THAN;

a
  : LESS_THAN A_LINK_TAG (attributes)* hrefAttr MORE_THAN jsxContent* LESS_THAN DIVIDE A_LINK_TAG MORE_THAN;

hrefAttr
  : HREF ASSIGN ((JSX_IDENTIFIER) | STRING);

button
  : LESS_THAN BUTTON_TAG buttonAttr MORE_THAN jsxContent* LESS_THAN DIVIDE BUTTON_TAG MORE_THAN;

form
  : LESS_THAN FORM_TAG formAttr MORE_THAN jsxContent* LESS_THAN DIVIDE FORM_TAG MORE_THAN;
formAttr
  : ON_SUBMIT ASSIGN LBRACE LPAREN parameter_list RPAREN ARROW functionCall RBRACE
  | attributes*
  ;

buttonAttr
  : ON_CLICK ASSIGN LBRACE LPAREN parameter_list RPAREN ARROW LBRACE functionCall RBRACE RBRACE
  | attributes*;
input
  : LESS_THAN INPUT_TAG inputAttr* DIVIDE MORE_THAN;
inputAttr
  : TYPE ASSIGN ((JSX_IDENTIFIER) | STRING)
  | PLACE_HOLDER ASSIGN ((JSX_IDENTIFIER) | STRING)
  | VALUE ASSIGN ((JSX_IDENTIFIER) | STRING)
  ;

label
  : LESS_THAN LABEL_TAG (attributes)* MORE_THAN jsxContent* LESS_THAN DIVIDE LABEL_TAG MORE_THAN;

ul
  : LESS_THAN UL_TAG (attributes)* MORE_THAN jsxContent* LESS_THAN DIVIDE UL_TAG MORE_THAN;

ol
  : LESS_THAN OL_TAG (attributes)* MORE_THAN jsxContent* LESS_THAN DIVIDE OL_TAG MORE_THAN;

li
  : LESS_THAN LI_TAG (attributes)* MORE_THAN jsxContent* LESS_THAN DIVIDE LI_TAG MORE_THAN;

video
  : LESS_THAN VIDEO_TAG (mediaAttr)* MORE_THAN (source)* IDENTIFIER* LESS_THAN DIVIDE VIDEO_TAG MORE_THAN;

audio
  : LESS_THAN AUDIO_TAG (mediaAttr)* MORE_THAN (source)* IDENTIFIER* LESS_THAN DIVIDE AUDIO_TAG MORE_THAN;

mediaAttr
  : srcAttr | typeAttr | attributes;

source
  : LESS_THAN SOURCE_TAG (mediaAttr)* MORE_THAN;

srcAttr
  : SRC ASSIGN ((JSX_IDENTIFIER) | STRING);

typeAttr
  : TYPE ASSIGN ((JSX_IDENTIFIER) | STRING);

/*//attributes
//  : ((CLASSNAME | ID) ASSIGN ((JSX_IDENTIFIER) | STRING))
//  | REF JSX_IDENTIFIER
//  ;*/
attributes
  : ((CLASSNAME | ID) ASSIGN ((JSX_IDENTIFIER) | STRING))
  | REF ASSIGN JSX_IDENTIFIER
  ;
//calling my component
component
  : LESS_THAN IDENTIFIER props* DIVIDE MORE_THAN;

props
  : IDENTIFIER ASSIGN (JSX_IDENTIFIER | data_type)
  ;

jsxContent
  : jsxStatement
  | (LBRACE expression RBRACE)
  | text
  | ifStatement
  | switchStatement
  | whileStatement
  | doWhileStatement
  | forStatement
  | foreachStatement
  | mapStatement
  ;

text : IDENTIFIER+;
condition
  : comparison_list
  ;

//conditions
ifStatement
  : IF LPAREN condition RPAREN block (elseIf* else)?
  ;

elseIf
  : ELSEIF LPAREN condition RPAREN block
  ;

else
  : ELSE block
  ;

switchStatement
  : SWITCH LPAREN IDENTIFIER RPAREN switchBody
  ;

switchBody
  : LBRACE case+ defaultCase RBRACE
  ;

case
  : CASE number COLON caseBody          # NumberCase
  | CASE CHARACTERS COLON caseBody      # CharCase
  ;

defaultCase
  : DEFAULT COLON caseBody
  ;

caseBody
  : statement* (BREAK SEMICOLON)?
  ;

//loops
whileStatement
  : WHILE LPAREN condition RPAREN block
  ;

doWhileStatement
  : DO block WHILE LPAREN condition RPAREN SEMICOLON
  ;

forStatement
  : FOR LPAREN initialCondition SEMICOLON condition SEMICOLON increment RPAREN block
  ;

initialCondition
  : varModifier IDENTIFIER ASSIGN expression        # InitialConditionDeclaration
  | IDENTIFIER ASSIGN expression                    # InitialConditionAssignment
  | IDENTIFIER                                      # InitialConditionVariable
  ;
increment
  : IDENTIFIER ('+=' | '-=' | '*=' | '/=') expression
  | IDENTIFIER ('++' | '--')
  | ('++' | '--') IDENTIFIER
  ;

foreachStatement
  : FOREACH LPAREN (varModifier)? IDENTIFIER IN IDENTIFIER RPAREN block
  ;

mapStatement
  : LBRACE IDENTIFIER DOT MAP LPAREN LPAREN parameter_list RPAREN ARROW LBRACE RETURN LPAREN (block* | jsxStatement) RPAREN RBRACE RPAREN RBRACE
  ;


block
  : LBRACE statement* RBRACE
  ;

expression
  : expression MULTIPLY expression
  | expression DIVIDE expression
  | expression PLUS expression
  | expression MINUS expression
  | expression PLUS ASSIGN expression
  | expression MULTIPLY ASSIGN expression
  | expression MINUS ASSIGN expression
  | expression DIVIDE ASSIGN expression
  | IDENTIFIER (DOT IDENTIFIER)*
  | NUMERIC
  ;

comparison_list
  : (comparison (comparison_links comparison)*)?
  ;

comparison
  : IDENTIFIER logical_comparison expression
  ;

logical_comparison
  : LESS_THAN
  | MORE_THAN
  | LESS_THAN_OR_EQUAL_TO
  | MORE_THAN_OR_EQUAL_TO
  | EQUALS
  | STRICT_EQUALS
  | NOT_EQUALS
  | STRICT_NOT_EQUALS
  ;

comparison_links
  : LOGICAL_OR
  | LOGICAL_AND
  | LOGICAL_NOT
  ;

varModifier
  : VAR
  | LET
  | CONST
  ;

number
  : NUMERIC
  ;


// Keywords
IMPORT: 'import';
FROM: 'from';
AS: 'as';
DEFAULT: 'default';
EXPORT: 'export';
CLASS: 'class';
ID: 'id';
SRC: 'src';
HREF: 'href';
TITLE: 'title';
CLASSNAME: 'className';
FUNCTION: 'function';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
ELSEIF: 'else if';
SWITCH: 'switch';
CASE: 'case';
DO: 'do';
FOR: 'for';
WHILE: 'while';
BREAK: 'break';
FOREACH: 'foreach';
MAP: 'map';
CONTINUE: 'continue';
TRUE: 'true';
FALSE: 'false';
NULL: 'null';
THIS: 'this';
TRY: 'try';
CATCH: 'catch';
FINALLY: 'finally';
WITH: 'with';
DEBUGGER: 'debugger';
VAR: 'var';
CONST: 'const';
LET: 'let';
ENUM: 'enum';
ASYNC: 'async';
AWAIT: 'await';
CURRENT: 'current';
INSTANCE_OF: 'instanceof';
IN: 'in';
EXTEND: 'extends';
RENDER: 'render';
TYPE: 'type';

//operators
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';
INCREMENT: '++';
DECREMENT: '--';
LSHIFT: '<<';
RSHIFT: '>>';
BITWISE_AND: '&';
BITWISE_OR: '|';
BITWISE_XOR: '^';
LOGICAL_AND: '&&';
LOGICAL_OR: '||';
LOGICAL_NOT: '!';
ASSIGN: '=';
EQUALS: '==';
STRICT_EQUALS: '===';
NOT_EQUALS: '!=';
STRICT_NOT_EQUALS: '!==';
LESS_THAN: '<';
MORE_THAN: '>';
LESS_THAN_OR_EQUAL_TO: '<=';
MORE_THAN_OR_EQUAL_TO: '>=';

//jsx tag name
DIV_TAG: 'div';
PARAGRAPH_TAG: 'p';
H1_TAG: 'h1';
H2_TAG: 'h2';
H3_TAG: 'h3';
H4_TAG: 'h4';
H5_TAG: 'h5';
H6_TAG: 'h6';
SPAN_TAG: 'span';
IMG_TAG: 'img';
A_LINK_TAG: 'a';
BUTTON_TAG: 'button';
VIDEO_TAG: 'video';
AUDIO_TAG: 'audio';
UL_TAG: 'ul';
OL_TAG: 'ol';
LI_TAG: 'li';
SOURCE_TAG: 'source';
BR_TAG: 'br';
HR_TAG: 'hr';
FORM_TAG: 'form';
INPUT_TAG: 'input';
LABEL_TAG: 'label';

//attribute name
VALUE: 'value';
PLACE_HOLDER: 'placeholder';
ON_CLICK: 'onClick';
ON_SUBMIT: 'onSubmit';
REF: 'ref';

//hooks name
USE_HOOK: 'useState' | 'useEffect' | 'useRef';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';
ARROW: '=>';
DOT: '.';
COMMA: ',';
SEMICOLON: ';';
COLON: ':';
QUOTE: '"';
STRING: '"' (~'"' | '""')* '"';
NUMERIC: '-'? INT '.' INT | '-'? INT;
INT: '0' | [1-9][0-9]*;
NULL_VAL: NULL;


// Whitespace
WS: [ \t\n\r]+ -> skip;

// Comments
JsxComment: '{/*' .*? '*/}' -> skip;
LINE_COMMENT: '//'  ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*'.*? '*/' -> skip;



IDENTIFIER : [a-zA-Z_$][a-zA-Z_$0-9]* ;
JSX_IDENTIFIER: '{' (IDENTIFIER (DOT IDENTIFIER)*) '}' | '{'(IDENTIFIER'['(IDENTIFIER|NUMERIC)']') '}';
CHARACTERS: '\''[a-zA-Z0-9!@#$%^&*+_:,.\-=/]*'\'';


