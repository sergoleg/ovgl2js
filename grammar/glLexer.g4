//----------------------------------------------------------------------
// Copyright (C) 2019 Oleg Sergeev [sergoleg@gmail.com]
//----------------------------------------------------------------------

/**
 * Ovation ® Graphics Language
 */

lexer grammar glLexer;

options {
	language=Java;
}

@lexer::header {
	package org.ops.ovation.mmi.gl;

	import org.ops.ovation.mmi.util.ColorWord;
}

@lexer::members {
	ColorWord color = new ColorWord();
	boolean ppf = false;	// PreProcessor Falag
}

// Keywords
//--------------------------------------------------

MAIN               :   ( M A I N )                     { if (! ppf) setText("\""+getText()+"\""); } ;
SUBWIN             :   ( S U B W I N )                 { if (! ppf) setText("\""+getText()+"\""); } ;
WINDOW             :   ( W I N D O W )                 { if (! ppf) setText("\""+getText()+"\""); } ;

ZOOMABLE           :   ( Z O O M A B L E )             { if (! ppf) setText("\""+getText()+"\""); } ;
NON_ZOOMABLE       :   ( N O N '_' Z O O M A B L E )   { if (! ppf) setText("\""+getText()+"\""); } ;

DEFAULT_POSITION   :   ( D E F A U L T '_' P O S I T I O N )   { if (! ppf) setText("\""+getText()+"\""); } ;
FIXED_POSITION     :   ( F I X E D '_' P O S I T I O N )       { if (! ppf) setText("\""+getText()+"\""); } ;

DEFAULT_SIZE       :   ( D E F A U L T '_' S I Z E )   { if (! ppf) setText("\""+getText()+"\""); } ;
FIXED_SIZE         :   ( F I X E D '_' S I Z E )       { if (! ppf) setText("\""+getText()+"\""); } ;

NOT_FITTED         :   ( N O T '_' F I T T E D )     { if (! ppf) setText("\""+getText()+"\""); } ;
FITTED             :   ( F I T T E D )               { if (! ppf) setText("\""+getText()+"\""); } ;

SCALE              :   ( S C A L E )                 { if (! ppf) setText("\""+getText()+"\""); } ;
NOSCALE            :   ( N O S C A L E )             { if (! ppf) setText("\""+getText()+"\""); } ;

BITMAP_OVER        :   ( B I T M A P '_' O V E R )   { if (! ppf) setText("\""+getText()+"\""); } ;
BITMAP             :   ( B I T M A P )               { if (! ppf) setText("\""+getText()+"\""); } ;
VECTOR_OVER        :   ( V E C T O R '_' O V E R )   { if (! ppf) setText("\""+getText()+"\""); } ;
VECTOR             :   ( V E C T O R )               { if (! ppf) setText("\""+getText()+"\""); } ;

RIGHT0             :   ( R I G H T '0' )             { if (! ppf) setText("\""+getText()+"\""); } ;
RIGHT              :   ( R I G H T )                 { if (! ppf) setText("\""+getText()+"\""); } ;
LEFT               :   ( L E F T )                   { if (! ppf) setText("\""+getText()+"\""); } ;
HEX_H              :   ( H E X '_' H )               { if (! ppf) setText("\""+getText()+"\""); } ;
HEX                :   ( H E X )                     { if (! ppf) setText("\""+getText()+"\""); } ;
BINARY             :   ( B I N A R Y )               { if (! ppf) setText("\""+getText()+"\""); } ;
EXPONENTIAL        :   ( E X P O N E N T I A L )     { if (! ppf) setText("\""+getText()+"\""); } ;
TECHNICAL          :   ( T E C H N I C A L )         { if (! ppf) setText("\""+getText()+"\""); } ;

HORZ               :   ( H O R Z )                   { if (! ppf) setText("\""+getText()+"\""); } ;
VERT               :   ( V E R T )                   { if (! ppf) setText("\""+getText()+"\""); } ;

NONE               :   ( N O N E )                   { if (! ppf) setText("\""+getText()+"\""); } ;
TTB                :   ( T T B )                     { if (! ppf) setText("\""+getText()+"\""); } ;
RTL                :   ( R T L )                     { if (! ppf) setText("\""+getText()+"\""); } ;
BOTH               :   ( B O T H )                   { if (! ppf) setText("\""+getText()+"\""); } ;

DOWN               :   ( D O W N )                   { if (! ppf) setText("\""+getText()+"\""); } ;
UP                 :   ( U P )                       { if (! ppf) setText("\""+getText()+"\""); } ;
BIAS               :   ( B I A S )                   { if (! ppf) setText("\""+getText()+"\""); } ;

SMALL              :   ( S M A L L )                 { if (! ppf) setText("\""+getText()+"\""); } ;
MEDIUM             :   ( M E D I U M )               { if (! ppf) setText("\""+getText()+"\""); } ;
LARGE              :   ( L A R G E )                 { if (! ppf) setText("\""+getText()+"\""); } ;

OPERATOR           :   ( O P E R A T O R )           { if (! ppf) setText("\""+getText()+"\""); } ;
PROGRAM            :   ( P R O G R A M )             { if (! ppf) setText("\""+getText()+"\""); } ;

ASCII              :   ( A S C I I )                 { if (! ppf) setText("\""+getText()+"\""); } ;
INT                :   ( I N T )                     { if (! ppf) setText("\""+getText()+"\""); } ;
REAL               :   ( R E A L )                   { if (! ppf) setText("\""+getText()+"\""); } ;
BYTE               :   ( B Y T E )                   { if (! ppf) setText("\""+getText()+"\""); } ;

ROUNDED            :   ( R O U N D E D )             { if (! ppf) setText("\""+getText()+"\""); } ;
SQUARED            :   ( S Q U A R E D )             { if (! ppf) setText("\""+getText()+"\""); } ;

OLNORMAL           :   ( O L N O R M A L )           { if (! ppf) setText("\""+getText()+"\""); } ;
INVOKED            :   ( I N V O K E D )             { if (! ppf) setText("\""+getText()+"\""); } ;

LINES              :   ( L I N E S )                 { if (! ppf) setText("\""+getText()+"\""); } ;
SHAPE_PLOT         :   ( S H A P E '_' P L O T )     { if (! ppf) setText("\""+getText()+"\""); } ;
SQUAREWAVE         :   ( S Q U A R E W A V E )       { if (! ppf) setText("\""+getText()+"\""); } ;

SHAPE_LABEL        :   ( S H A P E '_' L A B E L )   { if (! ppf) setText("\""+getText()+"\""); } ;
TEXT_LABEL         :   ( T E X T '_' L A B E L )     { if (! ppf) setText("\""+getText()+"\""); } ;

EXEC_TRIG          :   ( E X E C '_' T R I G )       { if (! ppf) setText("\""+getText()+"\""); } ;
EXEC_POKE          :   ( E X E C '_' P O K E )       { if (! ppf) setText("\""+getText()+"\""); } ;

POSITION           :   ( P O S I T I O N )           { if (! ppf) setText("\""+getText()+"\""); } ;
SIZE               :   ( S I Z E )                   { if (! ppf) setText("\""+getText()+"\""); } ;

FG                 :   ( F G )                       { if (! ppf) setText("\""+getText()+"\""); } ;
BG                 :   ( B G )                       { if (! ppf) setText("\""+getText()+"\""); } ;
ER                 :   ( E R )                       { if (! ppf) setText("\""+getText()+"\""); } ;
OL                 :   ( O L )                       { if (! ppf) setText("\""+getText()+"\""); } ;

//--------------------------------------------------

M_BACKGROUND       : ( I '_' B A C K G R O U N D ) ;
M_DIAGRAM          : ( I '_' D I A G R A M       ) ;
M_EXIT             : ( I '_' E X I T             ) ;
M_FOREGROUND       : ( I '_' F O R E G R O U N D ) ;
M_KEYBOARD         : ( I '_' K E Y B O A R D     ) ;
M_TRIGGER          : ( I '_' T R I G G E R       ) ;

L_BACKGROUND       : ( B A C K G R O U N D ) ;
L_DIAGRAM          : ( D I A G R A M       ) ;
L_EXIT             : ( E X I T             ) ;
L_FOREGROUND       : ( F O R E G R O U N D ) ;
L_KEYBOARD         : ( K E Y B O A R D     ) ;
L_TRIGGER          : ( T R I G G E R       ) ;

//--------------------------------------------------

CC_ARC             : ( A R C                            ) ;
CC_CIRCLE          : ( C I R C L E                      ) ;
CC_COLOR           : ( C O L O R                        ) ;
CC_BLINK           : ( B L I N K                        ) ;
CC_DYNAMIC_LINE    : ( D Y N A M I C '_' L I N E        ) ;
CC_DYNAMIC_POLYGON : ( D Y N A M I C '_' P O L Y G O N  ) ;
CC_ELLIPSE         : ( E L L I P S E                    ) ;
CC_LINE            : ( L I N E                          ) ;
CC_MULTI_TEXT      : ( M U L T I '_' T E X T            ) ;
CC_POLYGON         : ( P O L Y G O N                    ) ;
CC_PROCESS_PT      : ( P R O C E S S '_' P T            ) ;
CC_RECTANGLE       : ( R E C T A N G L E                ) ;
CC_SHAPE           : ( S H A P E                        ) ;
CC_TEXT            : ( T E X T                          ) ;
CC_TRIG_ON         : ( T R I G '_' O N                  ) ;

//--------------------------------------------------

C_BAR             : ( B A R                             ) ;
C_CURSOR          : ( C U R S O R                       ) ;
C_DATE            : ( D A T E                           ) ;
C_DEF_FKEY_GROUP  : ( D E F '_' F K E Y '_' G R O U P   ) ;
C_DEF_QUAL        : ( D E F '_' Q U A L                 ) ;
C_DIAG_DISP       : ( D I A G '_' D I S P               ) ;
C_DOT             : ( D O T                             ) ;
C_EF_STATE        : ( E F '_' S T A T E                 ) ;
C_ELSE            : ( E L S E                           ) ;
C_ENDIF           : ( E N D I F                         ) ;
C_ENDLOOP         : ( E N D L O O P                     ) ;
C_ENTRY_FLD       : ( E N T R Y '_' F L D               ) ;
C_FKEY_STATE      : ( F K E Y '_' S T A T E             ) ;
C_FORCE_UPDATE    : ( F O R C E '_' U P D A T E         ) ;
C_FORMAT          : ( F O R M A T                       ) ;
C_FUNC_KEY        : ( F U N C '_' K E Y                 ) ;
C_GCODE           : ( G C O D E                         ) ;
C_GTEXT           : ( G T E X T                         ) ;
C_IF              : ( I F                               ) ;
C_IF_CHANGED      : ( I F '_' C H A N G E D             ) ;
C_IF_ENDIF        : ( I F '_' E N D I F                 ) ;
C_IFELSE          : ( I F E L S E                       ) ;
C_LOAD_FKEY_GROUP : ( L O A D '_' F K E Y '_' G R O U P ) ;
C_LOOP            : ( L O O P                           ) ;

C_MACRO           : ( M A C R O                         ) ;
C_DEF_MACRO       : ( D E F '_' M A C R O               ) ;

C_DEF_MACRO_PARAMS : ( D E F '_' M A C R O '_' P A R A M S ) ;

C_SET_MACRO_BB    : ( S E T '_' M A C R O '_' B B       ) ;
C_END_MACRO       : ( E N D '_' M A C R O               ) ;

C_MATH            : ( M A T H                           ) ;
C_OL_BUTTON       : ( O L '_' B U T T O N               ) ;
C_OL_CHECKBOX     : ( O L '_' C H E C K B O X           ) ;
C_OL_CHOICE       : ( O L '_' C H O I C E               ) ;
C_OL_CYLINDER     : ( O L '_' C Y L I N D E R           ) ;
C_OL_EVENT_MENU   : ( O L '_' E V E N T '_' M E N U     ) ;
C_OL_GAUGE        : ( O L '_' G A U G E                 ) ;
C_OL_RECTANGLE    : ( O L '_' R E C T A N G L E         ) ;
C_OL_SLIDER       : ( O L '_' S L I D E R               ) ;
C_P_ENDLOOP       : ( P '_' E N D L O O P               ) ;
C_P_ENDLP         : ( P '_' E N D L P                   ) ;
C_PAGE            : ( P A G E                           ) ;
C_PLOT            : ( P L O T                           ) ;
C_POINTER         : ( P O I N T E R                     ) ;
C_POKE_FLD        : ( P O K E '_' F L D                 ) ;
C_POKE_STATE      : ( P O K E '_' S T A T E             ) ;
C_PTR_EQUAL       : ( P T R '_' E Q U A L               ) ;
C_PTR_LOOP        : ( P T R '_' L O O P                 ) ;
C_PTR_MOVE        : ( P T R '_' M O V E                 ) ;
C_PTR_VALUE       : ( P T R '_' V A L U E               ) ;
C_RUN_PROGRAMS    : ( R U N '_' P R O G R A M S         ) ;
C_SETVAL          : ( S E T V A L                       ) ;
C_TIME            : ( T I M E                           ) ;
C_TREND           : ( T R E N D                         ) ;
C_XY_PLOT         : ( X Y '_' P L O T                   ) ;

C_SHAPELIB        : ( S H A P E L I B                   ) ;
C_DEF_SHAPE       : ( D E F '_' S H A P E               ) ;
C_END_SHAPE       : ( E N D '_' S H A P E               ) ;

C_FONT            : ( F O N T                           ) ;

//--------------------------------------------------

WEQUALS	: ( W '=' );
HEQUALS	: ( H '=' );
XEQUALS	: ( X '=' );
YEQUALS	: ( Y '=' );

//--------------------------------------------------

EXP  : ( E       ) ;
SQRT : ( S Q R T ) ;
LOG  : ( L N     ) ;
COS  : ( C O S   ) ;
SIN  : ( S I N   ) ;
TAN  : ( T A N   ) ;
ASIN : ( A S I N ) ;
ACOS : ( A C O S ) ;
ATAN : ( A T A N ) ;

//--------------------------------------------------

LineFillPattern
	: (
	  ( A S T E R I S K S )
	| ( B A C K '_' S L A S H )
	| ( B I G '_' D O T S )
	| ( B L O C K S )
	| ( D A S H '_' D O T )
	| ( D A S H E D )
	| ( D O T '_' D A S H )
	| ( D O T T E D )
	| ( H O R Z '_' S L A S H )
	| ( N E A R '_' S O L I D )
	| ( S L A S H )
	| ( S M '_' D A S H )
	| ( S O L I D )
	| ( S P A R S E )
	| ( U N F I L L E D )
	| ( V E R T '_' S L A S H )
	| ( W E S T '_' L O G O )
	| ( O U T L I N E )
	| ( A L U M I N U M )
	  )
	  { if (! ppf) setText("\""+getText().toUpperCase()+"\""); }
	;

//--------------------------------------------------

BlinkPattern
	: (
	  ( O N )		{ if (! ppf) setText("1"); }
	| ( T R U E )	{ if (! ppf) setText("1"); }
	| ( O F F )		{ if (! ppf) setText("0"); }
	| ( F A L S E )	{ if (! ppf) setText("0"); }
	  )
	;

//--------------------------------------------------

FontStyleRegular :    ( R E G U L A R ) ;
FontStyleBoldItalic : ( B O L D '_' I T A L I C ) ;
FontStyleItalic :     ( I T A L I C ) ;
FontStyleBold :       ( B O L D ) ;

//--------------------------------------------------

Color
	: (
	  ( A L I C E B L U E )
	| ( A N T I Q U E W H I T E )      ('1'..'4')?
	| ( A Q U A M A R I N E )          ('1'..'4')?
	| ( A Z U R E )                    ('1'..'4')?
	| ( B E I G E )
	| ( B I S Q U E )                  ('1'..'4')?
	| ( B L A C K )
	| ( B L A N C H E D A L M O N D )
	| ( B L U E )                      ('1'..'4')?
	| ( B L U E V I O L E T )
	| ( B R O W N )                    ('1'..'4')?
	| ( B U R L Y W O O D )            ('1'..'4')?
	| ( C A D E T B L U E )            ('1'..'4')?
	| ( C H A R T R E U S E )          ('1'..'4')?
	| ( C H O C O L A T E )            ('1'..'4')?
	| ( C O R A L )                    ('1'..'4')?
	| ( C O R N F L O W E R B L U E )
	| ( C O R N S I L K )              ('1'..'4')?
	| ( C Y A N )                      ('1'..'4')?
	| ( D A R K B L U E )
	| ( D A R K C Y A N )
	| ( D A R K G O L D E N R O D )    ('1'..'4')?
	| ( D A R K G R A Y )
	| ( D A R K G R E E N )
	| ( D A R K G R E Y )
	| ( D A R K K H A K I )
	| ( D A R K M A G E N T A )
	| ( D A R K O L I V E G R E E N )  ('1'..'4')?
	| ( D A R K O R A N G E )          ('1'..'4')?
	| ( D A R K O R C H I D )          ('1'..'4')?
	| ( D A R K R E D )
	| ( D A R K S A L M O N )
	| ( D A R K S E A G R E E N )      ('1'..'4')?
	| ( D A R K S L A T E B L U E )
	| ( D A R K S L A T E G R A Y )    ('1'..'4')?
	| ( D A R K S L A T E G R E Y )
	| ( D A R K T U R Q U O I S E )
	| ( D A R K V I O L E T )
	| ( D E E P P I N K )              ('1'..'4')?
	| ( D E E P S K Y B L U E )        ('1'..'4')?
	| ( D I M G R A Y )
	| ( D I M G R E Y )
	| ( D O D G E R B L U E )          ('1'..'4')?
	| ( F I R E B R I C K )            ('1'..'4')?
	| ( F L O R A L W H I T E )
	| ( F O R E S T G R E E N )
	| ( G A I N S B O R O )
	| ( G H O S T W H I T E )
	| ( G O L D )                      ('1'..'4')?
	| ( G O L D E N R O D )            ('1'..'4')?
	| ( G R A Y )                      ('0'..'9')*
	| ( G R E E N )                    ('1'..'4')?
	| ( G R E E N Y E L L O W )
	| ( G R E Y )                      ('0'..'9')*
	| ( H O N E Y D E W )              ('1'..'4')?
	| ( H O T P I N K )                ('1'..'4')?
	| ( I N D I A N R E D )            ('1'..'4')?
	| ( I V O R Y )                    ('1'..'4')?
	| ( K H A K I )                    ('1'..'4')?
	| ( L A V E N D E R )
	| ( L A V E N D E R B L U S H )    ('1'..'4')?
	| ( L A W N G R E E N )
	| ( L E M O N C H I F F O N )      ('1'..'4')?
	| ( L I G H T B L U E )            ('1'..'4')?
	| ( L I G H T C O R A L )
	| ( L I G H T C Y A N )            ('1'..'4')?
	| ( L I G H T G O L D E N R O D )  ('1'..'4')?
	| ( L I G H T G O L D E N R O D Y E L L O W )
	| ( L I G H T G R A Y )
	| ( L I G H T G R E E N )
	| ( L I G H T G R E Y )
	| ( L I G H T P I N K )            ('1'..'4')?
	| ( L I G H T S A L M O N )        ('1'..'4')?
	| ( L I G H T S E A G R E E N )
	| ( L I G H T S K Y B L U E )      ('1'..'4')?
	| ( L I G H T S L A T E B L U E )
	| ( L I G H T S L A T E G R A Y )
	| ( L I G H T S L A T E G R E Y )
	| ( L I G H T S T E E L B L U E )  ('1'..'4')?
	| ( L I G H T Y E L L O W )        ('1'..'4')?
	| ( L I M E G R E E N )
	| ( L I N E N )
	| ( M A G E N T A )                ('1'..'4')?
	| ( M A R O O N )                  ('1'..'4')?
	| ( M E D I U M A Q U A M A R I N E )
	| ( M E D I U M B L U E )
	| ( M E D I U M O R C H I D )      ('1'..'4')?
	| ( M E D I U M P U R P L E )      ('1'..'4')?
	| ( M E D I U M S E A G R E E N )
	| ( M E D I U M S L A T E B L U E )
	| ( M E D I U M S P R I N G G R E E N )
	| ( M E D I U M T U R Q U O I S E )
	| ( M E D I U M V I O L E T R E D )
	| ( M I D N I G H T B L U E )
	| ( M I N T C R E A M )
	| ( M I S T Y R O S E )            ('1'..'4')?
	| ( M O C C A S I N )
	| ( N A V A J O W H I T E )        ('1'..'4')?
	| ( N A V Y )
	| ( N A V Y B L U E )
	| ( O L '_'C O L O R '_')          ('0'..'4')+
	| ( O L D L A C E )
	| ( O L I V E D R A B )            ('1'..'4')?
	| ( O R A N G E )                  ('1'..'4')?
	| ( O R A N G E R E D )            ('1'..'4')?
	| ( O R C H I D )                  ('1'..'4')?
	| ( P A L E G O L D E N R O D )
	| ( P A L E G R E E N )            ('1'..'4')?
	| ( P A L E T U R Q U O I S E )    ('1'..'4')?
	| ( P A L E V I O L E T R E D )    ('1'..'4')?
	| ( P A P A Y A W H I P )
	| ( P E A C H P U F F )            ('1'..'4')?
	| ( P E R U )
	| ( P I N K )                      ('1'..'4')?
	| ( P L U M )                      ('1'..'4')?
	| ( P O W D E R B L U E )
	| ( P U R P L E )                  ('1'..'4')?
	| ( R E D )                        ('1'..'4')?
	| ( R O S Y B R O W N )            ('1'..'4')?
	| ( R O Y A L B L U E )            ('1'..'4')?
	| ( S A D D L E B R O W N )
	| ( S A L M O N )                  ('1'..'4')?
	| ( S A N D Y B R O W N )
	| ( S E A G R E E N )              ('1'..'4')?
	| ( S E A S H E L L )              ('1'..'4')?
	| ( S I E N N A )                  ('1'..'4')?
	| ( S K Y B L U E )                ('1'..'4')?
	| ( S L A T E B L U E )            ('1'..'4')?
	| ( S L A T E G R A Y )            ('1'..'4')?
	| ( S L A T E G R E Y )
	| ( S N O W )                      ('1'..'4')?
	| ( S P R I N G G R E E N )        ('1'..'4')?
	| ( S T E E L B L U E )            ('1'..'4')?
	| ( T A N )                        ('1'..'4')?
	| ( T H I S T L E )                ('1'..'4')?
	| ( T O M A T O )                  ('1'..'4')?
	| ( T U R Q U O I S E )            ('1'..'4')?
	| ( V I O L E T )
	| ( V I O L E T R E D )            ('1'..'4')?
	| ( W H E A T )                    ('1'..'4')?
	| ( W H I T E )
	| ( W H I T E S M O K E )
	| ( Y E L L O W )                  ('1'..'4')?
	| ( Y E L L O W G R E E N )
	  )
/*	  { if (! ppf) setText("\""+color.getColorCode(getText().toUpperCase())+"\""); } */
	  { if (! ppf) setText(     color.getColorCode(getText().toUpperCase())     ); }
	;

// record field
//--------------------------------------------------

RecordField
	: (
	  ( A '2')	| ( A '3')	| ( A H )	| ( A S )	| ( A V )

	| ( A P )	// добавлено 07.08.2019

	| ( B '0' ) | ( B '1' ) | ( B '2' ) | ( B '3' ) | ( B '4' ) | ( B '5' ) | ( B '6' ) | ( B '7' ) | ( B '8' ) | ( B '9' )
	| ( B B )	| ( B D )	| ( B I )	| ( B O )	| ( B S )	| ( B V )	| ( B Z )
	| ( C '9' )	| ( C M )
	| ( D '1' )	| ( D '3' )	| ( D '7')	| ( D O )	| ( D R )	| ( D S )

	| ( D B ) | ( D J )	// добавлено 16.01.2021

	| ( E '0' ) | ( E '6' )	| ( E D )	| ( E U )	| ( E V )
	| ( F '9' )	| ( F A )	| ( F B )	| ( F C )	| ( F K )	| ( F L )	| ( F M )	| ( F O )	| ( F S )
	| ( H C )	| ( H L )	| ( H S )	| ( H W )
	| ( I C )	| ( I D )	| ( I E )	| ( I S )
	| ( K '0' )	| ( K '1' )	| ( K M )	| ( L B )
	| ( L C )	| ( L L )	| ( L S )	| ( L U )
	| ( M M )	| ( M N )
	| ( N E )	| ( N N )
	| ( O E )	| ( O P )
	| ( P A )	| ( P N )	| ( P S )
	| ( R S )	| ( R T )	| ( R '1' )	| ( R '2' )	| ( R '3' )
	| ( S T )
	| ( T B )	| ( T G )	| ( T R )	| ( T S )	| ( T V )	| ( T Y )
	| ( V E )
	| ( Z H )	| ( Z L )	| ( Z Y )
	| ('1' W )	| ('2' W )	| ('3' W )
	| ( X '0' ) | ( X '1' ) | ( X '2' ) | ( X '3' ) | ( X '4' ) | ( X '5' ) | ( X '6' ) | ( X '7' ) | ( X '8' ) | ( X '9' )
	  )
	  { if (! ppf) setText("\""+getText().toUpperCase()+"\""); }
	;

// pointer
//--------------------------------------------------

Gpointer : ( ('$' G) ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().replace("G", "G[")+"]");
	} ;	// $G - GROUP POINTER, $G1 ... $G250

/*
 * Указатели $H (магистральные указатели)
 * Указатели “$H” (допустимый диапазон = $H1 - $H99) используются для косвенного
 * определения точек базы данных путем обращения к системному идентификатору,
 * хранящемуся в памяти компьютера операторской станции. Необходимым
 * предварительным условием использования указателей $H является то, что при
 * инициализации указателя $H в памяти с помощью команды POINTER или PTR_EQUAL
 * следует указать системный идентификатор, хранящийся где-либо в памяти компьютера.
 * Пользователю следует убедиться в том, что указатель $H нацелен на системный
 * идентификатор точки базы данных; в противном случае указатель $H не будет работать.
 * Поскольку указатели $Н обозначают фактические точки базы данных, то если на графике
 * требуется пара: имя точки/поле записи, используйте с ними стандартные
 * двухсимвольные ASCII поля записи точки (например: AV, RS, 1W и т.д.).
 */

Hpointer : ( ('$' H) ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().replace("H", "H[")+"]");
	} ;	// $H - HIGHWAY POINTER, $H1 ... $H99

Wpointer : ( ('$' W) ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().replace("W", "W[")+"]");
	} ;	// $W - WINDOW POINTER, $W1 ... $W99
Dpointer : ( ('$' D) ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().replace("D", "D[")+"]");
	} ;	// $D - MACRO POINTER, $D1 ... $D99
Ppointer : ( ('$' P) ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().replace("P", "P[")+"]");
	} ;	// $P - SCRATCH PAD POINTER, $P1 ... $P99
Spointer : ( ('$' S) ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().replace("S", "S[")+"]");
	} ;	// $S - ENTRY FIELD POINTER, $S1 ... $S99
Opointer : ( ('$' O) ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().replace("O", "O[")+"]");
	} ;	// $O - ONSCREEN POINTER, $O1 ... $O99

// offset
//--------------------------------------------------

Ioffset :  ( ('$' I) ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().replace("I", "I[")+"]");
	} ;	// $In - represents a 32-bit integer beginning at an offset of n bytes; n must be on a 32-bit boundary (for example, $I0,$I4,$I8,...)
Roffset :  ( ('$' R) ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().replace("R", "R[")+"]");
	} ;	// $Rn - represents a 32-bit floating real record field beginning at an offset of n bytes; n must be on a 32-bit boundary (for example, $R0,$R4,$R8,...)
Boffset :  ( ('$' B) ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().replace("B", "B[")+"]");
	} ;	// $Bn - represents a byte at an offset of n bytes (for example, $B0,$B1,$B2,...)
Soffset :  ( ('$' S) ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().replace("S", "S[")+"]");
	} ;	// $Sn - represents a 16-bit integer beginning at an offset of n bytes; n must be on a 16-bit boundary (for example, $S0,$S2,$S4,...)
Aoffset :  ( ('$' A) ('0'..'9')+ 'X' ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().substring(0, getText().indexOf("X")).replace("A", "A[")+"]");
	} ;	// $AnXl - represents an ASCII string of length l beginning at an offset of n bytes. where: n = (0 through 32,767) and l = (0 through 255)

// status
//--------------------------------------------------

StatusWord
	: ( W O R S E )
	| ( U P D A T E T I M E )
	| ( T O G G L E )
	| ( S E T A L M )
	| ( S E T )
	| ( S E N S O R M O D E )
	| ( S E N S O R A L M )
	| ( S C A N O F F )
	| ( R E S E T A L M )
	| ( R E S E T )
	| ( P S E T ('0'..'9') ('0'..'9')? )
	| ( P R E S E T ('0'..'9') ('0'..'9')? )
	| ( P O O R )
	| ( O P A T T N )
	| ( O N ('0'..'9') ('0'..'9')? )
	| ( O F F ('0'..'9') ('0'..'9')? )
	| ( N O R M A L )
	| ( M C B ('0'..'1') O F F L I N )
	| ( L O W A L A R M )
	| ( L I M I T O F F )
	| ( H I G H A L A R M )
	| ( H D W R F A I L )
	| ( G O O D )
	| ( F A I R )
	| ( E N T E R V A L U E )
	| ( D R O P F A U L T )
	| ( D R O P C L E A R )
	| ( D R O P A L M )
	| ( C U T O U T )
	| ( B E T T E R )
	| ( B A D )
	| ( A L A R M O F F )
	| ( A L A R M A C K )
	| ( A L A R M )
	;

//--------------------------------------------------

CaseExp    : ( '(CASE)' ) ;					// Выражение выбора
QualityExp : ( '(QUALITY)' ) ;				// Выражения качества
SetExp     : ( '(SET' ('0'..'9')+ ')' )		// Установочное выражение
					{ if (! ppf)
						setText(getText().toUpperCase().replace("SET", "SET[")+"]");
					} ;

//--------------------------------------------------

SetVariable    : ( ('$')? (S E T) ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().replace("SET", "SET[")+"]");
	} ;

ConstVariable  : ( '$' (C O N S T) ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().replace("CONST", "CONST[")+"]");
	} ;

// добавлено 07.08.2019
ColorVariable  : ( '$' (C O L O R) ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().replace("COLOR", "COLOR[")+"]");
	} ;

StatusVariable : ( '$STATUS' ('0'..'9')+ )
	{ if (! ppf)
		setText(getText().toUpperCase().replace("STATUS", "STATUS[")+"]");
	} ;

// Separators
//--------------------------------------------------

LPAREN  : '(' ;
RPAREN  : ')' ;
LBRACE  : '{' ;
RBRACE  : '}' ;

// PositiveRelativeValue : ('[' '+') ;
// NegativeRelativeValue : ('[' '-') ;

LBRACKET: '[' ;
RBRACKET: ']' ;

COMMA   : ',' ;
STAR    : '*' ;

// Operators
//--------------------------------------------------
OP_ADD  : ( A D D ) ;
OP_SUB  : ( S U B ) ;
OP_MULT : ( M U L T ) ;

OR          : (O R)   ;
AND         : (A N D) ;
EOR         : (E O R) ;

EQUALS      : '='  ;
NOTEQUALS   : '<>' ;
LT          : '<'  ;
LTEQ        : '<=' ;
GT          : '>'  ;
GTEQ        : '>=' ;

PLUS        : '+'  ;
MINUS       : '-'  ;

MULT        : { getCharPositionInLine() >= 5 }? '*' ;
DIV         : '/';
MOD         : '%';

EXPONENT    : '^';
NOT         : (N O T);

// Integer Literals
//--------------------------------------------------

IntegerLiteral
	: DecimalIntegerLiteral
	| HexIntegerLiteral
	| OctalIntegerLiteral
	| BinaryIntegerLiteral
	;

fragment DecimalIntegerLiteral   : DecimalNumeral IntegerTypeSuffix? ;
fragment HexIntegerLiteral       : HexNumeral IntegerTypeSuffix? ;
fragment OctalIntegerLiteral     : OctalNumeral IntegerTypeSuffix? ;
fragment BinaryIntegerLiteral    : BinaryNumeral IntegerTypeSuffix? ;
fragment IntegerTypeSuffix       : [lL] ;
fragment DecimalNumeral          : '0' | NonZeroDigit (Digits? | Underscores Digits) ;
fragment Digits                  : Digit (DigitOrUnderscore* Digit)? ;
fragment Digit                   : '0' | NonZeroDigit ;
fragment NonZeroDigit            : [1-9] ;
fragment DigitOrUnderscore       : Digit | '_' ;
fragment Underscores             : '_'+ ;
fragment HexNumeral              : '0' [xX] HexDigits ;
fragment HexDigits               : HexDigit (HexDigitOrUnderscore* HexDigit)? ;
fragment HexDigit                : [0-9a-fA-F] ;
fragment HexDigitOrUnderscore    : HexDigit | '_' ;
fragment OctalNumeral            : '0' Underscores? OctalDigits ;
fragment OctalDigits             : OctalDigit (OctalDigitOrUnderscore* OctalDigit)? ;
fragment OctalDigit              : [0-7] ;
fragment OctalDigitOrUnderscore  : OctalDigit | '_' ;
fragment BinaryNumeral           : '0' [bB] BinaryDigits ;
fragment BinaryDigits            : BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)? ;
fragment BinaryDigit             : [01] ;
fragment BinaryDigitOrUnderscore : BinaryDigit | '_' ;

// Floating-Point Literals
//--------------------------------------------------

FloatingPointLiteral
	: DecimalFloatingPointLiteral
	| HexadecimalFloatingPointLiteral
	;

fragment DecimalFloatingPointLiteral     : Digits [.,] Digits? ExponentPart? FloatTypeSuffix? | [.,] Digits ExponentPart? FloatTypeSuffix? | Digits ExponentPart FloatTypeSuffix? | Digits FloatTypeSuffix ;
fragment ExponentPart                    : ExponentIndicator SignedInteger ;
fragment ExponentIndicator               : [eE] ;
fragment SignedInteger                   : Sign? Digits ;
fragment Sign                            : [+-] ;
fragment FloatTypeSuffix                 : [fFdD] ;
fragment HexadecimalFloatingPointLiteral : HexSignificand BinaryExponent FloatTypeSuffix? ;
fragment HexSignificand                  : HexNumeral [.,]? | '0' [xX] HexDigits? [.,] HexDigits ;
fragment BinaryExponent                  : BinaryExponentIndicator SignedInteger ;
fragment BinaryExponentIndicator         : [pP] ;

// String Literals
//--------------------------------------------------

StringLiteral
	: '"' ( '$' T ('0'..'9')+ ) [ ]* '"'
		{ if (! ppf)
			setText(getText().toUpperCase().replace(" ", "").replace("\"", "").replace("T", "T[") + "]");
		}
	| '"' StringCharacters? '"'                   // DoubleQuotedString
	| '\'' ( '$' '\''? | ~('$' | '\'') )* '\''    // SingleQuotedString
		{ if (! ppf)
			setText(getText().replace("\"", "\\\"").replace("\'", "\""));
		}
	;

fragment StringCharacters : StringCharacter+ ;
//fragment StringCharacter : ~["\\] | EscapeSequence ;	// модифицировано 07.08.2019
fragment StringCharacter : ~["] | EscapeSequence ;

// Escape Sequences for Character and String Literals
//----------------------------------------------------

fragment EscapeSequence : '\\' [btnfr"'\\] | OctalEscape | UnicodeEscape ;
fragment OctalEscape    : '\\' OctalDigit | '\\' OctalDigit OctalDigit | '\\' ZeroToThree OctalDigit OctalDigit ;
fragment UnicodeEscape  : '\\' 'u' HexDigit HexDigit HexDigit HexDigit ;
fragment ZeroToThree    : [0-3] ;

/* 
 * Полностью допустимое для системы Ovation имя точки имеет следующий формат:
 * “имя.блок@сеть”
 * 
 * Символы в сегменте "имя" могут представлять собой любую комбинацию букв, цифр (0 -
 * 9) или специальных знаков пунктуации. В имени запрещается использовать символы: *, ,
 * @, ., %, $, ~, \, “, ‘, запятая, пробел. Обратите внимание, что символы “.” и “@” входят в
 * состав полностью допустимого имени точки, но их запрещается применять в сегменте
 * "имя". Сегмент "имя" не может быть словом графики (например: RECTANGLE, COLOR,
 * UP, HORZ и др.). Сегменты "блок" и "сеть" полностью допустимого имени точки должны
 * состоять только из букв и цифр.
 * 
 * Регистр при вводе имен точек не учитывается. То есть имя “Testai01.unit1@wdpf”
 * аналогично имени “TESTAI01.UNIT1@WDPF”.
 */

// “pointname.unit@network”
//--------------------------------------------------

PointName
	: '\\' ( NamePortion )? ('.' UnitPortion '@' NetworkPortion)? '\\'
		{ if (! ppf)
//			setText(getText().toUpperCase().replace("\\", "\"").replace(".CCS@W3", ""));
			setText(getText().toUpperCase().replace("\\", "\"").replace(".W3@LAW", "").replace(".W3@BASTROP", "").replace(".W3@WATERFD", ""));
		}
	| ( D R O P ('0'..'9')+ )
		{ if (! ppf)
			setText("\""+getText()+"\"");
		}
	;

fragment NamePortion	: ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9') | ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')+ ;
fragment UnitPortion	: ('a'..'z'|'A'..'Z'|'0'..'9')+ ;
fragment NetworkPortion	: ('a'..'z'|'A'..'Z'|'0'..'9')+ ;

// The Null Literal
//--------------------------------------------------

NullLiteral		: 'null'	;

// Identifiers (must appear after all keywords in the grammar)
//-------------------------------------------------------------

Identifier
	: ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')+
		{ if (! ppf) setText("\""+getText()+"\""); }
	;

ID
	: ('a'..'z' | 'A'..'Z')
		{ if (! ppf) setText("\""+getText()+"\""); }
	;

// Whitespace and comments
// Unicode Character 'LINE TABULATION' (U+000B)
//--------------------------------------------------

LineComment		:	{ getCharPositionInLine() < 5 }? ('*' ~[\r\n]* ( ('\r' ? '\n') | EOF) )	-> channel(HIDDEN) ;
BlockComment	:	'/*' .*? ( '*/' | EOF )													-> channel(HIDDEN) ;
Whitespace		:	[ \u000B\t\r\n]+														-> channel(HIDDEN) ;

fragment A:('a'|'A'); fragment B:('b'|'B'); fragment C:('c'|'C'); fragment D:('d'|'D');
fragment E:('e'|'E'); fragment F:('f'|'F'); fragment G:('g'|'G'); fragment H:('h'|'H');
fragment I:('i'|'I'); fragment J:('j'|'J'); fragment K:('k'|'K'); fragment L:('l'|'L');
fragment M:('m'|'M'); fragment N:('n'|'N'); fragment O:('o'|'O'); fragment P:('p'|'P');
fragment Q:('q'|'Q'); fragment R:('r'|'R'); fragment S:('s'|'S'); fragment T:('t'|'T');
fragment U:('u'|'U'); fragment V:('v'|'V'); fragment W:('w'|'W'); fragment X:('x'|'X');
fragment Y:('y'|'Y'); fragment Z:('z'|'Z');

// [EOF] glLexer.g4
