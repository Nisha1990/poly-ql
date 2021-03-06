// Output created by jacc on Wed Feb 12 12:27:34 CET 2014

package org.uva.sea.ql.parser.jacc;

import org.uva.sea.ql.ast.*;
import org.uva.sea.ql.ast.literal.*;
import org.uva.sea.ql.ast.operators.arithmetic.*;
import org.uva.sea.ql.ast.operators.logical.*;
import org.uva.sea.ql.ast.operators.comparison.*;
import org.uva.sea.ql.ast.statement.*;
import org.uva.sea.ql.ast.type.*;


class QLParser implements QLTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private org.uva.sea.ql.ast.ASTNode[] yysv;
    private org.uva.sea.ql.ast.ASTNode yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new org.uva.sea.ql.ast.ASTNode[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 158;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 82:
                    yyn = yys3();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 83:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    switch (yytok) {
                        case '}':
                        case IDENTIFIER:
                        case ENDINPUT:
                        case IF:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    switch (yytok) {
                        case '}':
                        case IDENTIFIER:
                        case ENDINPUT:
                        case IF:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 88:
                    switch (yytok) {
                        case '}':
                        case IDENTIFIER:
                        case ENDINPUT:
                        case IF:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 89:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 90:
                    yyn = yys11();
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 91:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 92:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 34;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
                    yyn = yys14();
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    switch (yytok) {
                        case '(':
                            yyn = 36;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 97:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 101:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    switch (yytok) {
                        case '{':
                            yyn = 54;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    switch (yytok) {
                        case STRING:
                            yyn = 55;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 117:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 126:
                    yyn = yys47();
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 127:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 128:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 129:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 130:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
                    switch (yytok) {
                        case IF:
                            yyn = 15;
                            continue;
                        case IDENTIFIER:
                            yyn = 60;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 134:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 62;
                            continue;
                        case INTEGER:
                            yyn = 63;
                            continue;
                        case MONEY:
                            yyn = 64;
                            continue;
                        case STRING:
                            yyn = 65;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    switch (yytok) {
                        case IF:
                            yyn = 15;
                            continue;
                        case IDENTIFIER:
                            yyn = 60;
                            continue;
                        case '}':
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
                    switch (yytok) {
                        case '}':
                            yyn = 68;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 139:
                    switch (yytok) {
                        case ':':
                            yyn = 35;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 140:
                    switch (yytok) {
                        case '(':
                            yyn = 69;
                            continue;
                        case '}':
                        case IDENTIFIER:
                        case ENDINPUT:
                        case IF:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
                    switch (yytok) {
                        case '}':
                        case IDENTIFIER:
                        case '(':
                        case ENDINPUT:
                        case IF:
                            yyn = yyr40();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 142:
                    switch (yytok) {
                        case '}':
                        case IDENTIFIER:
                        case '(':
                        case ENDINPUT:
                        case IF:
                            yyn = yyr39();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 143:
                    switch (yytok) {
                        case '}':
                        case IDENTIFIER:
                        case '(':
                        case ENDINPUT:
                        case IF:
                            yyn = yyr41();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    switch (yytok) {
                        case '}':
                        case IDENTIFIER:
                        case '(':
                        case ENDINPUT:
                        case IF:
                            yyn = yyr38();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    switch (yytok) {
                        case '{':
                            yyn = 70;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    switch (yytok) {
                        case '}':
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    switch (yytok) {
                        case IF:
                            yyn = 15;
                            continue;
                        case IDENTIFIER:
                            yyn = 60;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 150:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 151:
                    switch (yytok) {
                        case '}':
                            yyn = 74;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 152:
                    switch (yytok) {
                        case '}':
                        case IDENTIFIER:
                        case ENDINPUT:
                        case IF:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 153:
                    switch (yytok) {
                        case ELSE:
                            yyn = 75;
                            continue;
                        case '}':
                        case IDENTIFIER:
                        case ENDINPUT:
                        case IF:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 154:
                    switch (yytok) {
                        case '{':
                            yyn = 76;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 155:
                    switch (yytok) {
                        case IF:
                            yyn = 15;
                            continue;
                        case IDENTIFIER:
                            yyn = 60;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 156:
                    switch (yytok) {
                        case '}':
                            yyn = 78;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 157:
                    switch (yytok) {
                        case '}':
                        case IDENTIFIER:
                        case ENDINPUT:
                        case IF:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 158:
                    return true;
                case 159:
                    yyerror("stack overflow");
                case 160:
                    return false;
                case 161:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        org.uva.sea.ql.ast.ASTNode[] newyysv = new org.uva.sea.ql.ast.ASTNode[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys0() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case FORM:
                return 13;
            case IDENTIFIER:
                return 14;
            case IF:
                return 15;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
        }
        return 161;
    }

    private int yys3() {
        switch (yytok) {
            case '>':
            case OR:
            case '-':
            case NEQ:
            case GEQ:
            case '/':
            case '+':
            case '<':
            case '*':
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr17();
        }
        return 161;
    }

    private int yys4() {
        switch (yytok) {
            case AND:
                return 22;
            case EQ:
                return 23;
            case GEQ:
                return 24;
            case LEQ:
                return 25;
            case NEQ:
                return 26;
            case OR:
                return 27;
            case '*':
                return 28;
            case '+':
                return 29;
            case '-':
                return 30;
            case '/':
                return 31;
            case '<':
                return 32;
            case '>':
                return 33;
            case ENDINPUT:
                return yyr4();
        }
        return 161;
    }

    private int yys8() {
        switch (yytok) {
            case '>':
            case OR:
            case '-':
            case NEQ:
            case GEQ:
            case '/':
            case '+':
            case '<':
            case '*':
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr15();
        }
        return 161;
    }

    private int yys11() {
        switch (yytok) {
            case '>':
            case OR:
            case '-':
            case NEQ:
            case GEQ:
            case '/':
            case '+':
            case '<':
            case '*':
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr16();
        }
        return 161;
    }

    private int yys12() {
        switch (yytok) {
            case '>':
            case OR:
            case '-':
            case NEQ:
            case GEQ:
            case '/':
            case '+':
            case '<':
            case '*':
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr21();
        }
        return 161;
    }

    private int yys14() {
        switch (yytok) {
            case ':':
                return 35;
            case '>':
            case OR:
            case '/':
            case '-':
            case NEQ:
            case GEQ:
            case '<':
            case '+':
            case '*':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr19();
        }
        return 161;
    }

    private int yys16() {
        switch (yytok) {
            case '>':
            case OR:
            case '-':
            case NEQ:
            case GEQ:
            case '/':
            case '+':
            case '<':
            case '*':
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr20();
        }
        return 161;
    }

    private int yys17() {
        switch (yytok) {
            case '>':
            case OR:
            case '-':
            case NEQ:
            case GEQ:
            case '/':
            case '+':
            case '<':
            case '*':
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr22();
        }
        return 161;
    }

    private int yys18() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys19() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys20() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys21() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys22() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys23() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys24() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys25() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys26() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys27() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys28() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys29() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys30() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys31() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys32() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys33() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys36() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys37() {
        switch (yytok) {
            case '>':
            case OR:
            case '-':
            case NEQ:
            case GEQ:
            case '/':
            case '+':
            case '<':
            case '*':
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr29();
        }
        return 161;
    }

    private int yys38() {
        switch (yytok) {
            case '>':
            case OR:
            case '-':
            case NEQ:
            case GEQ:
            case '/':
            case '+':
            case '<':
            case '*':
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr19();
        }
        return 161;
    }

    private int yys39() {
        switch (yytok) {
            case AND:
                return 22;
            case EQ:
                return 23;
            case GEQ:
                return 24;
            case LEQ:
                return 25;
            case NEQ:
                return 26;
            case OR:
                return 27;
            case '*':
                return 28;
            case '+':
                return 29;
            case '-':
                return 30;
            case '/':
                return 31;
            case '<':
                return 32;
            case '>':
                return 33;
            case ')':
                return 57;
        }
        return 161;
    }

    private int yys40() {
        switch (yytok) {
            case '>':
            case OR:
            case '-':
            case NEQ:
            case GEQ:
            case '/':
            case '+':
            case '<':
            case '*':
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr23();
        }
        return 161;
    }

    private int yys41() {
        switch (yytok) {
            case '>':
            case OR:
            case '-':
            case NEQ:
            case GEQ:
            case '/':
            case '+':
            case '<':
            case '*':
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr24();
        }
        return 161;
    }

    private int yys42() {
        switch (yytok) {
            case EQ:
                return 23;
            case GEQ:
                return 24;
            case LEQ:
                return 25;
            case NEQ:
                return 26;
            case OR:
                return 27;
            case '*':
                return 28;
            case '+':
                return 29;
            case '-':
                return 30;
            case '/':
                return 31;
            case '<':
                return 32;
            case '>':
                return 33;
            case ')':
            case ENDINPUT:
            case AND:
                return yyr30();
        }
        return 161;
    }

    private int yys43() {
        switch (yytok) {
            case '*':
                return 28;
            case '+':
                return 29;
            case '-':
                return 30;
            case '/':
                return 31;
            case '>':
            case '<':
            case OR:
            case NEQ:
            case GEQ:
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr32();
        }
        return 161;
    }

    private int yys44() {
        switch (yytok) {
            case '*':
                return 28;
            case '+':
                return 29;
            case '-':
                return 30;
            case '/':
                return 31;
            case '>':
            case '<':
            case OR:
            case NEQ:
            case GEQ:
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr36();
        }
        return 161;
    }

    private int yys45() {
        switch (yytok) {
            case '*':
                return 28;
            case '+':
                return 29;
            case '-':
                return 30;
            case '/':
                return 31;
            case '>':
            case '<':
            case OR:
            case NEQ:
            case GEQ:
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr37();
        }
        return 161;
    }

    private int yys46() {
        switch (yytok) {
            case '*':
                return 28;
            case '+':
                return 29;
            case '-':
                return 30;
            case '/':
                return 31;
            case '>':
            case '<':
            case OR:
            case NEQ:
            case GEQ:
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr33();
        }
        return 161;
    }

    private int yys47() {
        switch (yytok) {
            case EQ:
                return 23;
            case GEQ:
                return 24;
            case LEQ:
                return 25;
            case NEQ:
                return 26;
            case '*':
                return 28;
            case '+':
                return 29;
            case '-':
                return 30;
            case '/':
                return 31;
            case '<':
                return 32;
            case '>':
                return 33;
            case OR:
            case ')':
            case ENDINPUT:
            case AND:
                return yyr31();
        }
        return 161;
    }

    private int yys48() {
        switch (yytok) {
            case '>':
            case OR:
            case '-':
            case NEQ:
            case GEQ:
            case '/':
            case '+':
            case '<':
            case '*':
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr25();
        }
        return 161;
    }

    private int yys49() {
        switch (yytok) {
            case '*':
                return 28;
            case '/':
                return 31;
            case '>':
            case OR:
            case '-':
            case NEQ:
            case GEQ:
            case '<':
            case '+':
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr27();
        }
        return 161;
    }

    private int yys50() {
        switch (yytok) {
            case '*':
                return 28;
            case '/':
                return 31;
            case '>':
            case OR:
            case '-':
            case NEQ:
            case GEQ:
            case '<':
            case '+':
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr28();
        }
        return 161;
    }

    private int yys51() {
        switch (yytok) {
            case '>':
            case OR:
            case '-':
            case NEQ:
            case GEQ:
            case '/':
            case '+':
            case '<':
            case '*':
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr26();
        }
        return 161;
    }

    private int yys52() {
        switch (yytok) {
            case '*':
                return 28;
            case '+':
                return 29;
            case '-':
                return 30;
            case '/':
                return 31;
            case '>':
            case '<':
            case OR:
            case NEQ:
            case GEQ:
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr35();
        }
        return 161;
    }

    private int yys53() {
        switch (yytok) {
            case '*':
                return 28;
            case '+':
                return 29;
            case '-':
                return 30;
            case '/':
                return 31;
            case '>':
            case '<':
            case OR:
            case NEQ:
            case GEQ:
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr34();
        }
        return 161;
    }

    private int yys56() {
        switch (yytok) {
            case AND:
                return 22;
            case EQ:
                return 23;
            case GEQ:
                return 24;
            case LEQ:
                return 25;
            case NEQ:
                return 26;
            case OR:
                return 27;
            case '*':
                return 28;
            case '+':
                return 29;
            case '-':
                return 30;
            case '/':
                return 31;
            case '<':
                return 32;
            case '>':
                return 33;
            case ')':
                return 66;
        }
        return 161;
    }

    private int yys57() {
        switch (yytok) {
            case '>':
            case OR:
            case '-':
            case NEQ:
            case GEQ:
            case '/':
            case '+':
            case '<':
            case '*':
            case ')':
            case LEQ:
            case ENDINPUT:
            case EQ:
            case AND:
                return yyr18();
        }
        return 161;
    }

    private int yys69() {
        switch (yytok) {
            case BOOLEAN:
                return 12;
            case INTEGER:
                return 16;
            case STRING:
                return 17;
            case '!':
                return 18;
            case '(':
                return 19;
            case '+':
                return 20;
            case '-':
                return 21;
            case IDENTIFIER:
                return 38;
        }
        return 161;
    }

    private int yys71() {
        switch (yytok) {
            case AND:
                return 22;
            case EQ:
                return 23;
            case GEQ:
                return 24;
            case LEQ:
                return 25;
            case NEQ:
                return 26;
            case OR:
                return 27;
            case '*':
                return 28;
            case '+':
                return 29;
            case '-':
                return 30;
            case '/':
                return 31;
            case '<':
                return 32;
            case '>':
                return 33;
            case ')':
                return 73;
        }
        return 161;
    }

    private int yyr1() { // top : astnode
        {result = ((ASTNode)yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr2() { // astnode : form
        yysp -= 1;
        return 2;
    }

    private int yyr3() { // astnode : statement
        yysp -= 1;
        return 2;
    }

    private int yyr4() { // astnode : expression
        yysp -= 1;
        return 2;
    }

    private int yyr32() { // comparison : expression EQ expression
        { yyrv = new Eq(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 3;
    }

    private int yyr33() { // comparison : expression NEQ expression
        { yyrv = new NEq(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 3;
    }

    private int yyr34() { // comparison : expression '>' expression
        { yyrv = new GT(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 3;
    }

    private int yyr35() { // comparison : expression '<' expression
        { yyrv = new LT(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 3;
    }

    private int yyr36() { // comparison : expression GEQ expression
        { yyrv = new GEq(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 3;
    }

    private int yyr37() { // comparison : expression LEQ expression
        { yyrv = new LEq(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 3;
    }

    private int yyr15() { // expression : logical
        yysp -= 1;
        return yypexpression();
    }

    private int yyr16() { // expression : arithmetic
        yysp -= 1;
        return yypexpression();
    }

    private int yyr17() { // expression : comparison
        yysp -= 1;
        return yypexpression();
    }

    private int yyr18() { // expression : '(' expression ')'
        { yyrv = ((Expression)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr19() { // expression : IDENTIFIER
        { yyrv = ((Identifier)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpression();
    }

    private int yyr20() { // expression : INTEGER
        { yyrv = ((IntLiteral)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpression();
    }

    private int yyr21() { // expression : BOOLEAN
        { yyrv = ((BoolLiteral)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpression();
    }

    private int yyr22() { // expression : STRING
        { yyrv = ((StringLiteral)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpression();
    }

    private int yypexpression() {
        switch (yyst[yysp-1]) {
            case 36: return 56;
            case 33: return 53;
            case 32: return 52;
            case 31: return 51;
            case 30: return 50;
            case 29: return 49;
            case 28: return 48;
            case 27: return 47;
            case 26: return 46;
            case 25: return 45;
            case 24: return 44;
            case 23: return 43;
            case 22: return 42;
            case 21: return 41;
            case 20: return 40;
            case 19: return 39;
            case 18: return 37;
            case 0: return 4;
            default: return 71;
        }
    }

    private int yyr5() { // form : FORM IDENTIFIER '{' statements '}'
        {yyrv = new Form(((Identifier)yysv[yysp-4]),((QuestionSet)yysv[yysp-2]));}
        yysv[yysp-=5] = yyrv;
        return 5;
    }

    private int yyr13() { // ifThen : IF '(' expression ')' '{' statements '}'
        {yyrv = new If(((Expression)yysv[yysp-5]),((QuestionSet)yysv[yysp-2]));}
        yysv[yysp-=7] = yyrv;
        return 6;
    }

    private int yyr14() { // ifThenElse : IF '(' expression ')' '{' statements '}' ELSE '{' statements '}'
        {yyrv = new IfElse(((Expression)yysv[yysp-9]),((QuestionSet)yysv[yysp-6]),((QuestionSet)yysv[yysp-2]));}
        yysv[yysp-=11] = yyrv;
        return 7;
    }

    private int yyr29() { // logical : '!' expression
        { yyrv = new Not(((Expression)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 8;
    }

    private int yyr30() { // logical : expression AND expression
        { yyrv = new And(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 8;
    }

    private int yyr31() { // logical : expression OR expression
        { yyrv = new Or(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 8;
    }

    private int yyr11() { // question : IDENTIFIER ':' STRING type '(' expression ')'
        {yyrv = new ExprQuestion(((Identifier)yysv[yysp-7]),((StringLiteral)yysv[yysp-5]),((Type)yysv[yysp-4]),((Expression)yysv[yysp-2]));}
        yysv[yysp-=7] = yyrv;
        return 9;
    }

    private int yyr12() { // question : IDENTIFIER ':' STRING type
        {yyrv = new Question(((Identifier)yysv[yysp-4]),((StringLiteral)yysv[yysp-2]),((Type)yysv[yysp-1]));}
        yysv[yysp-=4] = yyrv;
        return 9;
    }

    private int yyr8() { // statement : question
        yysp -= 1;
        return yypstatement();
    }

    private int yyr9() { // statement : ifThen
        yysp -= 1;
        return yypstatement();
    }

    private int yyr10() { // statement : ifThenElse
        yysp -= 1;
        return yypstatement();
    }

    private int yypstatement() {
        switch (yyst[yysp-1]) {
            case 0: return 10;
            default: return 58;
        }
    }

    private int yyr6() { // statements : statement statements
        {yyrv = new QuestionSet(((Statement)yysv[yysp-2]),((QuestionSet)yysv[yysp-1]));}
        yysv[yysp-=2] = yyrv;
        return yypstatements();
    }

    private int yyr7() { // statements : statement
        {yyrv = new QuestionSet(((Statement)yysv[yysp-1]));}
        yysv[yysp-=1] = yyrv;
        return yypstatements();
    }

    private int yypstatements() {
        switch (yyst[yysp-1]) {
            case 70: return 72;
            case 58: return 67;
            case 54: return 59;
            default: return 77;
        }
    }

    private int yyr23() { // arithmetic : '+' expression
        { yyrv = new Pos(((Expression)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 11;
    }

    private int yyr24() { // arithmetic : '-' expression
        { yyrv = new Neg(((Expression)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 11;
    }

    private int yyr25() { // arithmetic : expression '*' expression
        { yyrv = new Mul(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 11;
    }

    private int yyr26() { // arithmetic : expression '/' expression
        { yyrv = new Div(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 11;
    }

    private int yyr27() { // arithmetic : expression '+' expression
        { yyrv = new Add(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 11;
    }

    private int yyr28() { // arithmetic : expression '-' expression
        { yyrv = new Sub(((Expression)yysv[yysp-3]), ((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 11;
    }

    private int yyr38() { // type : STRING
        { yyrv = new StringType(); }
        yysv[yysp-=1] = yyrv;
        return 61;
    }

    private int yyr39() { // type : INTEGER
        { yyrv = new IntType(); }
        yysv[yysp-=1] = yyrv;
        return 61;
    }

    private int yyr40() { // type : BOOLEAN
        { yyrv = new BoolType(); }
        yysv[yysp-=1] = yyrv;
        return 61;
    }

    private int yyr41() { // type : MONEY
        { yyrv = new MoneyType(); }
        yysv[yysp-=1] = yyrv;
        return 61;
    }

    protected String[] yyerrmsgs = {
    };

private QLLexer lexer; 

private ASTNode result;

public ASTNode getResult() {
  return result;
}

public QLParser(QLLexer lexer) { 
  this.lexer = lexer; 
}

private void yyerror(String msg) { 
  System.err.println(msg); 
}

}
