grammar Hello;

/* Parser Rules */
mainnode 	  : sequencenode | statement ;

expr  : bracketnode
      | expr minusnode expr
	  | expr plusnode expr
	  | expr timesnode expr
      | varnode
      | intnode
	  ;

bexpr :	bracketnode
 	  | notnode bexpr
	  | bexpr andnode bexpr
	  | bexpr ornode bexpr
	  | expr lessernode expr
	  | expr equalnode expr
	  | boolnode
	  ;

sequencenode  : statement statement | statement sequencenode;

lessernode    : '<' ;
equalnode     : '==';

andnode       : '&&';
notnode		  : '!' ;
ornode		  : '||' ;

plusnode 	  : '+' ;
minusnode 	  : '-' ;
timesnode 	  : '*' ;

bracketnode   : '(' expr ')' | '(' bexpr ')';
blocknode	  : '{''}' | '{' sequencenode '}' | '{' statement '}' ;
assigmentnode : varnode ':=' expr ';';
statement 	  : assigmentnode | whilenode | ifnode;

ifnode 		  : 'if' bexpr 'then' blocknode 'else' blocknode ;

whilenode 	  :	'while' bexpr 'do' blocknode ;
boolnode 	  : BVAL ;
varnode 	  : VAR ;
intnode 	  : AVAL ;

/* Lexer Rules */
fragment NUMBER     : [0-9] ;
fragment STRING 	: [a-z]+ ;
WS 			     	: [ \t\r\n]+ -> skip ;
BVAL                : 'true' | 'false' ;
VAR 				: STRING ;
AVAL 				: NUMBER ;

