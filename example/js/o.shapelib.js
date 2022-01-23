/**
 * shapelib - ANTLR parser
 * 
 * используется только 32 фигуры
 */
var shapeliblist = [ 'ARROW1', 'ARROW2', 'DFDBKR', 'DFDCONT', 'DMPRO', 'FAN',
		'HEATER', 'HORZPMP', 'MED71', 'VEK04', 'VLVSTM1', 'VLVSTM2',
		'arrow2left', 'arrow4down', 'arrow4left', 'arrow4righ', 'arrow4up',
		'barscale', 'dfda1', 'dfda2', 'dfda3', 'dfda4', 'dfdgen', 'dfdxfmr',
		'diapump', 'fwpmp', 'nvalve', 'oriface', 'pmpmtr', 'pumpfill3',
		'valve1', 'valve5' ];

var shapelib = {
	valve1 : {
/*		make : 'sPOLYGON(trgt,4,[0,0,248,248],[0,382,0,382],1,"SOLID","SOLID");',	*/
//		make : 'sPOLYGON(trgt,3,[0,0,124],[0,382,191],1,"SOLID","SOLID");sPOLYGON(trgt,3,[124,248,248],[191,0,382],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,3,[0,0,124],[0,382,191],1,"SOLID","SOLID");sPOLYGON(trgt,3,[124,248,248],[191,0,382],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	valve5 : {
/*		make : 'sPOLYGON(trgt,4,[0,0,275,275],[273,634,273,634],1,"SOLID","SOLID");sLINE(trgt,2,[136,136],[445,138],1,"SOLID");sPOLYGON(trgt,32,[34,37,41,44,49,57,66,74,84,92,102,110,119,125,129,137,146,154,162,169,175,181,190,200,205,211,215,222,224,227,230,233],[130,113,98,82,68,52,39,29,20,13,8,4,2,1,0,0,1,3,6,9,13,20,28,37,47,56,65,80,91,102,116,130],1,"SOLID","SOLID");',	*/
//		make : 'sPOLYGON(trgt,3,[0,0,136],[273,634,454],1,"SOLID","SOLID");sPOLYGON(trgt,3,[136,275,275],[454,273,634],1,"SOLID","SOLID");sLINE(trgt,2,[136,136],[445,138],1,"SOLID");sPOLYGON(trgt,32,[34,37,41,44,49,57,66,74,84,92,102,110,119,125,129,137,146,154,162,169,175,181,190,200,205,211,215,222,224,227,230,233],[130,113,98,82,68,52,39,29,20,13,8,4,2,1,0,0,1,3,6,9,13,20,28,37,47,56,65,80,91,102,116,130],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,3,[0,0,136],[273,634,454],1,"SOLID","SOLID");sPOLYGON(trgt,3,[136,275,275],[454,273,634],1,"SOLID","SOLID");sLINE(trgt,2,[136,136],[445,138],1,"SOLID");sPOLYGON(trgt,32,[34,37,41,44,49,57,66,74,84,92,102,110,119,125,129,137,146,154,162,169,175,181,190,200,205,211,215,222,224,227,230,233],[130,113,98,82,68,52,39,29,20,13,8,4,2,1,0,0,1,3,6,9,13,20,28,37,47,56,65,80,91,102,116,130],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	VLVSTM1 : {
//		make : 'sLINE(trgt,2,[99,99],[600,300],1,"SOLID");sRECTANGLE(trgt,0,0,198,300,1,"SOLID","UNFILLED");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sLINE(trgt,2,[99,99],[600,300],1,"SOLID");sRECTANGLE(trgt,0,0,198,300,1,"SOLID","UNFILLED");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	VLVSTM2 : {
//		make : 'sLINE(trgt,2,[99,99],[400,100],1,"SOLID");sPOLYGON(trgt,32,[0,3,7,10,15,23,32,40,50,58,68,76,85,91,95,103,112,120,128,135,141,147,156,166,171,177,181,188,190,193,196,199],[130,113,98,82,68,52,39,29,20,13,8,4,2,1,0,0,1,3,6,9,13,20,28,37,47,56,65,80,91,102,116,130],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sLINE(trgt,2,[99,99],[400,100],1,"SOLID");sPOLYGON(trgt,32,[0,3,7,10,15,23,32,40,50,58,68,76,85,91,95,103,112,120,128,135,141,147,156,166,171,177,181,188,190,193,196,199],[130,113,98,82,68,52,39,29,20,13,8,4,2,1,0,0,1,3,6,9,13,20,28,37,47,56,65,80,91,102,116,130],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	// seqblok:{make:'sELLIPSE(trgt,4259,5522,4259,5522,1,"SOLID","UNFILLED");',x0:0,y0:0},
	// seqactv:{make:'sELLIPSE(trgt,4259,5522,4259,5522,1,"SOLID","UNFILLED");',x0:0,y0:0},
	// hedactv:{make:'sRECTANGLE(trgt,0,0,1271,822,3,"SOLID","UNFILLED");',x0:0,y0:0},
	// VLVSTM3:{make:'sLINE(trgt,2,[114,114],[671,213],1,"SOLID");sLINE(trgt,2,[18,219],[193,193],1,"SOLID");sRECTANGLE(trgt,0,0,228,374,1,"SOLID","UNFILLED");',x0:0,y0:0},
	// CANVPMP:{make:'sRECTANGLE(trgt,748,258,110,282,1,"SOLID","VERT_SLASH");sRECTANGLE(trgt,63,262,110,282,1,"SOLID","VERT_SLASH");sLINE(trgt,2,[862,862],[184,627],1,"SOLID");sLINE(trgt,2,[58,58],[188,631],1,"SOLID");sLINE(trgt,2,[920,920],[184,627],1,"SOLID");sLINE(trgt,2,[0,0],[188,631],1,"SOLID");sELLIPSE(trgt,462,398,288,398,1,"SOLID","OUTLINE");',x0:0,y0:0},
	// valve:{make:'sPOLYGON(trgt,7,[0,0,0,481,0,0,0],[1794,1794,2990,2392,1794,1794,1794],1,"SOLID","SOLID");sPOLYGON(trgt,7,[962,962,962,480,962,962,962],[2990,2990,1794,2392,2990,2990,2990],1,"SOLID","SOLID");sLINE(trgt,4,[481,481,481,481],[2392,598,598,598],1,"SOLID");sARC(trgt,3,0,962,1196,180,-180,1,"SOLID","SOLID");',x0:0,y0:0},
	RARROW1 : {
//		make : 'sLINE(trgt,4,[0,632,474,474],[259,259,518,518],1,"SOLID");sLINE(trgt,2,[632,474],[259,0],1,"SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sLINE(trgt,4,[0,632,474,474],[259,259,518,518],1,"SOLID");sLINE(trgt,2,[632,474],[259,0],1,"SOLID");
			return trgt;
		},
		x0 : 47,
		y0 : 301
	},
	// ARROW0:{make:'sLINE(trgt,3,[0,426,426],[265,265,265],3,"SOLID");sPOLYGON(trgt,4,[289,442,289,289],[468,265,0,0],1,"SOLID","SOLID");',x0:0,y0:0},
	// arrow2:{make:'sLINE(trgt,3,[0,426,426],[0,0,0],3,"SOLID");',x0:0,y0:0},
	// valve2:{make:'sPOLYGON(trgt,4,[0,0,275,275],[411,772,411,772],1,"SOLID","SOLID");sLINE(trgt,2,[138,138],[585,329],1,"SOLID");sRECTANGLE(trgt,46,81,173,237,1,"SOLID","UNFILLED");sPOLYGON(trgt,32,[45,47,50,54,59,66,73,81,89,97,104,111,120,125,130,136,144,153,159,166,170,177,184,192,198,202,205,212,214,217,220,222],[74,62,58,48,37,32,22,16,13,8,4,3,1,0,0,0,0,2,4,5,8,13,15,19,26,34,37,43,52,59,63,74],1,"SOLID","SOLID");',x0:0,y0:0},
	// valve3:{make:'sPOLYGON(trgt,4,[0,0,278,278],[453,811,453,811],1,"SOLID","SOLID");sLINE(trgt,2,[139,139],[625,354],1,"SOLID");sRECTANGLE(trgt,32,0,212,327,1,"SOLID","UNFILLED");',x0:0,y0:0},
	// valve4:{make:'sPOLYGON(trgt,4,[0,0,275,275],[273,634,273,634],1,"SOLID","SOLID");sLINE(trgt,2,[136,136],[445,138],1,"SOLID");sPOLYGON(trgt,32,[34,37,41,44,49,57,66,74,84,92,102,110,119,125,129,137,146,154,162,169,175,181,190,200,205,211,215,222,224,227,230,233],[130,113,98,82,68,52,39,29,20,13,8,4,2,1,0,0,1,3,6,9,13,20,28,37,47,56,65,80,91,102,116,130],1,"SOLID","SOLID");sPOLYGON(trgt,3,[54,226,140],[687,687,464],1,"SOLID","SOLID");',x0:0,y0:0},
	// heater:{make:'sELLIPSE(trgt,493,409,265,409,1,"SOLID","UNFILLED");sELLIPSE(trgt,495,2577,265,409,1,"SOLID","UNFILLED");sLINE(trgt,2,[978,699],[1092,661],1,"SOLID");sLINE(trgt,2,[695,976],[2315,1884],1,"SOLID");sLINE(trgt,2,[3,284],[1099,668],1,"SOLID");sLINE(trgt,2,[494,494],[818,2165],1,"SOLID");sLINE(trgt,2,[279,1],[2323,1892],1,"SOLID");sLINE(trgt,3,[978,978,978],[1094,1879,1879],1,"SOLID");sLINE(trgt,3,[0,0,0],[1102,1887,1887],1,"SOLID");',x0:0,y0:0},
	// pump1:{make:'sLINE(trgt,17,[581,533,495,477,444,416,400,395,394,394,403,426,461,495,530,556,579],[133,180,224,255,322,409,482,555,627,680,754,825,896,949,980,1004,1020],1,"SOLID");sRECTANGLE(trgt,585,129,665,895,1,"SOLID","UNFILLED");sLINE(trgt,3,[1136,1205,1205],[1028,1250,1250],1,"SOLID");sLINE(trgt,3,[709,641,641],[1028,1250,1250],1,"SOLID");sLINE(trgt,2,[1202,643],[1255,1255],1,"SOLID");sARC(trgt,964,118,469,917,77,-154,1,"SOLID","UNFILLED");sLINE(trgt,3,[396,174,174],[604,604,604],5,"SOLID");sLINE(trgt,2,[174,174],[134,1076],1,"SOLID");sLINE(trgt,2,[1,1],[134,1076],1,"SOLID");sARC(trgt,0,930,176,272,6,-192,1,"SOLID","UNFILLED");sARC(trgt,1,0,176,272,353,192,1,"SOLID","UNFILLED");',x0:0,y0:0},
	oriface : {
//		make : 'sLINE(trgt,2,[0,0],[0,516],1,"SOLID");sLINE(trgt,2,[134,134],[110,408],1,"SOLID");sLINE(trgt,2,[269,269],[0,516],1,"SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sLINE(trgt,2,[0,0],[0,516],1,"SOLID");sLINE(trgt,2,[134,134],[110,408],1,"SOLID");sLINE(trgt,2,[269,269],[0,516],1,"SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	// venturi:{make:'sLINE(trgt,2,[7,7],[6,520],1,"SOLID");sLINE(trgt,2,[513,513],[6,520],1,"SOLID");sARC(trgt,-277,-1559,1078,1664,241,56,1,"SOLID","UNFILLED");sARC(trgt,-279,425,1078,1664,61,56,1,"SOLID","UNFILLED");',x0:0,y0:0},
	// sprayer:{make:'sRECTANGLE(trgt,0,1,542,964,1,"SOLID","UNFILLED");sLINE(trgt,3,[264,264,264],[0,481,481],1,"SOLID");sLINE(trgt,2,[265,398],[484,690],1,"SOLID");sLINE(trgt,2,[263,396],[481,275],1,"SOLID");sLINE(trgt,2,[267,400],[481,481],1,"SOLID");sLINE(trgt,2,[263,394],[481,388],1,"SOLID");sLINE(trgt,2,[265,396],[483,576],1,"SOLID");',x0:0,y0:0},
	// cooler:{make:'sELLIPSE(trgt,340,525,340,525,1,"SOLID","UNFILLED");sLINE(trgt,3,[2,103,103],[517,517,381],1,"SOLID");sLINE(trgt,3,[673,572,572],[525,525,661],1,"SOLID");sLINE(trgt,2,[105,572],[385,662],1,"SOLID");',x0:0,y0:0},
	ARROW1 : {
//		make : 'sPOLYGON(trgt,3,[92,184,0],[0,174,174],1,"SOLID","SOLID");sLINE(trgt,2,[94,94],[169,408],1,"SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,3,[92,184,0],[0,174,174],1,"SOLID","SOLID");sLINE(trgt,2,[94,94],[169,408],1,"SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	ARROW2 : {
//		make : 'sPOLYGON(trgt,3,[92,184,0],[0,174,174],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,3,[92,184,0],[0,174,174],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	// halm:{make:'sLINE(trgt,5,[0,224,224,224,224],[0,0,253,0,0],1,"SOLID");',x0:0,y0:0},
	// hhalm:{make:'sLINE(trgt,5,[0,224,224,224,224],[0,0,253,0,0],1,"SOLID");sLINE(trgt,2,[121,121],[17,253],1,"SOLID");',x0:0,y0:0},
	HORZPMP : {
//		make : 'sLINE(trgt,2,[811,811],[0,539],1,"SOLID");sLINE(trgt,2,[753,753],[0,539],1,"SOLID");sPOLYGON(trgt,35,[753,269,211,163,124,92,48,22,3,0,3,3,26,55,70,94,141,188,244,279,323,388,422,454,483,510,532,554,574,593,620,642,650,650,753],[62,62,86,114,153,203,274,365,451,532,587,641,737,807,850,886,941,983,1009,1017,1030,1017,1002,983,963,938,908,882,847,807,741,648,548,444,444],1,"SOLID","SOLID");sARC(trgt,154,394,242,359,84,-169,1,"SOLID","OUTLINE");sARC(trgt,174,442,175,263,84,-169,1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sLINE(trgt,2,[811,811],[0,539],1,"SOLID");sLINE(trgt,2,[753,753],[0,539],1,"SOLID");sPOLYGON(trgt,35,[753,269,211,163,124,92,48,22,3,0,3,3,26,55,70,94,141,188,244,279,323,388,422,454,483,510,532,554,574,593,620,642,650,650,753],[62,62,86,114,153,203,274,365,451,532,587,641,737,807,850,886,941,983,1009,1017,1030,1017,1002,983,963,938,908,882,847,807,741,648,548,444,444],1,"SOLID","SOLID");sARC(trgt,154,394,242,359,84,-169,1,"SOLID","OUTLINE");sARC(trgt,174,442,175,263,84,-169,1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	// lalm:{make:'sLINE(trgt,4,[230,0,0,0],[254,254,254,254],1,"SOLID");sLINE(trgt,3,[230,230,230],[229,127,0],1,"SOLID");',x0:0,y0:254},
	// llalm:{make:'sLINE(trgt,4,[118,118,118,118],[0,253,0,0],1,"SOLID");sLINE(trgt,4,[230,0,0,0],[258,258,258,258],1,"SOLID");sLINE(trgt,3,[230,230,230],[233,131,4],1,"SOLID");',x0:0,y0:254},
	// lllalm:{make:'sLINE(trgt,4,[3,3,3,3],[0,253,0,0],1,"SOLID");sLINE(trgt,4,[118,118,118,118],[0,253,0,0],1,"SOLID");sLINE(trgt,4,[230,0,0,0],[258,258,258,258],1,"SOLID");sLINE(trgt,3,[230,230,230],[233,131,4],1,"SOLID");',x0:0,y0:254},
	// ARROW3:{make:'sPOLYGON(trgt,3,[92,184,0],[0,174,174],1,"SOLID","SOLID");sLINE(trgt,3,[77,77,77],[169,408,408],1,"SOLID");',x0:0,y0:0},
	arrow4up : {
//		make : 'sPOLYGON(trgt,3,[0,85,171],[232,0,232],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,3,[0,85,171],[232,0,232],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	arrow4down : {
//		make : 'sPOLYGON(trgt,3,[164,82,0],[0,254,0],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,3,[164,82,0],[0,254,0],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	arrow4left : {
//		make : 'sPOLYGON(trgt,3,[164,0,164],[254,127,0],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,3,[164,0,164],[254,127,0],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	arrow4righ : {
//		make : 'sPOLYGON(trgt,3,[0,164,0],[0,127,254],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,3,[0,164,0],[0,127,254],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	// valve6:{make:'sPOLYGON(trgt,4,[231,0,231,0],[0,0,432,432],1,"SOLID","SOLID");sLINE(trgt,2,[120,293],[216,217],1,"SOLID");sRECTANGLE(trgt,313,51,211,329,1,"SOLID","UNFILLED");',x0:0,y0:0},
	// arrow2down:{make:'sPOLYGON(trgt,4,[0,72,98,172],[0,181,181,0],1,"SOLID","SOLID");',x0:0,y0:0},
	arrow2left : {
//		make : 'sPOLYGON(trgt,4,[132,0,0,132],[0,102,152,254],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,4,[132,0,0,132],[0,102,152,254],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	// arrow2righ:{make:'sPOLYGON(trgt,4,[0,132,132,0],[0,102,152,254],1,"SOLID","SOLID");',x0:0,y0:0},
	// sorhi:{make:'sLINE(trgt,2,[0,107],[0,0],1,"SOLID");sLINE(trgt,2,[50,50],[0,231],1,"SOLID");',x0:0,y0:0},
	// sorlow:{make:'sLINE(trgt,2,[0,107],[231,231],1,"SOLID");sLINE(trgt,2,[50,50],[231,0],1,"SOLID");',x0:0,y0:0},
	// sorav:{make:'sLINE(trgt,2,[0,107],[89,89],1,"SOLID");sLINE(trgt,2,[54,54],[183,0],1,"SOLID");',x0:54,y0:71},
	// FISHVLV:{make:'sRECTANGLE(trgt,0,0,4669,12190,1,"SOLID","UNFILLED");',x0:198,y0:677},
	// VALVE6:{make:'sLINE(trgt,2,[200,200],[441,188],1,"SOLID");sPOLYGON(trgt,4,[0,400,400,0],[254,628,254,628],1,"SOLID","UNFILLED");sARC(trgt,-6,0,421,589,158,-137,1,"SOLID","UNFILLED");sLINE(trgt,2,[8,400],[188,188],1,"SOLID");',x0:203,y0:440},
	// VALBACTD:{make:'sRECTANGLE(trgt,0,0,228,27,1,"SOLID","SOLID");sLINE(trgt,2,[114,114],[27,1323],1,"SOLID");',x0:0,y0:0},
	// dummy:{make:'sELLIPSE(trgt,546,637,546,637,1,"SOLID","UNFILLED");',x0:0,y0:0},
	// fillvalve:{make:'sPOLYGON(trgt,5,[0,0,1056,1056,0],[0,1368,0,1368,0],1,"SOLID","SOLID");',x0:533,y0:687},
	// arrow1:{make:'sPOLYGON(trgt,6,[266,266,0,266,531,266],[558,240,240,0,240,240],1,"SOLID","UNFILLED");',x0:265,y0:555},
	// FILTER:{make:'sLINE(trgt,9,[0,105,230,422,614,808,986,1108,1231],[163,163,0,257,0,257,23,187,187],4,"SOLID");',x0:0,y0:0},
	// arrow1fill:{make:'sPOLYGON(trgt,6,[266,266,0,266,531,266],[558,240,240,0,240,240],1,"SOLID","SOLID");sRECTANGLE(trgt,246,242,40,318,1,"SOLID","SOLID");',x0:250,y0:529},
	// arrow2fill:{make:'sPOLYGON(trgt,4,[0,310,619,0],[505,0,505,505],1,"SOLID","SOLID");',x0:328,y0:472},
	// fillvalve2:{make:'sPOLYGON(trgt,5,[0,0,451,451,0],[0,505,0,505,0],1,"SOLID","SOLID");',x0:228,y0:249},
	nvalve : {
//		make : 'sLINE(trgt,4,[1056,1056,0,0],[0,1216,0,1216],2,"SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sLINE(trgt,4,[1056,1056,0,0],[0,1216,0,1216],2,"SOLID");
			return trgt;
		},
		x0 : 517,
		y0 : 587
	},
	nvalve1 : {
//		make : 'sLINE(trgt,4,[419,419,0,0],[0,456,0,456],2,"SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sLINE(trgt,4,[419,419,0,0],[0,456,0,456],2,"SOLID");
			return trgt;
		},
		x0 : 207,
		y0 : 223
	},
	// valvetop:{make:'sARC(trgt,-4,0,303,482,161,-143,2,"SOLID","SOLID");sLINE(trgt,2,[0,288],[150,150],2,"SOLID");sLINE(trgt,2,[144,123],[658,152],3,"SOLID");',x0:127,y0:533},
	// valvetop1:{make:'sARC(trgt,-4,0,303,482,161,-143,2,"SOLID","SOLID");sLINE(trgt,2,[0,288],[150,150],2,"SOLID");sLINE(trgt,2,[143,139],[585,178],3,"SOLID");',x0:127,y0:533},
	// tiebreaker:{make:'sLINE(trgt,2,[379,379],[261,759],2,"SOLID");sLINE(trgt,2,[379,379],[2023,1526],2,"SOLID");sLINE(trgt,3,[282,379,476],[409,255,409],2,"SOLID");sLINE(trgt,3,[475,379,283],[1875,2028,1875],2,"SOLID");sLINE(trgt,3,[202,242,282],[1049,1301,1049],2,"SOLID");sELLIPSE(trgt,381,1142,381,606,2,"SOLID","UNFILLED");sARC(trgt,72,686,583,928,52,-105,2,"SOLID","UNFILLED");sLINE(trgt,3,[281,378,475],[154,0,154],2,"SOLID");sLINE(trgt,3,[281,378,475],[2136,2290,2136],2,"SOLID");',x0:377,y0:5},
	// tiebank:{make:'sARC(trgt,319,0,318,506,90,180,2,"SOLID","UNFILLED");sARC(trgt,-159,10,318,506,90,-180,2,"SOLID","UNFILLED");sARC(trgt,319,505,318,506,90,180,2,"SOLID","UNFILLED");sARC(trgt,-159,515,318,506,90,-180,2,"SOLID","UNFILLED");sARC(trgt,319,1012,318,506,90,180,2,"SOLID","UNFILLED");sARC(trgt,-159,1021,318,506,90,-180,2,"SOLID","UNFILLED");sARC(trgt,319,1518,318,506,90,180,2,"SOLID","UNFILLED");sARC(trgt,-159,1528,318,506,90,-180,2,"SOLID","UNFILLED");',x0:2,y0:1015},
	// tiebank1:{make:'sARC(trgt,468,-199,156,398,0,-180,1,"SOLID","UNFILLED");sARC(trgt,312,-199,156,398,0,-180,1,"SOLID","UNFILLED");sARC(trgt,156,-199,156,398,0,-180,1,"SOLID","UNFILLED");sARC(trgt,0,-199,156,398,0,-180,1,"SOLID","UNFILLED");',x0:280,y0:28},
	// vlvsol:{make:'sLINE(trgt,8,[0,0,304,608,608,304,0,0],[0,508,254,508,0,254,0,0],1,"SOLID");',x0:0,y0:0},
	// cb:{make:'sLINE(trgt,2,[98,98],[261,759],2,"SOLID");sLINE(trgt,2,[98,98],[2023,1526],2,"SOLID");sLINE(trgt,3,[1,98,195],[409,255,409],2,"SOLID");sLINE(trgt,3,[194,98,2],[1875,2028,1875],2,"SOLID");sARC(trgt,-209,686,583,928,52,-105,2,"SOLID","UNFILLED");sLINE(trgt,3,[0,97,194],[154,0,154],2,"SOLID");sLINE(trgt,3,[0,97,194],[2136,2290,2136],2,"SOLID");',x0:0,y0:0},
	// poke:{make:'sPOLYGON(trgt,4,[1,173,352,1],[0,449,0,0],1,"SOLID","SOLID");sLINE(trgt,2,[0,353],[1,3],2,"SOLID");sLINE(trgt,2,[0,173],[3,451],2,"SOLID");sLINE(trgt,2,[175,352],[448,3],2,"SOLID");',x0:0,y0:0},
	// breakerin:{make:'sLINE(trgt,2,[98,98],[0,498],2,"SOLID");sLINE(trgt,2,[98,98],[3363,2841],2,"SOLID");sLINE(trgt,3,[0,97,194],[682,528,682],2,"SOLID");sLINE(trgt,3,[0,97,194],[2664,2818,2664],2,"SOLID");',x0:0,y0:1},
	// breakerout:{make:'sLINE(trgt,3,[0,97,194],[154,0,154],2,"SOLID");sLINE(trgt,3,[0,97,194],[3119,3273,3119],2,"SOLID");',x0:0,y0:0},
	// breaker:{make:'sLINE(trgt,2,[379,379],[6,504],2,"SOLID");sLINE(trgt,2,[379,379],[1768,1271],2,"SOLID");sLINE(trgt,3,[282,379,476],[154,0,154],2,"SOLID");sLINE(trgt,3,[475,379,283],[1620,1773,1620],2,"SOLID");sELLIPSE(trgt,381,887,381,606,2,"SOLID","UNFILLED");sARC(trgt,72,431,583,928,52,-105,2,"SOLID","UNFILLED");sLINE(trgt,3,[211,251,291],[761,1013,761],2,"SOLID");',x0:0,y0:0},
	// cb1:{make:'sLINE(trgt,2,[97,97],[6,504],2,"SOLID");sLINE(trgt,2,[97,97],[1768,1271],2,"SOLID");sLINE(trgt,3,[0,97,194],[154,0,154],2,"SOLID");sLINE(trgt,3,[193,97,1],[1620,1773,1620],2,"SOLID");sARC(trgt,-210,431,583,928,52,-105,2,"SOLID","UNFILLED");',x0:0,y0:0},
	// arrows:{make:'sPOLYGON(trgt,4,[0,149,297,0],[723,248,723,723],1,"SOLID","SOLID");sPOLYGON(trgt,4,[458,160,458,458],[476,237,0,476],1,"SOLID","SOLID");',x0:142,y0:218},
	// blkvlv:{make:'sPOLYGON(trgt,6,[179,179,368,368,197,197],[479,0,0,149,149,479],1,"SOLID","SOLID");sPOLYGON(trgt,5,[0,0,377,377,0],[249,697,249,697,249],1,"SOLID","SOLID");',x0:197,y0:464},
	// VERTPMP:{make:'sRECTANGLE(trgt,0,0,250,375,2,"SOLID","UNFILLED");sLINE(trgt,2,[117,117],[398,1498],2,"SOLID");sLINE(trgt,2,[204,31],[1508,1508],2,"SOLID");sLINE(trgt,2,[235,141],[865,865],2,"SOLID");sLINE(trgt,2,[297,297],[702,1030],2,"SOLID");sLINE(trgt,2,[250,250],[702,1030],2,"SOLID");',x0:0,y0:0},
	DMPRO : {
//		make : 'sRECTANGLE(trgt,0,0,218,775,2,"SOLID","UNFILLED");sLINE(trgt,2,[109,109],[5,774],1,"SOLID");sLINE(trgt,2,[176,43],[79,79],1,"SOLID");sLINE(trgt,2,[176,43],[202,202],1,"SOLID");sLINE(trgt,2,[176,43],[325,325],1,"SOLID");sLINE(trgt,2,[175,42],[448,448],1,"SOLID");sLINE(trgt,2,[176,43],[571,571],1,"SOLID");sLINE(trgt,2,[176,43],[694,694],1,"SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sRECTANGLE(trgt,0,0,218,775,2,"SOLID","UNFILLED");sLINE(trgt,2,[109,109],[5,774],1,"SOLID");sLINE(trgt,2,[176,43],[79,79],1,"SOLID");sLINE(trgt,2,[176,43],[202,202],1,"SOLID");sLINE(trgt,2,[176,43],[325,325],1,"SOLID");sLINE(trgt,2,[175,42],[448,448],1,"SOLID");sLINE(trgt,2,[176,43],[571,571],1,"SOLID");sLINE(trgt,2,[176,43],[694,694],1,"SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	// TFILL:{make:'sPOLYGON(trgt,8,[0,497,497,294,294,202,202,0],[0,0,145,145,724,724,145,145],1,"SOLID","SOLID");',x0:0,y0:0},
	// TUNFILL:{make:'sPOLYGON(trgt,8,[0,497,497,295,295,203,203,0],[0,0,145,145,724,724,145,145],1,"SOLID","UNFILLED");',x0:262,y0:119},
	// DMPRC:{make:'sRECTANGLE(trgt,0,0,218,775,2,"SOLID","UNFILLED");sLINE(trgt,2,[99,99],[17,774],1,"SOLID");sLINE(trgt,2,[165,32],[51,156],1,"SOLID");sLINE(trgt,2,[165,32],[157,279],1,"SOLID");sLINE(trgt,2,[165,32],[280,386],1,"SOLID");sLINE(trgt,2,[165,32],[387,506],1,"SOLID");sLINE(trgt,2,[165,32],[506,612],1,"SOLID");sLINE(trgt,2,[165,32],[613,719],1,"SOLID");',x0:0,y0:0},
	// nrvlv:{make:'sLINE(trgt,4,[65,65,352,352],[157,0,0,151],2,"SOLID");sPOLYGON(trgt,8,[194,194,131,131,279,279,215,215],[526,150,151,93,93,150,151,529],1,"SOLID","SOLID");sLINE(trgt,4,[359,359,0,0],[307,714,307,714],2,"SOLID");sPOLYGON(trgt,6,[19,228,228,387,228,228],[894,894,795,894,992,894],1,"SOLID","SOLID");sRECTANGLE(trgt,18,887,208,15,1,"SOLID","SOLID");',x0:0,y0:0},
	// blkchk:{make:'sLINE(trgt,4,[363,363,0,0],[286,699,286,699],2,"SOLID");sPOLYGON(trgt,6,[3,215,215,375,215,215],[881,881,781,881,980,881],1,"SOLID","SOLID");sRECTANGLE(trgt,2,874,211,15,1,"SOLID","SOLID");sPOLYGON(trgt,6,[176,176,365,365,194,194],[479,0,0,149,149,479],1,"SOLID","SOLID");',x0:191,y0:483},
	// erv:{make:'sARC(trgt,0,404,207,330,48,140,2,"SOLID","UNFILLED");sARC(trgt,111,49,271,431,243,120,2,"SOLID","UNFILLED");sPOLYGON(trgt,7,[318,31,175,31,318,175,318],[888,888,431,0,0,431,888],1,"SOLID","SOLID");',x0:175,y0:429},
	// BYPASS:{make:'sPOLYGON(trgt,4,[0,0,278,0],[262,715,489,262],1,"SOLID","SOLID");sPOLYGON(trgt,4,[278,138,415,278],[489,944,944,489],1,"SOLID","SOLID");sARC(trgt,76,0,414,541,161,-143,2,"SOLID","SOLID");sLINE(trgt,2,[288,288],[571,178],3,"SOLID");',x0:282,y0:527},
	// vlv1:{make:'sPOLYGON(trgt,7,[0,0,360,720,720,360,0],[323,915,619,915,323,619,323],1,"SOLID","SOLID");sRECTANGLE(trgt,185,237,353,381,1,"SOLID","SOLID");sPOLYGON(trgt,8,[354,354,250,250,494,494,388,388],[256,34,34,0,0,34,34,258],1,"SOLID","SOLID");',x0:350,y0:552},
	// regvlv:{make:'sARC(trgt,40,229,556,844,161,-143,2,"SOLID","SOLID");sLINE(trgt,4,[332,332,812,428],[304,0,0,1064],2,"SOLID");sLINE(trgt,2,[327,327],[1120,506],3,"SOLID");sPOLYGON(trgt,5,[617,617,0,0,617],[1344,770,1344,770,1344],1,"SOLID","SOLID");',x0:310,y0:972},
	// vlv3:{make:'sARC(trgt,3,0,473,627,19,143,2,"SOLID","SOLID");sLINE(trgt,2,[241,241],[191,560],3,"SOLID");sPOLYGON(trgt,3,[241,128,354],[531,883,883],1,"SOLID","SOLID");sPOLYGON(trgt,5,[0,0,484,484,0],[741,316,741,316,741],1,"SOLID","SOLID");',x0:259,y0:524},
	// airfan:{make:'sPOLYGON(trgt,7,[358,977,977,698,631,549,439],[0,4,417,417,212,90,27],2,"SOLID","SOLID");sARC(trgt,345,239,425,629,186,-98,1,"SOLID","SOLID");sARC(trgt,116,571,425,629,186,-98,1,"SOLID","SOLID");sARC(trgt,125,-54,425,631,6,-98,1,"SOLID","SOLID");sARC(trgt,-106,278,425,631,6,-98,1,"SOLID","SOLID");sELLIPSE(trgt,351,549,351,549,2,"SOLID","UNFILLED");',x0:335,y0:587},
	pumpfill3 : {
//		make : 'sPOLYGON(trgt,35,[497,172,135,104,79,59,31,14,2,0,2,2,17,35,45,60,90,120,156,178,207,248,270,290,309,326,340,354,367,379,396,410,415,415,496],[0,0,15,33,58,90,136,194,249,301,337,372,433,478,506,529,564,591,608,613,621,613,603,591,578,562,543,526,504,478,436,376,312,245,245],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,35,[497,172,135,104,79,59,31,14,2,0,2,2,17,35,45,60,90,120,156,178,207,248,270,290,309,326,340,354,367,379,396,410,415,415,496],[0,0,15,33,58,90,136,194,249,301,337,372,433,478,506,529,564,591,608,613,621,613,603,591,578,562,543,526,504,478,436,376,312,245,245],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 202,
		y0 : 306
	},
	// pump3:{make:'sPOLYGON(trgt,35,[539,186,147,113,86,64,34,14,2,0,2,2,18,38,50,65,97,129,170,193,223,269,292,314,335,354,368,384,397,412,429,445,450,450,539],[0,0,16,38,65,99,150,215,275,334,373,412,478,529,560,586,624,654,673,679,687,679,668,654,639,621,602,582,558,529,482,416,345,301,301],1,"SOLID","UNFILLED");',x0:202,y0:306},
	// valvetop3:{make:'sARC(trgt,-4,0,303,482,161,-143,2,"SOLID","SOLID");sLINE(trgt,2,[0,288],[150,150],2,"SOLID");sLINE(trgt,2,[127,127],[533,77],3,"SOLID");',x0:118,y0:490},
	// fan:{make:'sRECTANGLE(trgt,0,0,358,1176,2,"SOLID","UNFILLED");sPOLYGON(trgt,4,[43,290,43,290],[270,270,846,846],1,"SOLID","SOLID");sARC(trgt,41,51,251,418,189,-198,1,"SOLID","SOLID");sARC(trgt,41,661,251,462,170,198,1,"SOLID","SOLID");',x0:159,y0:579},
	// chkvlv:{make:'sLINE(trgt,4,[363,363,0,0],[0,413,0,413],2,"SOLID");sPOLYGON(trgt,6,[3,215,215,375,215,215],[595,595,495,595,694,595],1,"SOLID","SOLID");sRECTANGLE(trgt,2,588,211,15,1,"SOLID","SOLID");',x0:176,y0:193},
	// VLVCLOSED:{make:'sRECTANGLE(trgt,0,0,276,886,2,"SOLID","UNFILLED");sELLIPSE(trgt,137,430,91,128,1,"SOLID","SOLID");sLINE(trgt,2,[141,141],[20,861],2,"SOLID");',x0:134,y0:401},
	// VLVOPEN:{make:'sRECTANGLE(trgt,0,0,276,886,2,"SOLID","UNFILLED");sELLIPSE(trgt,140,419,91,128,1,"SOLID","SOLID");sLINE(trgt,2,[8,266],[5,881],2,"SOLID");',x0:0,y0:0},
	// VENTVLV:{make:'sARC(trgt,6,0,623,844,161,-143,2,"SOLID","SOLID");sLINE(trgt,2,[327,327],[891,277],3,"SOLID");sPOLYGON(trgt,5,[617,617,0,0,617],[1115,541,1115,541,1115],1,"SOLID","SOLID");',x0:310,y0:768},
	// vlv:{make:'sPOLYGON(trgt,7,[0,0,360,720,720,360,0],[0,592,296,592,0,296,0],1,"SOLID","SOLID");',x0:0,y0:0},
	// vlvplug:{make:'sPOLYGON(trgt,7,[0,0,360,720,720,360,0],[296,888,592,888,296,592,296],1,"SOLID","SOLID");sLINE(trgt,2,[360,360],[592,0],1,"SOLID");sELLIPSE(trgt,355,618,108,177,1,"SOLID","SOLID");',x0:0,y0:0},
	// vlsafety:{make:'sLINE(trgt,7,[576,252,576,252,576,360,360],[0,166,332,498,664,830,830],1,"SOLID");sPOLYGON(trgt,4,[0,0,360,0],[532,1124,828,532],1,"SOLID","SOLID");sPOLYGON(trgt,4,[360,180,540,360],[828,1420,1420,828],1,"SOLID","SOLID");',x0:0,y0:0},
	// vlvdiaph:{make:'sPOLYGON(trgt,7,[0,0,360,720,720,360,0],[296,888,592,888,296,592,296],1,"SOLID","SOLID");sELLIPSE(trgt,355,618,108,177,1,"SOLID","SOLID");sLINE(trgt,2,[180,540],[295,295],1,"SOLID");sARC(trgt,180,0,360,591,180,-180,1,"SOLID","SOLID");sLINE(trgt,2,[360,360],[592,296],2,"SOLID");',x0:0,y0:0},
	// vlvmotor:{make:'sLINE(trgt,3,[360,360,360],[0,888,888],1,"SOLID");sPOLYGON(trgt,5,[360,0,0,360,360],[0,0,296,296,296],1,"SOLID","SOLID");sPOLYGON(trgt,4,[720,720,360,720],[592,1184,888,592],1,"SOLID","SOLID");sPOLYGON(trgt,4,[360,540,180,360],[888,1480,1480,888],1,"SOLID","SOLID");',x0:0,y0:0},
	// vlvglobe:{make:'sPOLYGON(trgt,7,[0,0,360,720,720,360,0],[0,592,296,592,0,296,0],1,"SOLID","SOLID");sELLIPSE(trgt,355,322,108,177,1,"SOLID","SOLID");',x0:0,y0:0},
	// pumpposdsp:{make:'sLINE(trgt,3,[0,0,0],[0,1184,1184],1,"SOLID");sLINE(trgt,3,[0,900,900],[1184,1184,592],1,"SOLID");sLINE(trgt,2,[0,360],[0,0],1,"SOLID");sLINE(trgt,2,[360,360],[0,592],1,"SOLID");sLINE(trgt,2,[360,900],[592,592],1,"SOLID");sARC(trgt,47,83,252,414,135,-270,1,"SOLID","UNFILLED");',x0:0,y0:0},
	// VLVSOLV:{make:'sLINE(trgt,7,[576,252,576,252,576,360,360],[0,166,332,498,664,830,830],1,"SOLID");sPOLYGON(trgt,4,[0,0,360,0],[532,1124,828,532],1,"SOLID","SOLID");sPOLYGON(trgt,4,[360,180,540,360],[828,1420,1420,828],1,"SOLID","SOLID");',x0:0,y0:0},
	// SOLVLV:{make:'sLINE(trgt,7,[576,252,576,252,576,360,360],[0,166,332,498,664,830,830],1,"SOLID");sPOLYGON(trgt,4,[0,0,360,0],[532,1124,828,532],1,"SOLID","SOLID");sPOLYGON(trgt,4,[360,180,540,360],[828,1420,1420,828],1,"SOLID","SOLID");',x0:0,y0:0},
	// acb:{make:'sLINE(trgt,2,[0,0],[0,498],2,"SOLID");sLINE(trgt,2,[0,0],[1762,1265],2,"SOLID");sARC(trgt,-307,425,583,928,52,-105,2,"SOLID","UNFILLED");',x0:0,y0:0},
	// cuebox:{make:'sRECTANGLE(trgt,0,0,243,607,1,"SOLID","UNFILLED");',x0:0,y0:0},
	// dyn25c:{make:'sELLIPSE(trgt,192,311,192,311,1,"SOLID","UNFILLED");',x0:0,y0:0},
	// dyn25o:{make:'sELLIPSE(trgt,192,311,192,311,1,"SOLID","SOLID");',x0:0,y0:0},
	// dyn25i:{make:'sELLIPSE(trgt,192,311,192,311,1,"SOLID","UNFILLED");sPOLYGON(trgt,3,[127,190,237],[34,257,31],1,"SOLID","SOLID");sPOLYGON(trgt,3,[122,206,261],[586,383,589],1,"SOLID","SOLID");sPOLYGON(trgt,3,[56,142,4],[84,258,258],1,"SOLID","SOLID");sPOLYGON(trgt,3,[68,147,8],[531,364,364],1,"SOLID","SOLID");sPOLYGON(trgt,3,[309,242,369],[84,258,258],1,"SOLID","SOLID");sPOLYGON(trgt,3,[321,246,373],[504,364,364],1,"SOLID","SOLID");',x0:0,y0:0},
	// vlv9xxxx:{make:'sLINE(trgt,5,[0,0,384,384,0],[0,288,0,288,0],1,"SOLID");',x0:0,y0:0},
	orifaceplt : {
//		make : 'sLINE(trgt,2,[174,0],[144,144],2,"SOLID");sLINE(trgt,2,[570,396],[144,144],2,"SOLID");sLINE(trgt,6,[570,426,144,0,144,426],[144,0,0,144,288,288],1,"SOLID");sLINE(trgt,2,[426,570],[288,144],1,"SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sLINE(trgt,2,[174,0],[144,144],2,"SOLID");sLINE(trgt,2,[570,396],[144,144],2,"SOLID");sLINE(trgt,6,[570,426,144,0,144,426],[144,0,0,144,288,288],1,"SOLID");sLINE(trgt,2,[426,570],[288,144],1,"SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	// cross:{make:'sLINE(trgt,2,[36,36],[0,132],1,"SOLID");sLINE(trgt,2,[0,71],[71,71],1,"SOLID");',x0:0,y0:0},
	// minus:{make:'sLINE(trgt,2,[0,70],[0,0],1,"SOLID");',x0:0,y0:0},
	// circlecap:{make:'sLINE(trgt,4,[310,166,166,310],[0,0,72,72],1,"SOLID");sLINE(trgt,4,[310,166,166,310],[892,892,964,964],1,"SOLID");sLINE(trgt,2,[310,310],[72,0],1,"SOLID");sLINE(trgt,2,[310,310],[964,892],1,"SOLID");sELLIPSE(trgt,241,480,241,411,1,"SOLID","UNFILLED");',x0:0,y0:0},
	// planpump:{make:'sLINE(trgt,2,[7,142],[1238,1012],1,"SOLID");sLINE(trgt,2,[673,538],[1238,1012],1,"SOLID");sLINE(trgt,2,[7,673],[1238,1238],1,"SOLID");sARC(trgt,0,0,686,1114,234,-289,1,"SOLID","UNFILLED");',x0:0,y0:0},
	// plnpump2:{make:'sLINE(trgt,2,[4,82],[709,580],1,"SOLID");sLINE(trgt,2,[392,313],[709,580],1,"SOLID");sLINE(trgt,2,[4,392],[709,709],1,"SOLID");sARC(trgt,0,0,399,638,234,-289,1,"SOLID","UNFILLED");',x0:0,y0:0},
	// tinycircle:{make:'sELLIPSE(trgt,60,97,60,97,1,"SOLID","SOLID");',x0:0,y0:0},
	// dyn01c:{make:'sPOLYGON(trgt,5,[99,99,476,476,99],[0,282,0,282,0],1,"SOLID","UNFILLED");sLINE(trgt,2,[0,0],[11,261],1,"SOLID");sLINE(trgt,2,[573,573],[11,261],1,"SOLID");',x0:0,y0:0},
	// dyn01p:{make:'sLINE(trgt,2,[0,573],[140,140],1,"SOLID");sLINE(trgt,5,[93,93,471,471,93],[0,282,0,282,0],1,"SOLID");sPOLYGON(trgt,4,[93,471,471,93],[0,282,141,141],1,"SOLID","SOLID");',x0:0,y0:0},
	// dyn01o:{make:'sPOLYGON(trgt,5,[99,99,476,476,99],[0,282,0,282,0],1,"SOLID","SOLID");sLINE(trgt,2,[0,573],[140,140],1,"SOLID");',x0:0,y0:0},
	// dyn01i:{make:'sPOLYGON(trgt,5,[99,99,476,476,99],[0,282,0,282,0],1,"SOLID","SOLID");sLINE(trgt,2,[0,0],[11,261],1,"SOLID");sLINE(trgt,2,[573,573],[11,261],1,"SOLID");',x0:0,y0:0},
	// dyn01c2:{make:'sPOLYGON(trgt,5,[99,99,476,476,99],[0,282,0,282,0],1,"SOLID","UNFILLED");sLINE(trgt,2,[0,0],[11,261],2,"SOLID");sLINE(trgt,2,[573,573],[11,261],2,"SOLID");',x0:0,y0:0},
	// dyn01p2:{make:'sLINE(trgt,2,[0,573],[140,140],2,"SOLID");sLINE(trgt,5,[93,93,471,471,93],[0,282,0,282,0],1,"SOLID");sPOLYGON(trgt,4,[93,471,471,93],[0,282,141,141],1,"SOLID","SOLID");',x0:0,y0:0},
	// dyn01o2:{make:'sPOLYGON(trgt,5,[99,99,476,476,99],[0,282,0,282,0],1,"SOLID","SOLID");sLINE(trgt,2,[0,573],[140,140],2,"SOLID");',x0:0,y0:0},
	// dyn01i2:{make:'sPOLYGON(trgt,5,[99,99,476,476,99],[0,282,0,282,0],1,"SOLID","SOLID");sLINE(trgt,2,[0,0],[11,261],2,"SOLID");sLINE(trgt,2,[573,573],[11,261],2,"SOLID");',x0:0,y0:0},
	// dyn06c:{make:'sLINE(trgt,5,[97,97,31,163,97],[426,240,168,72,0],1,"SOLID");sLINE(trgt,2,[472,472],[282,570],1,"SOLID");sLINE(trgt,2,[189,0],[1036,1036],1,"SOLID");sPOLYGON(trgt,6,[194,100,290,290,99,0],[714,429,572,287,426,714],1,"SOLID","UNFILLED");',x0:0,y0:0},
	// dyn06p:{make:'sLINE(trgt,6,[287,287,95,191,0,95],[283,571,427,715,715,427],1,"SOLID");sLINE(trgt,2,[95,287],[427,283],1,"SOLID");sPOLYGON(trgt,8,[95,189,96,287,287,95,95,95],[716,716,428,428,286,430,712,714],1,"SOLID","SOLID");sLINE(trgt,2,[472,293],[416,416],1,"SOLID");sLINE(trgt,2,[96,96],[1036,705],1,"SOLID");sLINE(trgt,5,[97,97,31,163,97],[426,240,168,72,0],1,"SOLID");',x0:0,y0:0},
	// dyn06o:{make:'sLINE(trgt,2,[472,293],[416,416],1,"SOLID");sLINE(trgt,2,[96,96],[1036,705],1,"SOLID");sLINE(trgt,5,[97,97,31,163,97],[426,240,168,72,0],1,"SOLID");sPOLYGON(trgt,6,[194,100,290,290,99,0],[714,429,572,287,426,714],1,"SOLID","SOLID");',x0:0,y0:0},
	// dyn06i:{make:'sLINE(trgt,5,[97,97,31,163,97],[426,240,168,72,0],1,"SOLID");sLINE(trgt,2,[472,472],[282,570],1,"SOLID");sLINE(trgt,2,[189,0],[1036,1036],1,"SOLID");sPOLYGON(trgt,6,[194,100,290,290,99,0],[714,429,572,287,426,714],1,"SOLID","SOLID");',x0:0,y0:0},
	barscale : {
//		make : 'sLINE(trgt,2,[92,92],[3613,0],1,"SOLID");sLINE(trgt,2,[31,151],[339,339],1,"SOLID");sLINE(trgt,2,[31,151],[686,686],1,"SOLID");sLINE(trgt,2,[31,151],[2147,2147],1,"SOLID");sLINE(trgt,2,[31,151],[1056,1056],1,"SOLID");sLINE(trgt,2,[31,151],[2517,2517],1,"SOLID");sLINE(trgt,2,[31,151],[2887,2887],1,"SOLID");sLINE(trgt,2,[31,151],[1425,1425],1,"SOLID");sLINE(trgt,2,[31,151],[3249,3249],1,"SOLID");sLINE(trgt,2,[0,190],[1793,1793],1,"SOLID");sLINE(trgt,2,[0,190],[0,0],1,"SOLID");sLINE(trgt,2,[0,190],[3613,3613],1,"SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sLINE(trgt,2,[92,92],[3613,0],1,"SOLID");sLINE(trgt,2,[31,151],[339,339],1,"SOLID");sLINE(trgt,2,[31,151],[686,686],1,"SOLID");sLINE(trgt,2,[31,151],[2147,2147],1,"SOLID");sLINE(trgt,2,[31,151],[1056,1056],1,"SOLID");sLINE(trgt,2,[31,151],[2517,2517],1,"SOLID");sLINE(trgt,2,[31,151],[2887,2887],1,"SOLID");sLINE(trgt,2,[31,151],[1425,1425],1,"SOLID");sLINE(trgt,2,[31,151],[3249,3249],1,"SOLID");sLINE(trgt,2,[0,190],[1793,1793],1,"SOLID");sLINE(trgt,2,[0,190],[0,0],1,"SOLID");sLINE(trgt,2,[0,190],[3613,3613],1,"SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	// arrow01D:{make:'sPOLYGON(trgt,4,[1587,0,3174,1587],[0,1055,1055,0],2,"SOLID","UNFILLED");',x0:0,y0:0},
	// PUMP01F:{make:'sPOLYGON(trgt,5,[456,0,0,152,456],[6,6,438,438,6],1,"SOLID","SOLID");sARC(trgt,155,0,637,905,177,275,1,"SOLID","SOLID");',x0:0,y0:0},
	// test:{make:'sRECTANGLE(trgt,525,1459,1145,2528,1,"SOLID","UNFILLED");sRECTANGLE(trgt,1181,2722,1051,2384,1,"SOLID","UNFILLED");sRECTANGLE(trgt,0,0,1051,2480,1,"SOLID","UNFILLED");',x0:1360,y0:1994},
	DMPROL : {
//		make : 'sRECTANGLE(trgt,0,0,218,772,2,"SOLID","UNFILLED");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sRECTANGLE(trgt,0,0,218,772,2,"SOLID","UNFILLED");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	// DMPRT:{make:'sLINE(trgt,2,[67,67],[0,708],1,"SOLID");sLINE(trgt,2,[133,0],[34,139],1,"SOLID");sLINE(trgt,2,[133,0],[140,261],1,"SOLID");sLINE(trgt,2,[133,0],[262,368],1,"SOLID");sLINE(trgt,2,[133,0],[369,488],1,"SOLID");sLINE(trgt,2,[133,0],[488,593],1,"SOLID");sLINE(trgt,2,[133,0],[594,700],1,"SOLID");',x0:0,y0:0},
	// VEK00:{make:'sPOLYGON(trgt,3,[61,122,0],[501,288,288],1,"SOLID","SOLID");sLINE(trgt,2,[62,62],[294,0],1,"SOLID");',x0:63,y0:478},
	VEK04 : {
//		make : 'sRECTANGLE(trgt,0,0,125,329,1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sRECTANGLE(trgt,0,0,125,329,1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 62,
		y0 : 164
	},
	// VEK05:{make:'sELLIPSE(trgt,104,156,104,156,1,"SOLID","UNFILLED");sLINE(trgt,2,[25,166],[38,250],1,"SOLID");sLINE(trgt,2,[166,25],[38,250],1,"SOLID");',x0:109,y0:23},
	// MED72:{make:'sLINE(trgt,2,[0,265],[414,17],1,"SOLID");sPOLYGON(trgt,3,[91,280,280],[0,274,0],1,"SOLID","SOLID");',x0:280,y0:18},
	// MED16:{make:'sPOLYGON(trgt,3,[225,112,0],[0,254,0],1,"SOLID","SOLID");',x0:114,y0:240},
	MED71 : {
//		make : 'sPOLYGON(trgt,35,[0,324,361,392,417,437,465,482,494,496,494,494,479,461,451,436,406,376,340,318,289,248,226,206,187,170,156,142,129,117,100,86,81,81,0],[0,0,15,33,58,90,136,194,249,301,337,372,433,478,506,529,564,591,608,613,621,613,603,591,578,562,543,526,504,478,436,376,312,245,245],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,35,[0,324,361,392,417,437,465,482,494,496,494,494,479,461,451,436,406,376,340,318,289,248,226,206,187,170,156,142,129,117,100,86,81,81,0],[0,0,15,33,58,90,136,194,249,301,337,372,433,478,506,529,564,591,608,613,621,613,603,591,578,562,543,526,504,478,436,376,312,245,245],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 14,
		y0 : 117
	},
	// SMLARROW:{make:'sPOLYGON(trgt,3,[76,153,0],[361,207,207],1,"SOLID","SOLID");sLINE(trgt,2,[78,78],[212,0],1,"SOLID");',x0:70,y0:337},
	// arrow4dwnf:{make:'sPOLYGON(trgt,3,[0,90,179],[0,254,0],1,"SOLID","OUTLINE");',x0:0,y0:0},
	arrow4upf : {
//		make : 'sPOLYGON(trgt,3,[0,92,185],[255,0,255],1,"SOLID","OUTLINE");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,3,[0,92,185],[255,0,255],1,"SOLID","OUTLINE");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	FAN : {
//		make : 'sELLIPSE(trgt,529,799,529,799,1,"SOLID","UNFILLED");sARC(trgt,462,137,606,804,220,101,1,"SOLID","UNFILLED");sARC(trgt,-6,648,606,804,140,-101,1,"SOLID","UNFILLED");sARC(trgt,524,414,663,995,166,91,1,"SOLID","UNFILLED");sARC(trgt,-119,173,663,995,346,91,1,"SOLID","UNFILLED");sARC(trgt,269,787,667,1001,102,91,1,"SOLID","UNFILLED");sARC(trgt,130,-192,667,1001,282,91,1,"SOLID","UNFILLED");sELLIPSE(trgt,532,800,70,105,1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sELLIPSE(trgt,529,799,529,799,1,"SOLID","UNFILLED");sARC(trgt,462,137,606,804,220,101,1,"SOLID","UNFILLED");sARC(trgt,-6,648,606,804,140,-101,1,"SOLID","UNFILLED");sARC(trgt,524,414,663,995,166,91,1,"SOLID","UNFILLED");sARC(trgt,-119,173,663,995,346,91,1,"SOLID","UNFILLED");sARC(trgt,269,787,667,1001,102,91,1,"SOLID","UNFILLED");sARC(trgt,130,-192,667,1001,282,91,1,"SOLID","UNFILLED");sELLIPSE(trgt,532,800,70,105,1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	// MED11:{make:'sPOLYGON(trgt,4,[410,0,410,827],[0,215,433,215],1,"SOLID","SOLID");',x0:159,y0:233},
	// MOTOR:{make:'sLINE(trgt,17,[407,359,321,303,270,242,226,221,220,220,229,252,287,321,356,382,405],[4,51,95,126,193,280,353,426,498,551,625,696,767,820,851,875,891],1,"SOLID");sRECTANGLE(trgt,411,0,665,895,1,"SOLID","UNFILLED");sLINE(trgt,3,[962,1031,1031],[899,1121,1121],1,"SOLID");sLINE(trgt,3,[535,467,467],[899,1121,1121],1,"SOLID");sLINE(trgt,2,[1028,469],[1126,1126],1,"SOLID");sARC(trgt,790,-11,469,917,77,-154,1,"SOLID","UNFILLED");sLINE(trgt,3,[222,0,0],[475,475,475],5,"SOLID");',x0:0,y0:0},
	// chkvlv1:{make:'sLINE(trgt,2,[0,0],[98,440],2,"SOLID");sPOLYGON(trgt,3,[0,279,279],[263,116,421],1,"SOLID","SOLID");sARC(trgt,77,-59,122,199,24,-227,1,"SOLID","UNFILLED");',x0:127,y0:0},
	fwpmp : {
//		make : 'sPOLYGON(trgt,14,[1463,665,266,0,0,133,399,399,1463,1862,2128,2128,1862,1463],[0,0,400,400,800,800,1000,1200,1200,1000,1000,200,200,0],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,14,[1463,665,266,0,0,133,399,399,1463,1862,2128,2128,1862,1463],[0,0,400,400,800,800,1000,1200,1200,1000,1000,200,200,0],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 1062,
		y0 : 47
	},
	pmpmtr : {
//		make : 'sRECTANGLE(trgt,0,148,330,550,1,"SOLID","SOLID");sARC(trgt,-3,0,338,385,167,-154,1,"SOLID","SOLID");sARC(trgt,-4,462,338,385,193,154,1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sRECTANGLE(trgt,0,148,330,550,1,"SOLID","SOLID");sARC(trgt,-3,0,338,385,167,-154,1,"SOLID","SOLID");sARC(trgt,-4,462,338,385,193,154,1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	DFDBKR : {
//		make : 'sRECTANGLE(trgt,0,0,266,400,2,"SOLID","UNFILLED");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sRECTANGLE(trgt,0,0,266,400,2,"SOLID","UNFILLED");
			return trgt;
		},
		x0 : 138,
		y0 : 3
	},
	DFDCONT : {
//		make : 'sLINE(trgt,2,[0,266],[0,0],3,"SOLID");sLINE(trgt,2,[0,266],[200,200],3,"SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sLINE(trgt,2,[0,266],[0,0],3,"SOLID");sLINE(trgt,2,[0,266],[200,200],3,"SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	dfda1 : {
//		make : 'sPOLYGON(trgt,4,[99,0,198,99],[0,300,300,0],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,4,[99,0,198,99],[0,300,300,0],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 100,
		y0 : 0
	},
	dfda2 : {
//		make : 'sPOLYGON(trgt,4,[99,0,198,99],[300,0,0,300],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,4,[99,0,198,99],[300,0,0,300],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 99,
		y0 : 300
	},
	dfda3 : {
//		make : 'sPOLYGON(trgt,4,[0,165,165,0],[150,0,300,150],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,4,[0,165,165,0],[150,0,300,150],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 150
	},
	dfda4 : {
//		make : 'sPOLYGON(trgt,4,[165,0,0,165],[150,0,300,150],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,4,[165,0,0,165],[150,0,300,150],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 165,
		y0 : 150
	},
	dfdgen : {
//		make : 'sLINE(trgt,2,[265,265],[403,3],2,"SOLID");sLINE(trgt,2,[485,265],[623,403],2,"SOLID");sLINE(trgt,2,[46,265],[619,403],2,"SOLID");sELLIPSE(trgt,265,402,265,402,2,"SOLID","UNFILLED");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sLINE(trgt,2,[265,265],[403,3],2,"SOLID");sLINE(trgt,2,[485,265],[623,403],2,"SOLID");sLINE(trgt,2,[46,265],[619,403],2,"SOLID");sELLIPSE(trgt,265,402,265,402,2,"SOLID","UNFILLED");
			return trgt;
		},
		x0 : 265,
		y0 : 1
	},
	dfdxfmr : {
//		make : 'sARC(trgt,0,-157,265,398,180,180,2,"SOLID","UNFILLED");sARC(trgt,0,356,265,398,180,-180,2,"SOLID","UNFILLED");sARC(trgt,266,-157,265,398,180,180,2,"SOLID","UNFILLED");sARC(trgt,266,356,265,398,180,-180,2,"SOLID","UNFILLED");sARC(trgt,532,-157,265,398,180,180,2,"SOLID","UNFILLED");sARC(trgt,532,356,265,398,180,-180,2,"SOLID","UNFILLED");sARC(trgt,798,-157,265,398,180,180,2,"SOLID","UNFILLED");sARC(trgt,798,356,265,398,180,-180,2,"SOLID","UNFILLED");sLINE(trgt,2,[532,532],[0,50],2,"SOLID");sLINE(trgt,2,[532,532],[540,600],2,"SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sARC(trgt,0,-157,265,398,180,180,2,"SOLID","UNFILLED");sARC(trgt,0,356,265,398,180,-180,2,"SOLID","UNFILLED");sARC(trgt,266,-157,265,398,180,180,2,"SOLID","UNFILLED");sARC(trgt,266,356,265,398,180,-180,2,"SOLID","UNFILLED");sARC(trgt,532,-157,265,398,180,180,2,"SOLID","UNFILLED");sARC(trgt,532,356,265,398,180,-180,2,"SOLID","UNFILLED");sARC(trgt,798,-157,265,398,180,180,2,"SOLID","UNFILLED");sARC(trgt,798,356,265,398,180,-180,2,"SOLID","UNFILLED");sLINE(trgt,2,[532,532],[0,50],2,"SOLID");sLINE(trgt,2,[532,532],[540,600],2,"SOLID");
			return trgt;
		},
		x0 : 531,
		y0 : 3
	},
	// VALVE7:{make:'sPOLYGON(trgt,4,[0,0,264,264],[274,524,274,524],1,"SOLID","SOLID");sPOLYGON(trgt,4,[49,214,131,131],[601,601,401,401],1,"SOLID","SOLID");sLINE(trgt,2,[132,132],[400,100],1,"SOLID");sPOLYGON(trgt,32,[32,35,39,42,47,55,64,72,82,90,100,108,117,123,127,135,144,152,160,167,173,179,188,198,203,209,213,220,222,225,228,231],[130,113,98,82,68,52,39,29,20,13,8,4,2,1,0,0,1,3,6,9,13,20,28,37,47,56,65,80,91,102,116,130],1,"SOLID","SOLID");',x0:133,y0:401},
	// DFDCOIL:{make:'sARC(trgt,143,405,251,193,261,197,2,"SOLID","UNFILLED");sARC(trgt,144,809,251,193,261,197,2,"SOLID","UNFILLED");sARC(trgt,2,405,488,595,89,182,2,"SOLID","UNFILLED");sARC(trgt,3,809,488,595,89,182,2,"SOLID","UNFILLED");sARC(trgt,0,0,488,595,89,182,2,"SOLID","UNFILLED");',x0:0,y0:0},
	// stg:{make:'sPOLYGON(trgt,9,[0,600,900,1500,1500,900,600,0,0],[0,300,300,0,1100,800,800,1100,0],1,"SOLID","OUTLINE");',x0:0,y0:0},
	// horn:{make:'sPOLYGON(trgt,4,[526,23,23,526],[0,204,304,508],1,"SOLID","SOLID");sELLIPSE(trgt,42,262,42,63,1,"SOLID","OUTLINE");',x0:0,y0:0},
	diapump : {
//		make : 'sPOLYGON(trgt,12,[56,189,455,588,644,644,588,455,189,56,0,0],[414,621,621,414,414,207,207,0,0,207,207,414],1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,12,[56,189,455,588,644,644,588,455,189,56,0,0],[414,621,621,414,414,207,207,0,0,207,207,414],1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	HEATER : {
//		make : 'sRECTANGLE(trgt,0,0,666,458,1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sRECTANGLE(trgt,0,0,666,458,1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	// sigma:{make:'sLINE(trgt,2,[115,119],[0,0],2,"SOLID");sLINE(trgt,7,[117,117,0,80,0,116,116],[53,1,1,186,392,392,338],2,"SOLID");',x0:0,y0:0},
	// pt:{make:'sELLIPSE(trgt,276,396,276,396,1,"SOLID","UNFILLED");sLINE(trgt,4,[0,0,124,124],[384,10,384,384],2,"SOLID");sLINE(trgt,3,[128,128,128],[389,10,10],2,"SOLID");sELLIPSE(trgt,210,48,30,48,2,"SOLID","UNFILLED");sLINE(trgt,2,[184,246],[161,156],2,"SOLID");',x0:278,y0:400},
	test0 : {
//		make : 'sPOLYGON(trgt,4,[0,0,468,468],[332,660,332,660],1,"SOLID","SOLID");sPOLYGON(trgt,4,[0,0,468,468],[332,660,332,660],1,"SOLID","UNFILLED");sLINE(trgt,3,[234,234,234],[168,496,496],1,"SOLID");sARC(trgt,118,0,234,328,180,-180,1,"SOLID","SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,4,[0,0,468,468],[332,660,332,660],1,"SOLID","SOLID");sPOLYGON(trgt,4,[0,0,468,468],[332,660,332,660],1,"SOLID","UNFILLED");sLINE(trgt,3,[234,234,234],[168,496,496],1,"SOLID");sARC(trgt,118,0,234,328,180,-180,1,"SOLID","SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	},
	test1 : {
//		make : 'sPOLYGON(trgt,4,[0,310,619,0],[547,0,547,547],1,"SOLID","UNFILLED");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sPOLYGON(trgt,4,[0,310,619,0],[547,0,547,547],1,"SOLID","UNFILLED");
			return trgt;
		},
		x0 : 310,
		y0 : 546
	},
	CLOSEBTN : {
//		make : 'sRECTANGLE(trgt,0,0,218,722,1,"SOLID","UNFILLED");sLINE(trgt,2,[0,218],[0,772],3,"SOLID");sLINE(trgt,2,[0,218],[772,0],3,"SOLID");',
		make : function() {
			var trgt = new PIXI.Graphics();
			sRECTANGLE(trgt,0,0,218,722,1,"SOLID","UNFILLED");sLINE(trgt,2,[0,218],[0,772],3,"SOLID");sLINE(trgt,2,[0,218],[772,0],3,"SOLID");
			return trgt;
		},
		x0 : 0,
		y0 : 0
	}
};
