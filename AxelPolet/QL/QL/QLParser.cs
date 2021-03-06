﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;

namespace QL
{
    partial class QLParser : IAntlrErrorListener<IToken>
    {
        public void SyntaxError(IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
        {
            //base.SyntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
            Console.WriteLine("Parser error at line {0}, char {1}", line, charPositionInLine);
        }
    }
}
