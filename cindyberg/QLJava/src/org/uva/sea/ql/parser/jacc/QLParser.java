// Output created by jacc on Thu Feb 06 13:02:13 CET 2014

package org.uva.sea.ql.parser.jacc;

import org.uva.sea.ql.ast.expr.*;
import org.uva.sea.ql.ast.Iden

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
                case 63:
                    switch (yytok) {
                        case FORM:
                            yyn = 3;
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 64:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 126;
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 65:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 66:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 4;
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 67:
                    switch (yytok) {
                        case '{':
                            yyn = 5;
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 68:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 10;
                            continue;
                        case IF:
                            yyn = 11;
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    switch (yytok) {
                        case IF:
                        case IDENTIFIER:
                        case '}':
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    switch (yytok) {
                        case IF:
                        case IDENTIFIER:
                        case '}':
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 10;
                            continue;
                        case IF:
                            yyn = 11;
                            continue;
                        case '}':
                            yyn = 13;
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 72:
                    switch (yytok) {
                        case IF:
                        case IDENTIFIER:
                        case '}':
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 73:
                    switch (yytok) {
                        case LABEL:
                            yyn = 14;
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 74:
                    switch (yytok) {
                        case '(':
                            yyn = 15;
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 75:
                    switch (yytok) {
                        case IF:
                        case IDENTIFIER:
                        case '}':
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 129;
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
                case 76:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 129;
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
                case 77:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 17;
                            continue;
                        case DATE:
                            yyn = 18;
                            continue;
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case INT:
                            yyn = 20;
                            continue;
                        case MONEY:
                            yyn = 21;
                            continue;
                    }
                    yyn = 129;
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
                case 78:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 22;
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
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
                case 80:
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
                case 81:
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
                case 82:
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
                case 83:
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
                case 84:
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
                case 85:
                    switch (yytok) {
                        case ')':
                            yyn = 30;
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
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
                case 87:
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
                case 88:
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
                case 89:
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
                case 90:
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
                case 91:
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
                case 92:
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
                case 93:
                    switch (yytok) {
                        case '{':
                            yyn = 47;
                            continue;
                    }
                    yyn = 129;
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
                case 94:
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
                case 95:
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
                case 96:
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
                case 97:
                    yyn = yys34();
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
                case 98:
                    yyn = yys35();
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
                case 99:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
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
                case 101:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 10;
                            continue;
                        case IF:
                            yyn = 11;
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 117:
                    yyn = yys54();
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    yyn = yys59();
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
                case 123:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 10;
                            continue;
                        case IF:
                            yyn = 11;
                            continue;
                        case '}':
                            yyn = 62;
                            continue;
                    }
                    yyn = 129;
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
                case 125:
                    switch (yytok) {
                        case IF:
                        case IDENTIFIER:
                        case '}':
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 129;
                    continue;

                case 126:
                    return true;
                case 127:
                    yyerror("stack overflow");
                case 128:
                    return false;
                case 129:
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

    private int yys16() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
            case IF:
            case IDENTIFIER:
            case '}':
                return yyr8();
        }
        return 129;
    }

    private int yys17() {
        switch (yytok) {
            case '-':
            case '+':
            case '(':
            case '!':
            case INT:
            case IF:
            case IDENTIFIER:
            case '}':
            case IDENT:
                return yyr14();
        }
        return 129;
    }

    private int yys18() {
        switch (yytok) {
            case '-':
            case '+':
            case '(':
            case '!':
            case INT:
            case IF:
            case IDENTIFIER:
            case '}':
            case IDENT:
                return yyr11();
        }
        return 129;
    }

    private int yys19() {
        switch (yytok) {
            case '-':
            case '+':
            case '(':
            case '!':
            case INT:
            case IF:
            case IDENTIFIER:
            case '}':
            case IDENT:
                return yyr13();
        }
        return 129;
    }

    private int yys20() {
        switch (yytok) {
            case '-':
            case '+':
            case '(':
            case '!':
            case INT:
            case IF:
            case IDENTIFIER:
            case '}':
            case IDENT:
                return yyr12();
        }
        return 129;
    }

    private int yys21() {
        switch (yytok) {
            case '-':
            case '+':
            case '(':
            case '!':
            case INT:
            case IF:
            case IDENTIFIER:
            case '}':
            case IDENT:
                return yyr10();
        }
        return 129;
    }

    private int yys23() {
        switch (yytok) {
            case AND:
                return 31;
            case EQ:
                return 32;
            case GEQ:
                return 33;
            case LEQ:
                return 34;
            case NEQ:
                return 35;
            case OR:
                return 36;
            case '*':
                return 37;
            case '+':
                return 38;
            case '-':
                return 39;
            case '/':
                return 40;
            case '<':
                return 41;
            case '>':
                return 42;
            case IF:
            case IDENTIFIER:
            case '}':
                return yyr7();
        }
        return 129;
    }

    private int yys24() {
        switch (yytok) {
            case '>':
            case LEQ:
            case GEQ:
            case '+':
            case '*':
            case ')':
            case IF:
            case EQ:
            case '-':
            case '/':
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr31();
        }
        return 129;
    }

    private int yys25() {
        switch (yytok) {
            case '>':
            case LEQ:
            case GEQ:
            case '+':
            case '*':
            case ')':
            case IF:
            case EQ:
            case '-':
            case '/':
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr30();
        }
        return 129;
    }

    private int yys26() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys27() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys28() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys29() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys31() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys32() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys33() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys34() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys35() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys36() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys37() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys38() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys39() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys40() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys41() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys42() {
        switch (yytok) {
            case IDENT:
                return 24;
            case INT:
                return 25;
            case '!':
                return 26;
            case '(':
                return 27;
            case '+':
                return 28;
            case '-':
                return 29;
        }
        return 129;
    }

    private int yys43() {
        switch (yytok) {
            case '>':
            case LEQ:
            case GEQ:
            case '+':
            case '*':
            case ')':
            case IF:
            case EQ:
            case '-':
            case '/':
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr17();
        }
        return 129;
    }

    private int yys44() {
        switch (yytok) {
            case AND:
                return 31;
            case EQ:
                return 32;
            case GEQ:
                return 33;
            case LEQ:
                return 34;
            case NEQ:
                return 35;
            case OR:
                return 36;
            case '*':
                return 37;
            case '+':
                return 38;
            case '-':
                return 39;
            case '/':
                return 40;
            case '<':
                return 41;
            case '>':
                return 42;
            case ')':
                return 60;
        }
        return 129;
    }

    private int yys45() {
        switch (yytok) {
            case '>':
            case LEQ:
            case GEQ:
            case '+':
            case '*':
            case ')':
            case IF:
            case EQ:
            case '-':
            case '/':
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr15();
        }
        return 129;
    }

    private int yys46() {
        switch (yytok) {
            case '>':
            case LEQ:
            case GEQ:
            case '+':
            case '*':
            case ')':
            case IF:
            case EQ:
            case '-':
            case '/':
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr16();
        }
        return 129;
    }

    private int yys48() {
        switch (yytok) {
            case EQ:
                return 32;
            case GEQ:
                return 33;
            case LEQ:
                return 34;
            case NEQ:
                return 35;
            case '*':
                return 37;
            case '+':
                return 38;
            case '-':
                return 39;
            case '/':
                return 40;
            case '<':
                return 41;
            case '>':
                return 42;
            case ')':
            case IF:
            case IDENTIFIER:
            case OR:
            case '}':
            case AND:
                return yyr28();
        }
        return 129;
    }

    private int yys49() {
        switch (yytok) {
            case '*':
                return 37;
            case '+':
                return 38;
            case '-':
                return 39;
            case '/':
                return 40;
            case '>':
            case LEQ:
            case GEQ:
            case ')':
            case IF:
            case EQ:
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr22();
        }
        return 129;
    }

    private int yys50() {
        switch (yytok) {
            case '*':
                return 37;
            case '+':
                return 38;
            case '-':
                return 39;
            case '/':
                return 40;
            case '>':
            case LEQ:
            case GEQ:
            case ')':
            case IF:
            case EQ:
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr26();
        }
        return 129;
    }

    private int yys51() {
        switch (yytok) {
            case '*':
                return 37;
            case '+':
                return 38;
            case '-':
                return 39;
            case '/':
                return 40;
            case '>':
            case LEQ:
            case GEQ:
            case ')':
            case IF:
            case EQ:
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr27();
        }
        return 129;
    }

    private int yys52() {
        switch (yytok) {
            case '*':
                return 37;
            case '+':
                return 38;
            case '-':
                return 39;
            case '/':
                return 40;
            case '>':
            case LEQ:
            case GEQ:
            case ')':
            case IF:
            case EQ:
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr23();
        }
        return 129;
    }

    private int yys53() {
        switch (yytok) {
            case AND:
                return 31;
            case EQ:
                return 32;
            case GEQ:
                return 33;
            case LEQ:
                return 34;
            case NEQ:
                return 35;
            case '*':
                return 37;
            case '+':
                return 38;
            case '-':
                return 39;
            case '/':
                return 40;
            case '<':
                return 41;
            case '>':
                return 42;
            case ')':
            case IF:
            case IDENTIFIER:
            case OR:
            case '}':
                return yyr29();
        }
        return 129;
    }

    private int yys54() {
        switch (yytok) {
            case '>':
            case LEQ:
            case GEQ:
            case '+':
            case '*':
            case ')':
            case IF:
            case EQ:
            case '-':
            case '/':
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr18();
        }
        return 129;
    }

    private int yys55() {
        switch (yytok) {
            case '*':
                return 37;
            case '/':
                return 40;
            case '>':
            case LEQ:
            case GEQ:
            case '-':
            case '+':
            case ')':
            case IF:
            case EQ:
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr20();
        }
        return 129;
    }

    private int yys56() {
        switch (yytok) {
            case '*':
                return 37;
            case '/':
                return 40;
            case '>':
            case LEQ:
            case GEQ:
            case '-':
            case '+':
            case ')':
            case IF:
            case EQ:
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr21();
        }
        return 129;
    }

    private int yys57() {
        switch (yytok) {
            case '>':
            case LEQ:
            case GEQ:
            case '+':
            case '*':
            case ')':
            case IF:
            case EQ:
            case '-':
            case '/':
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr19();
        }
        return 129;
    }

    private int yys58() {
        switch (yytok) {
            case '*':
                return 37;
            case '+':
                return 38;
            case '-':
                return 39;
            case '/':
                return 40;
            case '>':
            case LEQ:
            case GEQ:
            case ')':
            case IF:
            case EQ:
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr25();
        }
        return 129;
    }

    private int yys59() {
        switch (yytok) {
            case '*':
                return 37;
            case '+':
                return 38;
            case '-':
                return 39;
            case '/':
                return 40;
            case '>':
            case LEQ:
            case GEQ:
            case ')':
            case IF:
            case EQ:
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr24();
        }
        return 129;
    }

    private int yys60() {
        switch (yytok) {
            case '>':
            case LEQ:
            case GEQ:
            case '+':
            case '*':
            case ')':
            case IF:
            case EQ:
            case '-':
            case '/':
            case '<':
            case IDENTIFIER:
            case OR:
            case '}':
            case NEQ:
            case AND:
                return yyr32();
        }
        return 129;
    }

    private int yyr1() { // top : form
        {result = ((Form)yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr15() { // expr : '+' expr
        { yyrv = new Pos(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr16() { // expr : '-' expr
        { yyrv = new Neg(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr17() { // expr : '!' expr
        { yyrv = new Not(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr18() { // expr : expr '*' expr
        { yyrv = new Mul(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr19() { // expr : expr '/' expr
        { yyrv = new Div(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr20() { // expr : expr '+' expr
        { yyrv = new Add(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr21() { // expr : expr '-' expr
        { yyrv = new Sub(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr22() { // expr : expr EQ expr
        { yyrv = new Eq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr23() { // expr : expr NEQ expr
        { yyrv = new NEq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr24() { // expr : expr '>' expr
        { yyrv = new GT(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr25() { // expr : expr '<' expr
        { yyrv = new LT(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr26() { // expr : expr GEQ expr
        { yyrv = new GEq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr27() { // expr : expr LEQ expr
        { yyrv = new LEq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr28() { // expr : expr AND expr
        { yyrv = new And(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr29() { // expr : expr OR expr
        { yyrv = new Or(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr30() { // expr : INT
        { yyrv = ((Int)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr31() { // expr : IDENT
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr32() { // expr : '(' expr ')'
        { yyrv = ((Expr)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 41: return 58;
            case 40: return 57;
            case 39: return 56;
            case 38: return 55;
            case 37: return 54;
            case 36: return 53;
            case 35: return 52;
            case 34: return 51;
            case 33: return 50;
            case 32: return 49;
            case 31: return 48;
            case 29: return 46;
            case 28: return 45;
            case 27: return 44;
            case 26: return 43;
            case 16: return 23;
            default: return 59;
        }
    }

    private int yyr2() { // form : FORM IDENTIFIER '{' statements '}'
        {yyrv = new Form(((Identifier)yysv[yysp-4]),yysv[yysp-2]);}
        yysv[yysp-=5] = yyrv;
        return 2;
    }

    private int yyr7() { // question : IDENTIFIER LABEL type expr
        {yyrv = new ExprQuestion(((Identifier)yysv[yysp-4]),((String)yysv[yysp-3]),((Type)yysv[yysp-2]),((Expr)yysv[yysp-1]));}
        yysv[yysp-=4] = yyrv;
        return 6;
    }

    private int yyr8() { // question : IDENTIFIER LABEL type
        {yyrv = new Question(((Identifier)yysv[yysp-3]),((String)yysv[yysp-2]),((Type)yysv[yysp-1]));}
        yysv[yysp-=3] = yyrv;
        return 6;
    }

    private int yyr5() { // statement : question
        yysp -= 1;
        return yypstatement();
    }

    private int yyr6() { // statement : conditional
        yysp -= 1;
        return yypstatement();
    }

    private int yypstatement() {
        switch (yyst[yysp-1]) {
            case 47: return 7;
            case 5: return 7;
            default: return 12;
        }
    }

    private int yyr3() { // statements : statements statement
        yysp -= 2;
        return yypstatements();
    }

    private int yyr4() { // statements : statement
        yysp -= 1;
        return yypstatements();
    }

    private int yypstatements() {
        switch (yyst[yysp-1]) {
            case 5: return 8;
            default: return 61;
        }
    }

    private int yyr9() { // conditional : IF '(' IDENTIFIER ')' '{' statements '}'
        {yyrv = new IfConditional(((Identifier)yysv[yysp-5]),yysv[yysp-2]);}
        yysv[yysp-=7] = yyrv;
        return 9;
    }

    private int yyr10() { // type : MONEY
        { yyrv = new Type(((Type)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 16;
    }

    private int yyr11() { // type : DATE
        { yyrv = new Type(((Type)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 16;
    }

    private int yyr12() { // type : INT
        { yyrv = new Type(((Int)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 16;
    }

    private int yyr13() { // type : DECIMAL
        { yyrv = new Type(((Type)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 16;
    }

    private int yyr14() { // type : BOOLEAN
        { yyrv = new Type(((Type)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 16;
    }

    protected String[] yyerrmsgs = {
    };

private QLLexer lexer; 

private Expr result;

public Expr getResult() {
  return result;
}

public QLParser(QLLexer lexer) { 
  this.lexer = lexer; 
}

private void yyerror(String msg) { 
  System.err.println(msg); 
}

}
