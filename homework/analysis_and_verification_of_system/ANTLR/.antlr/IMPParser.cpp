
// Generated from /root/IMP-Parser/ANTLR/IMP.g4 by ANTLR 4.8



#include "IMPParser.h"


using namespace antlrcpp;
using namespace antlr4;

IMPParser::IMPParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

IMPParser::~IMPParser() {
  delete _interpreter;
}

std::string IMPParser::getGrammarFileName() const {
  return "IMP.g4";
}

const std::vector<std::string>& IMPParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& IMPParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- MainContext ------------------------------------------------------------------

IMPParser::MainContext::MainContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

IMPParser::BlockContext* IMPParser::MainContext::block() {
  return getRuleContext<IMPParser::BlockContext>(0);
}

IMPParser::AssignmentContext* IMPParser::MainContext::assignment() {
  return getRuleContext<IMPParser::AssignmentContext>(0);
}

IMPParser::IfStmtContext* IMPParser::MainContext::ifStmt() {
  return getRuleContext<IMPParser::IfStmtContext>(0);
}

IMPParser::WhileStmtContext* IMPParser::MainContext::whileStmt() {
  return getRuleContext<IMPParser::WhileStmtContext>(0);
}

IMPParser::SequenceContext* IMPParser::MainContext::sequence() {
  return getRuleContext<IMPParser::SequenceContext>(0);
}


size_t IMPParser::MainContext::getRuleIndex() const {
  return IMPParser::RuleMain;
}


IMPParser::MainContext* IMPParser::main() {
  MainContext *_localctx = _tracker.createInstance<MainContext>(_ctx, getState());
  enterRule(_localctx, 0, IMPParser::RuleMain);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(37);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(32);
      block();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(33);
      assignment();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(34);
      ifStmt();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(35);
      whileStmt();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(36);
      sequence();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockContext ------------------------------------------------------------------

IMPParser::BlockContext::BlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

IMPParser::BlockContext* IMPParser::BlockContext::block() {
  return getRuleContext<IMPParser::BlockContext>(0);
}

IMPParser::AssignmentContext* IMPParser::BlockContext::assignment() {
  return getRuleContext<IMPParser::AssignmentContext>(0);
}

IMPParser::IfStmtContext* IMPParser::BlockContext::ifStmt() {
  return getRuleContext<IMPParser::IfStmtContext>(0);
}

IMPParser::WhileStmtContext* IMPParser::BlockContext::whileStmt() {
  return getRuleContext<IMPParser::WhileStmtContext>(0);
}

IMPParser::SequenceContext* IMPParser::BlockContext::sequence() {
  return getRuleContext<IMPParser::SequenceContext>(0);
}


size_t IMPParser::BlockContext::getRuleIndex() const {
  return IMPParser::RuleBlock;
}


IMPParser::BlockContext* IMPParser::block() {
  BlockContext *_localctx = _tracker.createInstance<BlockContext>(_ctx, getState());
  enterRule(_localctx, 2, IMPParser::RuleBlock);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(51);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(39);
      match(IMPParser::T__0);
      setState(40);
      match(IMPParser::T__1);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(41);
      match(IMPParser::T__0);
      setState(47);
      _errHandler->sync(this);
      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
      case 1: {
        setState(42);
        block();
        break;
      }

      case 2: {
        setState(43);
        assignment();
        break;
      }

      case 3: {
        setState(44);
        ifStmt();
        break;
      }

      case 4: {
        setState(45);
        whileStmt();
        break;
      }

      case 5: {
        setState(46);
        sequence();
        break;
      }

      }
      setState(49);
      match(IMPParser::T__1);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AssignmentContext ------------------------------------------------------------------

IMPParser::AssignmentContext::AssignmentContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> IMPParser::AssignmentContext::Var() {
  return getTokens(IMPParser::Var);
}

tree::TerminalNode* IMPParser::AssignmentContext::Var(size_t i) {
  return getToken(IMPParser::Var, i);
}

tree::TerminalNode* IMPParser::AssignmentContext::Integer() {
  return getToken(IMPParser::Integer, 0);
}

IMPParser::BracketAExprContext* IMPParser::AssignmentContext::bracketAExpr() {
  return getRuleContext<IMPParser::BracketAExprContext>(0);
}


size_t IMPParser::AssignmentContext::getRuleIndex() const {
  return IMPParser::RuleAssignment;
}


IMPParser::AssignmentContext* IMPParser::assignment() {
  AssignmentContext *_localctx = _tracker.createInstance<AssignmentContext>(_ctx, getState());
  enterRule(_localctx, 4, IMPParser::RuleAssignment);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(53);
    match(IMPParser::Var);
    setState(54);
    match(IMPParser::T__2);
    setState(58);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case IMPParser::Var: {
        setState(55);
        match(IMPParser::Var);
        break;
      }

      case IMPParser::Integer: {
        setState(56);
        match(IMPParser::Integer);
        break;
      }

      case IMPParser::T__12: {
        setState(57);
        bracketAExpr();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    setState(60);
    match(IMPParser::T__3);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IfStmtContext ------------------------------------------------------------------

IMPParser::IfStmtContext::IfStmtContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

IMPParser::BracketBExprContext* IMPParser::IfStmtContext::bracketBExpr() {
  return getRuleContext<IMPParser::BracketBExprContext>(0);
}

std::vector<IMPParser::BlockContext *> IMPParser::IfStmtContext::block() {
  return getRuleContexts<IMPParser::BlockContext>();
}

IMPParser::BlockContext* IMPParser::IfStmtContext::block(size_t i) {
  return getRuleContext<IMPParser::BlockContext>(i);
}


size_t IMPParser::IfStmtContext::getRuleIndex() const {
  return IMPParser::RuleIfStmt;
}


IMPParser::IfStmtContext* IMPParser::ifStmt() {
  IfStmtContext *_localctx = _tracker.createInstance<IfStmtContext>(_ctx, getState());
  enterRule(_localctx, 6, IMPParser::RuleIfStmt);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(62);
    match(IMPParser::T__4);
    setState(63);
    bracketBExpr();
    setState(64);
    match(IMPParser::T__5);
    setState(65);
    block();
    setState(66);
    match(IMPParser::T__6);
    setState(67);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- WhileStmtContext ------------------------------------------------------------------

IMPParser::WhileStmtContext::WhileStmtContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

IMPParser::BracketBExprContext* IMPParser::WhileStmtContext::bracketBExpr() {
  return getRuleContext<IMPParser::BracketBExprContext>(0);
}

IMPParser::BlockContext* IMPParser::WhileStmtContext::block() {
  return getRuleContext<IMPParser::BlockContext>(0);
}


size_t IMPParser::WhileStmtContext::getRuleIndex() const {
  return IMPParser::RuleWhileStmt;
}


IMPParser::WhileStmtContext* IMPParser::whileStmt() {
  WhileStmtContext *_localctx = _tracker.createInstance<WhileStmtContext>(_ctx, getState());
  enterRule(_localctx, 8, IMPParser::RuleWhileStmt);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(69);
    match(IMPParser::T__7);
    setState(70);
    bracketBExpr();
    setState(71);
    match(IMPParser::T__8);
    setState(72);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SequenceContext ------------------------------------------------------------------

IMPParser::SequenceContext::SequenceContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<IMPParser::BlockContext *> IMPParser::SequenceContext::block() {
  return getRuleContexts<IMPParser::BlockContext>();
}

IMPParser::BlockContext* IMPParser::SequenceContext::block(size_t i) {
  return getRuleContext<IMPParser::BlockContext>(i);
}

std::vector<IMPParser::AssignmentContext *> IMPParser::SequenceContext::assignment() {
  return getRuleContexts<IMPParser::AssignmentContext>();
}

IMPParser::AssignmentContext* IMPParser::SequenceContext::assignment(size_t i) {
  return getRuleContext<IMPParser::AssignmentContext>(i);
}

std::vector<IMPParser::IfStmtContext *> IMPParser::SequenceContext::ifStmt() {
  return getRuleContexts<IMPParser::IfStmtContext>();
}

IMPParser::IfStmtContext* IMPParser::SequenceContext::ifStmt(size_t i) {
  return getRuleContext<IMPParser::IfStmtContext>(i);
}

std::vector<IMPParser::WhileStmtContext *> IMPParser::SequenceContext::whileStmt() {
  return getRuleContexts<IMPParser::WhileStmtContext>();
}

IMPParser::WhileStmtContext* IMPParser::SequenceContext::whileStmt(size_t i) {
  return getRuleContext<IMPParser::WhileStmtContext>(i);
}

IMPParser::SequenceContext* IMPParser::SequenceContext::sequence() {
  return getRuleContext<IMPParser::SequenceContext>(0);
}


size_t IMPParser::SequenceContext::getRuleIndex() const {
  return IMPParser::RuleSequence;
}


IMPParser::SequenceContext* IMPParser::sequence() {
  SequenceContext *_localctx = _tracker.createInstance<SequenceContext>(_ctx, getState());
  enterRule(_localctx, 10, IMPParser::RuleSequence);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(78);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case IMPParser::T__0: {
        setState(74);
        block();
        break;
      }

      case IMPParser::Var: {
        setState(75);
        assignment();
        break;
      }

      case IMPParser::T__4: {
        setState(76);
        ifStmt();
        break;
      }

      case IMPParser::T__7: {
        setState(77);
        whileStmt();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    setState(85);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx)) {
    case 1: {
      setState(80);
      block();
      break;
    }

    case 2: {
      setState(81);
      assignment();
      break;
    }

    case 3: {
      setState(82);
      ifStmt();
      break;
    }

    case 4: {
      setState(83);
      whileStmt();
      break;
    }

    case 5: {
      setState(84);
      sequence();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- PlusContext ------------------------------------------------------------------

IMPParser::PlusContext::PlusContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> IMPParser::PlusContext::Var() {
  return getTokens(IMPParser::Var);
}

tree::TerminalNode* IMPParser::PlusContext::Var(size_t i) {
  return getToken(IMPParser::Var, i);
}

std::vector<tree::TerminalNode *> IMPParser::PlusContext::Integer() {
  return getTokens(IMPParser::Integer);
}

tree::TerminalNode* IMPParser::PlusContext::Integer(size_t i) {
  return getToken(IMPParser::Integer, i);
}

std::vector<IMPParser::BracketAExprContext *> IMPParser::PlusContext::bracketAExpr() {
  return getRuleContexts<IMPParser::BracketAExprContext>();
}

IMPParser::BracketAExprContext* IMPParser::PlusContext::bracketAExpr(size_t i) {
  return getRuleContext<IMPParser::BracketAExprContext>(i);
}


size_t IMPParser::PlusContext::getRuleIndex() const {
  return IMPParser::RulePlus;
}


IMPParser::PlusContext* IMPParser::plus() {
  PlusContext *_localctx = _tracker.createInstance<PlusContext>(_ctx, getState());
  enterRule(_localctx, 12, IMPParser::RulePlus);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(90);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case IMPParser::Var: {
        setState(87);
        match(IMPParser::Var);
        break;
      }

      case IMPParser::Integer: {
        setState(88);
        match(IMPParser::Integer);
        break;
      }

      case IMPParser::T__12: {
        setState(89);
        bracketAExpr();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    setState(92);
    match(IMPParser::T__9);
    setState(96);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case IMPParser::Var: {
        setState(93);
        match(IMPParser::Var);
        break;
      }

      case IMPParser::Integer: {
        setState(94);
        match(IMPParser::Integer);
        break;
      }

      case IMPParser::T__12: {
        setState(95);
        bracketAExpr();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MinusContext ------------------------------------------------------------------

IMPParser::MinusContext::MinusContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> IMPParser::MinusContext::Var() {
  return getTokens(IMPParser::Var);
}

tree::TerminalNode* IMPParser::MinusContext::Var(size_t i) {
  return getToken(IMPParser::Var, i);
}

std::vector<tree::TerminalNode *> IMPParser::MinusContext::Integer() {
  return getTokens(IMPParser::Integer);
}

tree::TerminalNode* IMPParser::MinusContext::Integer(size_t i) {
  return getToken(IMPParser::Integer, i);
}

std::vector<IMPParser::BracketAExprContext *> IMPParser::MinusContext::bracketAExpr() {
  return getRuleContexts<IMPParser::BracketAExprContext>();
}

IMPParser::BracketAExprContext* IMPParser::MinusContext::bracketAExpr(size_t i) {
  return getRuleContext<IMPParser::BracketAExprContext>(i);
}


size_t IMPParser::MinusContext::getRuleIndex() const {
  return IMPParser::RuleMinus;
}


IMPParser::MinusContext* IMPParser::minus() {
  MinusContext *_localctx = _tracker.createInstance<MinusContext>(_ctx, getState());
  enterRule(_localctx, 14, IMPParser::RuleMinus);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(101);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case IMPParser::Var: {
        setState(98);
        match(IMPParser::Var);
        break;
      }

      case IMPParser::Integer: {
        setState(99);
        match(IMPParser::Integer);
        break;
      }

      case IMPParser::T__12: {
        setState(100);
        bracketAExpr();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    setState(103);
    match(IMPParser::T__10);
    setState(107);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case IMPParser::Var: {
        setState(104);
        match(IMPParser::Var);
        break;
      }

      case IMPParser::Integer: {
        setState(105);
        match(IMPParser::Integer);
        break;
      }

      case IMPParser::T__12: {
        setState(106);
        bracketAExpr();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TimesContext ------------------------------------------------------------------

IMPParser::TimesContext::TimesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> IMPParser::TimesContext::Var() {
  return getTokens(IMPParser::Var);
}

tree::TerminalNode* IMPParser::TimesContext::Var(size_t i) {
  return getToken(IMPParser::Var, i);
}

std::vector<tree::TerminalNode *> IMPParser::TimesContext::Integer() {
  return getTokens(IMPParser::Integer);
}

tree::TerminalNode* IMPParser::TimesContext::Integer(size_t i) {
  return getToken(IMPParser::Integer, i);
}

std::vector<IMPParser::BracketAExprContext *> IMPParser::TimesContext::bracketAExpr() {
  return getRuleContexts<IMPParser::BracketAExprContext>();
}

IMPParser::BracketAExprContext* IMPParser::TimesContext::bracketAExpr(size_t i) {
  return getRuleContext<IMPParser::BracketAExprContext>(i);
}


size_t IMPParser::TimesContext::getRuleIndex() const {
  return IMPParser::RuleTimes;
}


IMPParser::TimesContext* IMPParser::times() {
  TimesContext *_localctx = _tracker.createInstance<TimesContext>(_ctx, getState());
  enterRule(_localctx, 16, IMPParser::RuleTimes);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(112);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case IMPParser::Var: {
        setState(109);
        match(IMPParser::Var);
        break;
      }

      case IMPParser::Integer: {
        setState(110);
        match(IMPParser::Integer);
        break;
      }

      case IMPParser::T__12: {
        setState(111);
        bracketAExpr();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    setState(114);
    match(IMPParser::T__11);
    setState(118);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case IMPParser::Var: {
        setState(115);
        match(IMPParser::Var);
        break;
      }

      case IMPParser::Integer: {
        setState(116);
        match(IMPParser::Integer);
        break;
      }

      case IMPParser::T__12: {
        setState(117);
        bracketAExpr();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BracketAExprContext ------------------------------------------------------------------

IMPParser::BracketAExprContext::BracketAExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* IMPParser::BracketAExprContext::Var() {
  return getToken(IMPParser::Var, 0);
}

tree::TerminalNode* IMPParser::BracketAExprContext::Integer() {
  return getToken(IMPParser::Integer, 0);
}

IMPParser::PlusContext* IMPParser::BracketAExprContext::plus() {
  return getRuleContext<IMPParser::PlusContext>(0);
}

IMPParser::MinusContext* IMPParser::BracketAExprContext::minus() {
  return getRuleContext<IMPParser::MinusContext>(0);
}

IMPParser::TimesContext* IMPParser::BracketAExprContext::times() {
  return getRuleContext<IMPParser::TimesContext>(0);
}

IMPParser::BracketAExprContext* IMPParser::BracketAExprContext::bracketAExpr() {
  return getRuleContext<IMPParser::BracketAExprContext>(0);
}


size_t IMPParser::BracketAExprContext::getRuleIndex() const {
  return IMPParser::RuleBracketAExpr;
}


IMPParser::BracketAExprContext* IMPParser::bracketAExpr() {
  BracketAExprContext *_localctx = _tracker.createInstance<BracketAExprContext>(_ctx, getState());
  enterRule(_localctx, 18, IMPParser::RuleBracketAExpr);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(120);
    match(IMPParser::T__12);
    setState(127);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx)) {
    case 1: {
      setState(121);
      match(IMPParser::Var);
      break;
    }

    case 2: {
      setState(122);
      match(IMPParser::Integer);
      break;
    }

    case 3: {
      setState(123);
      plus();
      break;
    }

    case 4: {
      setState(124);
      minus();
      break;
    }

    case 5: {
      setState(125);
      times();
      break;
    }

    case 6: {
      setState(126);
      bracketAExpr();
      break;
    }

    }
    setState(129);
    match(IMPParser::T__13);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BracketBExprContext ------------------------------------------------------------------

IMPParser::BracketBExprContext::BracketBExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* IMPParser::BracketBExprContext::Bool() {
  return getToken(IMPParser::Bool, 0);
}

IMPParser::ImpandContext* IMPParser::BracketBExprContext::impand() {
  return getRuleContext<IMPParser::ImpandContext>(0);
}

IMPParser::ImpnotContext* IMPParser::BracketBExprContext::impnot() {
  return getRuleContext<IMPParser::ImpnotContext>(0);
}

IMPParser::ImporContext* IMPParser::BracketBExprContext::impor() {
  return getRuleContext<IMPParser::ImporContext>(0);
}

IMPParser::BracketBExprContext* IMPParser::BracketBExprContext::bracketBExpr() {
  return getRuleContext<IMPParser::BracketBExprContext>(0);
}


size_t IMPParser::BracketBExprContext::getRuleIndex() const {
  return IMPParser::RuleBracketBExpr;
}


IMPParser::BracketBExprContext* IMPParser::bracketBExpr() {
  BracketBExprContext *_localctx = _tracker.createInstance<BracketBExprContext>(_ctx, getState());
  enterRule(_localctx, 20, IMPParser::RuleBracketBExpr);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(131);
    match(IMPParser::T__12);
    setState(137);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx)) {
    case 1: {
      setState(132);
      match(IMPParser::Bool);
      break;
    }

    case 2: {
      setState(133);
      impand(0);
      break;
    }

    case 3: {
      setState(134);
      impnot();
      break;
    }

    case 4: {
      setState(135);
      impor(0);
      break;
    }

    case 5: {
      setState(136);
      bracketBExpr();
      break;
    }

    }
    setState(139);
    match(IMPParser::T__13);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ImpandContext ------------------------------------------------------------------

IMPParser::ImpandContext::ImpandContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> IMPParser::ImpandContext::Bool() {
  return getTokens(IMPParser::Bool);
}

tree::TerminalNode* IMPParser::ImpandContext::Bool(size_t i) {
  return getToken(IMPParser::Bool, i);
}

std::vector<IMPParser::LesserContext *> IMPParser::ImpandContext::lesser() {
  return getRuleContexts<IMPParser::LesserContext>();
}

IMPParser::LesserContext* IMPParser::ImpandContext::lesser(size_t i) {
  return getRuleContext<IMPParser::LesserContext>(i);
}

std::vector<IMPParser::EqualContext *> IMPParser::ImpandContext::equal() {
  return getRuleContexts<IMPParser::EqualContext>();
}

IMPParser::EqualContext* IMPParser::ImpandContext::equal(size_t i) {
  return getRuleContext<IMPParser::EqualContext>(i);
}

std::vector<IMPParser::BracketBExprContext *> IMPParser::ImpandContext::bracketBExpr() {
  return getRuleContexts<IMPParser::BracketBExprContext>();
}

IMPParser::BracketBExprContext* IMPParser::ImpandContext::bracketBExpr(size_t i) {
  return getRuleContext<IMPParser::BracketBExprContext>(i);
}

IMPParser::ImpandContext* IMPParser::ImpandContext::impand() {
  return getRuleContext<IMPParser::ImpandContext>(0);
}


size_t IMPParser::ImpandContext::getRuleIndex() const {
  return IMPParser::RuleImpand;
}



IMPParser::ImpandContext* IMPParser::impand() {
   return impand(0);
}

IMPParser::ImpandContext* IMPParser::impand(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  IMPParser::ImpandContext *_localctx = _tracker.createInstance<ImpandContext>(_ctx, parentState);
  IMPParser::ImpandContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 22;
  enterRecursionRule(_localctx, 22, IMPParser::RuleImpand, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(146);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx)) {
    case 1: {
      setState(142);
      match(IMPParser::Bool);
      break;
    }

    case 2: {
      setState(143);
      lesser();
      break;
    }

    case 3: {
      setState(144);
      equal();
      break;
    }

    case 4: {
      setState(145);
      bracketBExpr();
      break;
    }

    }
    setState(148);
    match(IMPParser::T__14);
    setState(153);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx)) {
    case 1: {
      setState(149);
      match(IMPParser::Bool);
      break;
    }

    case 2: {
      setState(150);
      lesser();
      break;
    }

    case 3: {
      setState(151);
      equal();
      break;
    }

    case 4: {
      setState(152);
      bracketBExpr();
      break;
    }

    }
    _ctx->stop = _input->LT(-1);
    setState(165);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<ImpandContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleImpand);
        setState(155);

        if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
        setState(156);
        match(IMPParser::T__14);
        setState(161);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 16, _ctx)) {
        case 1: {
          setState(157);
          match(IMPParser::Bool);
          break;
        }

        case 2: {
          setState(158);
          lesser();
          break;
        }

        case 3: {
          setState(159);
          equal();
          break;
        }

        case 4: {
          setState(160);
          bracketBExpr();
          break;
        }

        } 
      }
      setState(167);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- ImporContext ------------------------------------------------------------------

IMPParser::ImporContext::ImporContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> IMPParser::ImporContext::Bool() {
  return getTokens(IMPParser::Bool);
}

tree::TerminalNode* IMPParser::ImporContext::Bool(size_t i) {
  return getToken(IMPParser::Bool, i);
}

std::vector<IMPParser::LesserContext *> IMPParser::ImporContext::lesser() {
  return getRuleContexts<IMPParser::LesserContext>();
}

IMPParser::LesserContext* IMPParser::ImporContext::lesser(size_t i) {
  return getRuleContext<IMPParser::LesserContext>(i);
}

std::vector<IMPParser::EqualContext *> IMPParser::ImporContext::equal() {
  return getRuleContexts<IMPParser::EqualContext>();
}

IMPParser::EqualContext* IMPParser::ImporContext::equal(size_t i) {
  return getRuleContext<IMPParser::EqualContext>(i);
}

std::vector<IMPParser::BracketBExprContext *> IMPParser::ImporContext::bracketBExpr() {
  return getRuleContexts<IMPParser::BracketBExprContext>();
}

IMPParser::BracketBExprContext* IMPParser::ImporContext::bracketBExpr(size_t i) {
  return getRuleContext<IMPParser::BracketBExprContext>(i);
}

IMPParser::ImporContext* IMPParser::ImporContext::impor() {
  return getRuleContext<IMPParser::ImporContext>(0);
}


size_t IMPParser::ImporContext::getRuleIndex() const {
  return IMPParser::RuleImpor;
}



IMPParser::ImporContext* IMPParser::impor() {
   return impor(0);
}

IMPParser::ImporContext* IMPParser::impor(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  IMPParser::ImporContext *_localctx = _tracker.createInstance<ImporContext>(_ctx, parentState);
  IMPParser::ImporContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 24;
  enterRecursionRule(_localctx, 24, IMPParser::RuleImpor, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(173);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 18, _ctx)) {
    case 1: {
      setState(169);
      match(IMPParser::Bool);
      break;
    }

    case 2: {
      setState(170);
      lesser();
      break;
    }

    case 3: {
      setState(171);
      equal();
      break;
    }

    case 4: {
      setState(172);
      bracketBExpr();
      break;
    }

    }
    setState(175);
    match(IMPParser::T__15);
    setState(180);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx)) {
    case 1: {
      setState(176);
      match(IMPParser::Bool);
      break;
    }

    case 2: {
      setState(177);
      lesser();
      break;
    }

    case 3: {
      setState(178);
      equal();
      break;
    }

    case 4: {
      setState(179);
      bracketBExpr();
      break;
    }

    }
    _ctx->stop = _input->LT(-1);
    setState(192);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<ImporContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleImpor);
        setState(182);

        if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
        setState(183);
        match(IMPParser::T__15);
        setState(188);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx)) {
        case 1: {
          setState(184);
          match(IMPParser::Bool);
          break;
        }

        case 2: {
          setState(185);
          lesser();
          break;
        }

        case 3: {
          setState(186);
          equal();
          break;
        }

        case 4: {
          setState(187);
          bracketBExpr();
          break;
        }

        } 
      }
      setState(194);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- ImpnotContext ------------------------------------------------------------------

IMPParser::ImpnotContext::ImpnotContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* IMPParser::ImpnotContext::Bool() {
  return getToken(IMPParser::Bool, 0);
}

IMPParser::BracketBExprContext* IMPParser::ImpnotContext::bracketBExpr() {
  return getRuleContext<IMPParser::BracketBExprContext>(0);
}

IMPParser::LesserContext* IMPParser::ImpnotContext::lesser() {
  return getRuleContext<IMPParser::LesserContext>(0);
}

IMPParser::EqualContext* IMPParser::ImpnotContext::equal() {
  return getRuleContext<IMPParser::EqualContext>(0);
}


size_t IMPParser::ImpnotContext::getRuleIndex() const {
  return IMPParser::RuleImpnot;
}


IMPParser::ImpnotContext* IMPParser::impnot() {
  ImpnotContext *_localctx = _tracker.createInstance<ImpnotContext>(_ctx, getState());
  enterRule(_localctx, 26, IMPParser::RuleImpnot);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(195);
    match(IMPParser::T__16);
    setState(200);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 22, _ctx)) {
    case 1: {
      setState(196);
      match(IMPParser::Bool);
      break;
    }

    case 2: {
      setState(197);
      bracketBExpr();
      break;
    }

    case 3: {
      setState(198);
      lesser();
      break;
    }

    case 4: {
      setState(199);
      equal();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LesserContext ------------------------------------------------------------------

IMPParser::LesserContext::LesserContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> IMPParser::LesserContext::Var() {
  return getTokens(IMPParser::Var);
}

tree::TerminalNode* IMPParser::LesserContext::Var(size_t i) {
  return getToken(IMPParser::Var, i);
}

std::vector<tree::TerminalNode *> IMPParser::LesserContext::Integer() {
  return getTokens(IMPParser::Integer);
}

tree::TerminalNode* IMPParser::LesserContext::Integer(size_t i) {
  return getToken(IMPParser::Integer, i);
}

std::vector<IMPParser::PlusContext *> IMPParser::LesserContext::plus() {
  return getRuleContexts<IMPParser::PlusContext>();
}

IMPParser::PlusContext* IMPParser::LesserContext::plus(size_t i) {
  return getRuleContext<IMPParser::PlusContext>(i);
}

std::vector<IMPParser::MinusContext *> IMPParser::LesserContext::minus() {
  return getRuleContexts<IMPParser::MinusContext>();
}

IMPParser::MinusContext* IMPParser::LesserContext::minus(size_t i) {
  return getRuleContext<IMPParser::MinusContext>(i);
}

std::vector<IMPParser::TimesContext *> IMPParser::LesserContext::times() {
  return getRuleContexts<IMPParser::TimesContext>();
}

IMPParser::TimesContext* IMPParser::LesserContext::times(size_t i) {
  return getRuleContext<IMPParser::TimesContext>(i);
}

std::vector<IMPParser::BracketAExprContext *> IMPParser::LesserContext::bracketAExpr() {
  return getRuleContexts<IMPParser::BracketAExprContext>();
}

IMPParser::BracketAExprContext* IMPParser::LesserContext::bracketAExpr(size_t i) {
  return getRuleContext<IMPParser::BracketAExprContext>(i);
}


size_t IMPParser::LesserContext::getRuleIndex() const {
  return IMPParser::RuleLesser;
}


IMPParser::LesserContext* IMPParser::lesser() {
  LesserContext *_localctx = _tracker.createInstance<LesserContext>(_ctx, getState());
  enterRule(_localctx, 28, IMPParser::RuleLesser);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(208);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx)) {
    case 1: {
      setState(202);
      match(IMPParser::Var);
      break;
    }

    case 2: {
      setState(203);
      match(IMPParser::Integer);
      break;
    }

    case 3: {
      setState(204);
      plus();
      break;
    }

    case 4: {
      setState(205);
      minus();
      break;
    }

    case 5: {
      setState(206);
      times();
      break;
    }

    case 6: {
      setState(207);
      bracketAExpr();
      break;
    }

    }
    setState(210);
    match(IMPParser::T__17);
    setState(217);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 24, _ctx)) {
    case 1: {
      setState(211);
      match(IMPParser::Var);
      break;
    }

    case 2: {
      setState(212);
      match(IMPParser::Integer);
      break;
    }

    case 3: {
      setState(213);
      plus();
      break;
    }

    case 4: {
      setState(214);
      minus();
      break;
    }

    case 5: {
      setState(215);
      times();
      break;
    }

    case 6: {
      setState(216);
      bracketAExpr();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- EqualContext ------------------------------------------------------------------

IMPParser::EqualContext::EqualContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> IMPParser::EqualContext::Var() {
  return getTokens(IMPParser::Var);
}

tree::TerminalNode* IMPParser::EqualContext::Var(size_t i) {
  return getToken(IMPParser::Var, i);
}

std::vector<tree::TerminalNode *> IMPParser::EqualContext::Integer() {
  return getTokens(IMPParser::Integer);
}

tree::TerminalNode* IMPParser::EqualContext::Integer(size_t i) {
  return getToken(IMPParser::Integer, i);
}

std::vector<IMPParser::PlusContext *> IMPParser::EqualContext::plus() {
  return getRuleContexts<IMPParser::PlusContext>();
}

IMPParser::PlusContext* IMPParser::EqualContext::plus(size_t i) {
  return getRuleContext<IMPParser::PlusContext>(i);
}

std::vector<IMPParser::MinusContext *> IMPParser::EqualContext::minus() {
  return getRuleContexts<IMPParser::MinusContext>();
}

IMPParser::MinusContext* IMPParser::EqualContext::minus(size_t i) {
  return getRuleContext<IMPParser::MinusContext>(i);
}

std::vector<IMPParser::TimesContext *> IMPParser::EqualContext::times() {
  return getRuleContexts<IMPParser::TimesContext>();
}

IMPParser::TimesContext* IMPParser::EqualContext::times(size_t i) {
  return getRuleContext<IMPParser::TimesContext>(i);
}

std::vector<IMPParser::BracketAExprContext *> IMPParser::EqualContext::bracketAExpr() {
  return getRuleContexts<IMPParser::BracketAExprContext>();
}

IMPParser::BracketAExprContext* IMPParser::EqualContext::bracketAExpr(size_t i) {
  return getRuleContext<IMPParser::BracketAExprContext>(i);
}


size_t IMPParser::EqualContext::getRuleIndex() const {
  return IMPParser::RuleEqual;
}


IMPParser::EqualContext* IMPParser::equal() {
  EqualContext *_localctx = _tracker.createInstance<EqualContext>(_ctx, getState());
  enterRule(_localctx, 30, IMPParser::RuleEqual);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(225);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 25, _ctx)) {
    case 1: {
      setState(219);
      match(IMPParser::Var);
      break;
    }

    case 2: {
      setState(220);
      match(IMPParser::Integer);
      break;
    }

    case 3: {
      setState(221);
      plus();
      break;
    }

    case 4: {
      setState(222);
      minus();
      break;
    }

    case 5: {
      setState(223);
      times();
      break;
    }

    case 6: {
      setState(224);
      bracketAExpr();
      break;
    }

    }
    setState(227);
    match(IMPParser::T__18);
    setState(234);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 26, _ctx)) {
    case 1: {
      setState(228);
      match(IMPParser::Var);
      break;
    }

    case 2: {
      setState(229);
      match(IMPParser::Integer);
      break;
    }

    case 3: {
      setState(230);
      plus();
      break;
    }

    case 4: {
      setState(231);
      minus();
      break;
    }

    case 5: {
      setState(232);
      times();
      break;
    }

    case 6: {
      setState(233);
      bracketAExpr();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

bool IMPParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 11: return impandSempred(dynamic_cast<ImpandContext *>(context), predicateIndex);
    case 12: return imporSempred(dynamic_cast<ImporContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool IMPParser::impandSempred(ImpandContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 2);

  default:
    break;
  }
  return true;
}

bool IMPParser::imporSempred(ImporContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 1: return precpred(_ctx, 2);

  default:
    break;
  }
  return true;
}

// Static vars and initialization.
std::vector<dfa::DFA> IMPParser::_decisionToDFA;
atn::PredictionContextCache IMPParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN IMPParser::_atn;
std::vector<uint16_t> IMPParser::_serializedATN;

std::vector<std::string> IMPParser::_ruleNames = {
  "main", "block", "assignment", "ifStmt", "whileStmt", "sequence", "plus", 
  "minus", "times", "bracketAExpr", "bracketBExpr", "impand", "impor", "impnot", 
  "lesser", "equal"
};

std::vector<std::string> IMPParser::_literalNames = {
  "", "'{'", "'}'", "':='", "';'", "'if'", "'then'", "'else'", "'while'", 
  "'do'", "'+'", "'-'", "'*'", "'('", "')'", "'&&'", "'||'", "'!'", "'<'", 
  "'=='"
};

std::vector<std::string> IMPParser::_symbolicNames = {
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "AVAL", "BVAL", "VAR", "WS", "Integer", "Bool", "Var"
};

dfa::Vocabulary IMPParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> IMPParser::_tokenNames;

IMPParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x3, 0x1c, 0xef, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 0x9, 
    0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 0x7, 0x4, 
    0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 0x4, 0xb, 0x9, 
    0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 0xe, 0x9, 0xe, 0x4, 
    0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 0x9, 0x11, 0x3, 0x2, 
    0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x5, 0x2, 0x28, 0xa, 0x2, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
    0x3, 0x5, 0x3, 0x32, 0xa, 0x3, 0x3, 0x3, 0x3, 0x3, 0x5, 0x3, 0x36, 0xa, 
    0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 0x3d, 
    0xa, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 
    0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 
    0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x5, 0x7, 0x51, 0xa, 
    0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x5, 0x7, 0x58, 
    0xa, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x5, 0x8, 0x5d, 0xa, 0x8, 0x3, 
    0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x5, 0x8, 0x63, 0xa, 0x8, 0x3, 0x9, 
    0x3, 0x9, 0x3, 0x9, 0x5, 0x9, 0x68, 0xa, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 
    0x9, 0x3, 0x9, 0x5, 0x9, 0x6e, 0xa, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x5, 0xa, 0x73, 0xa, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x5, 
    0xa, 0x79, 0xa, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 
    0x3, 0xb, 0x3, 0xb, 0x5, 0xb, 0x82, 0xa, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 
    0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0x8c, 
    0xa, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
    0x3, 0xd, 0x5, 0xd, 0x95, 0xa, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
    0xd, 0x3, 0xd, 0x5, 0xd, 0x9c, 0xa, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
    0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x5, 0xd, 0xa4, 0xa, 0xd, 0x7, 0xd, 0xa6, 
    0xa, 0xd, 0xc, 0xd, 0xe, 0xd, 0xa9, 0xb, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 
    0xe, 0x3, 0xe, 0x3, 0xe, 0x5, 0xe, 0xb0, 0xa, 0xe, 0x3, 0xe, 0x3, 0xe, 
    0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x5, 0xe, 0xb7, 0xa, 0xe, 0x3, 0xe, 0x3, 
    0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x5, 0xe, 0xbf, 0xa, 0xe, 
    0x7, 0xe, 0xc1, 0xa, 0xe, 0xc, 0xe, 0xe, 0xe, 0xc4, 0xb, 0xe, 0x3, 0xf, 
    0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x5, 0xf, 0xcb, 0xa, 0xf, 0x3, 
    0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x5, 0x10, 
    0xd3, 0xa, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 
    0x3, 0x10, 0x3, 0x10, 0x5, 0x10, 0xdc, 0xa, 0x10, 0x3, 0x11, 0x3, 0x11, 
    0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x5, 0x11, 0xe4, 0xa, 0x11, 
    0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 
    0x11, 0x5, 0x11, 0xed, 0xa, 0x11, 0x3, 0x11, 0x2, 0x4, 0x18, 0x1a, 0x12, 
    0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 
    0x1c, 0x1e, 0x20, 0x2, 0x2, 0x2, 0x130, 0x2, 0x27, 0x3, 0x2, 0x2, 0x2, 
    0x4, 0x35, 0x3, 0x2, 0x2, 0x2, 0x6, 0x37, 0x3, 0x2, 0x2, 0x2, 0x8, 0x40, 
    0x3, 0x2, 0x2, 0x2, 0xa, 0x47, 0x3, 0x2, 0x2, 0x2, 0xc, 0x50, 0x3, 0x2, 
    0x2, 0x2, 0xe, 0x5c, 0x3, 0x2, 0x2, 0x2, 0x10, 0x67, 0x3, 0x2, 0x2, 
    0x2, 0x12, 0x72, 0x3, 0x2, 0x2, 0x2, 0x14, 0x7a, 0x3, 0x2, 0x2, 0x2, 
    0x16, 0x85, 0x3, 0x2, 0x2, 0x2, 0x18, 0x8f, 0x3, 0x2, 0x2, 0x2, 0x1a, 
    0xaa, 0x3, 0x2, 0x2, 0x2, 0x1c, 0xc5, 0x3, 0x2, 0x2, 0x2, 0x1e, 0xd2, 
    0x3, 0x2, 0x2, 0x2, 0x20, 0xe3, 0x3, 0x2, 0x2, 0x2, 0x22, 0x28, 0x5, 
    0x4, 0x3, 0x2, 0x23, 0x28, 0x5, 0x6, 0x4, 0x2, 0x24, 0x28, 0x5, 0x8, 
    0x5, 0x2, 0x25, 0x28, 0x5, 0xa, 0x6, 0x2, 0x26, 0x28, 0x5, 0xc, 0x7, 
    0x2, 0x27, 0x22, 0x3, 0x2, 0x2, 0x2, 0x27, 0x23, 0x3, 0x2, 0x2, 0x2, 
    0x27, 0x24, 0x3, 0x2, 0x2, 0x2, 0x27, 0x25, 0x3, 0x2, 0x2, 0x2, 0x27, 
    0x26, 0x3, 0x2, 0x2, 0x2, 0x28, 0x3, 0x3, 0x2, 0x2, 0x2, 0x29, 0x2a, 
    0x7, 0x3, 0x2, 0x2, 0x2a, 0x36, 0x7, 0x4, 0x2, 0x2, 0x2b, 0x31, 0x7, 
    0x3, 0x2, 0x2, 0x2c, 0x32, 0x5, 0x4, 0x3, 0x2, 0x2d, 0x32, 0x5, 0x6, 
    0x4, 0x2, 0x2e, 0x32, 0x5, 0x8, 0x5, 0x2, 0x2f, 0x32, 0x5, 0xa, 0x6, 
    0x2, 0x30, 0x32, 0x5, 0xc, 0x7, 0x2, 0x31, 0x2c, 0x3, 0x2, 0x2, 0x2, 
    0x31, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x31, 0x2e, 0x3, 0x2, 0x2, 0x2, 0x31, 
    0x2f, 0x3, 0x2, 0x2, 0x2, 0x31, 0x30, 0x3, 0x2, 0x2, 0x2, 0x32, 0x33, 
    0x3, 0x2, 0x2, 0x2, 0x33, 0x34, 0x7, 0x4, 0x2, 0x2, 0x34, 0x36, 0x3, 
    0x2, 0x2, 0x2, 0x35, 0x29, 0x3, 0x2, 0x2, 0x2, 0x35, 0x2b, 0x3, 0x2, 
    0x2, 0x2, 0x36, 0x5, 0x3, 0x2, 0x2, 0x2, 0x37, 0x38, 0x7, 0x1c, 0x2, 
    0x2, 0x38, 0x3c, 0x7, 0x5, 0x2, 0x2, 0x39, 0x3d, 0x7, 0x1c, 0x2, 0x2, 
    0x3a, 0x3d, 0x7, 0x1a, 0x2, 0x2, 0x3b, 0x3d, 0x5, 0x14, 0xb, 0x2, 0x3c, 
    0x39, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x3a, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x3b, 
    0x3, 0x2, 0x2, 0x2, 0x3d, 0x3e, 0x3, 0x2, 0x2, 0x2, 0x3e, 0x3f, 0x7, 
    0x6, 0x2, 0x2, 0x3f, 0x7, 0x3, 0x2, 0x2, 0x2, 0x40, 0x41, 0x7, 0x7, 
    0x2, 0x2, 0x41, 0x42, 0x5, 0x16, 0xc, 0x2, 0x42, 0x43, 0x7, 0x8, 0x2, 
    0x2, 0x43, 0x44, 0x5, 0x4, 0x3, 0x2, 0x44, 0x45, 0x7, 0x9, 0x2, 0x2, 
    0x45, 0x46, 0x5, 0x4, 0x3, 0x2, 0x46, 0x9, 0x3, 0x2, 0x2, 0x2, 0x47, 
    0x48, 0x7, 0xa, 0x2, 0x2, 0x48, 0x49, 0x5, 0x16, 0xc, 0x2, 0x49, 0x4a, 
    0x7, 0xb, 0x2, 0x2, 0x4a, 0x4b, 0x5, 0x4, 0x3, 0x2, 0x4b, 0xb, 0x3, 
    0x2, 0x2, 0x2, 0x4c, 0x51, 0x5, 0x4, 0x3, 0x2, 0x4d, 0x51, 0x5, 0x6, 
    0x4, 0x2, 0x4e, 0x51, 0x5, 0x8, 0x5, 0x2, 0x4f, 0x51, 0x5, 0xa, 0x6, 
    0x2, 0x50, 0x4c, 0x3, 0x2, 0x2, 0x2, 0x50, 0x4d, 0x3, 0x2, 0x2, 0x2, 
    0x50, 0x4e, 0x3, 0x2, 0x2, 0x2, 0x50, 0x4f, 0x3, 0x2, 0x2, 0x2, 0x51, 
    0x57, 0x3, 0x2, 0x2, 0x2, 0x52, 0x58, 0x5, 0x4, 0x3, 0x2, 0x53, 0x58, 
    0x5, 0x6, 0x4, 0x2, 0x54, 0x58, 0x5, 0x8, 0x5, 0x2, 0x55, 0x58, 0x5, 
    0xa, 0x6, 0x2, 0x56, 0x58, 0x5, 0xc, 0x7, 0x2, 0x57, 0x52, 0x3, 0x2, 
    0x2, 0x2, 0x57, 0x53, 0x3, 0x2, 0x2, 0x2, 0x57, 0x54, 0x3, 0x2, 0x2, 
    0x2, 0x57, 0x55, 0x3, 0x2, 0x2, 0x2, 0x57, 0x56, 0x3, 0x2, 0x2, 0x2, 
    0x58, 0xd, 0x3, 0x2, 0x2, 0x2, 0x59, 0x5d, 0x7, 0x1c, 0x2, 0x2, 0x5a, 
    0x5d, 0x7, 0x1a, 0x2, 0x2, 0x5b, 0x5d, 0x5, 0x14, 0xb, 0x2, 0x5c, 0x59, 
    0x3, 0x2, 0x2, 0x2, 0x5c, 0x5a, 0x3, 0x2, 0x2, 0x2, 0x5c, 0x5b, 0x3, 
    0x2, 0x2, 0x2, 0x5d, 0x5e, 0x3, 0x2, 0x2, 0x2, 0x5e, 0x62, 0x7, 0xc, 
    0x2, 0x2, 0x5f, 0x63, 0x7, 0x1c, 0x2, 0x2, 0x60, 0x63, 0x7, 0x1a, 0x2, 
    0x2, 0x61, 0x63, 0x5, 0x14, 0xb, 0x2, 0x62, 0x5f, 0x3, 0x2, 0x2, 0x2, 
    0x62, 0x60, 0x3, 0x2, 0x2, 0x2, 0x62, 0x61, 0x3, 0x2, 0x2, 0x2, 0x63, 
    0xf, 0x3, 0x2, 0x2, 0x2, 0x64, 0x68, 0x7, 0x1c, 0x2, 0x2, 0x65, 0x68, 
    0x7, 0x1a, 0x2, 0x2, 0x66, 0x68, 0x5, 0x14, 0xb, 0x2, 0x67, 0x64, 0x3, 
    0x2, 0x2, 0x2, 0x67, 0x65, 0x3, 0x2, 0x2, 0x2, 0x67, 0x66, 0x3, 0x2, 
    0x2, 0x2, 0x68, 0x69, 0x3, 0x2, 0x2, 0x2, 0x69, 0x6d, 0x7, 0xd, 0x2, 
    0x2, 0x6a, 0x6e, 0x7, 0x1c, 0x2, 0x2, 0x6b, 0x6e, 0x7, 0x1a, 0x2, 0x2, 
    0x6c, 0x6e, 0x5, 0x14, 0xb, 0x2, 0x6d, 0x6a, 0x3, 0x2, 0x2, 0x2, 0x6d, 
    0x6b, 0x3, 0x2, 0x2, 0x2, 0x6d, 0x6c, 0x3, 0x2, 0x2, 0x2, 0x6e, 0x11, 
    0x3, 0x2, 0x2, 0x2, 0x6f, 0x73, 0x7, 0x1c, 0x2, 0x2, 0x70, 0x73, 0x7, 
    0x1a, 0x2, 0x2, 0x71, 0x73, 0x5, 0x14, 0xb, 0x2, 0x72, 0x6f, 0x3, 0x2, 
    0x2, 0x2, 0x72, 0x70, 0x3, 0x2, 0x2, 0x2, 0x72, 0x71, 0x3, 0x2, 0x2, 
    0x2, 0x73, 0x74, 0x3, 0x2, 0x2, 0x2, 0x74, 0x78, 0x7, 0xe, 0x2, 0x2, 
    0x75, 0x79, 0x7, 0x1c, 0x2, 0x2, 0x76, 0x79, 0x7, 0x1a, 0x2, 0x2, 0x77, 
    0x79, 0x5, 0x14, 0xb, 0x2, 0x78, 0x75, 0x3, 0x2, 0x2, 0x2, 0x78, 0x76, 
    0x3, 0x2, 0x2, 0x2, 0x78, 0x77, 0x3, 0x2, 0x2, 0x2, 0x79, 0x13, 0x3, 
    0x2, 0x2, 0x2, 0x7a, 0x81, 0x7, 0xf, 0x2, 0x2, 0x7b, 0x82, 0x7, 0x1c, 
    0x2, 0x2, 0x7c, 0x82, 0x7, 0x1a, 0x2, 0x2, 0x7d, 0x82, 0x5, 0xe, 0x8, 
    0x2, 0x7e, 0x82, 0x5, 0x10, 0x9, 0x2, 0x7f, 0x82, 0x5, 0x12, 0xa, 0x2, 
    0x80, 0x82, 0x5, 0x14, 0xb, 0x2, 0x81, 0x7b, 0x3, 0x2, 0x2, 0x2, 0x81, 
    0x7c, 0x3, 0x2, 0x2, 0x2, 0x81, 0x7d, 0x3, 0x2, 0x2, 0x2, 0x81, 0x7e, 
    0x3, 0x2, 0x2, 0x2, 0x81, 0x7f, 0x3, 0x2, 0x2, 0x2, 0x81, 0x80, 0x3, 
    0x2, 0x2, 0x2, 0x82, 0x83, 0x3, 0x2, 0x2, 0x2, 0x83, 0x84, 0x7, 0x10, 
    0x2, 0x2, 0x84, 0x15, 0x3, 0x2, 0x2, 0x2, 0x85, 0x8b, 0x7, 0xf, 0x2, 
    0x2, 0x86, 0x8c, 0x7, 0x1b, 0x2, 0x2, 0x87, 0x8c, 0x5, 0x18, 0xd, 0x2, 
    0x88, 0x8c, 0x5, 0x1c, 0xf, 0x2, 0x89, 0x8c, 0x5, 0x1a, 0xe, 0x2, 0x8a, 
    0x8c, 0x5, 0x16, 0xc, 0x2, 0x8b, 0x86, 0x3, 0x2, 0x2, 0x2, 0x8b, 0x87, 
    0x3, 0x2, 0x2, 0x2, 0x8b, 0x88, 0x3, 0x2, 0x2, 0x2, 0x8b, 0x89, 0x3, 
    0x2, 0x2, 0x2, 0x8b, 0x8a, 0x3, 0x2, 0x2, 0x2, 0x8c, 0x8d, 0x3, 0x2, 
    0x2, 0x2, 0x8d, 0x8e, 0x7, 0x10, 0x2, 0x2, 0x8e, 0x17, 0x3, 0x2, 0x2, 
    0x2, 0x8f, 0x94, 0x8, 0xd, 0x1, 0x2, 0x90, 0x95, 0x7, 0x1b, 0x2, 0x2, 
    0x91, 0x95, 0x5, 0x1e, 0x10, 0x2, 0x92, 0x95, 0x5, 0x20, 0x11, 0x2, 
    0x93, 0x95, 0x5, 0x16, 0xc, 0x2, 0x94, 0x90, 0x3, 0x2, 0x2, 0x2, 0x94, 
    0x91, 0x3, 0x2, 0x2, 0x2, 0x94, 0x92, 0x3, 0x2, 0x2, 0x2, 0x94, 0x93, 
    0x3, 0x2, 0x2, 0x2, 0x95, 0x96, 0x3, 0x2, 0x2, 0x2, 0x96, 0x9b, 0x7, 
    0x11, 0x2, 0x2, 0x97, 0x9c, 0x7, 0x1b, 0x2, 0x2, 0x98, 0x9c, 0x5, 0x1e, 
    0x10, 0x2, 0x99, 0x9c, 0x5, 0x20, 0x11, 0x2, 0x9a, 0x9c, 0x5, 0x16, 
    0xc, 0x2, 0x9b, 0x97, 0x3, 0x2, 0x2, 0x2, 0x9b, 0x98, 0x3, 0x2, 0x2, 
    0x2, 0x9b, 0x99, 0x3, 0x2, 0x2, 0x2, 0x9b, 0x9a, 0x3, 0x2, 0x2, 0x2, 
    0x9c, 0xa7, 0x3, 0x2, 0x2, 0x2, 0x9d, 0x9e, 0xc, 0x4, 0x2, 0x2, 0x9e, 
    0xa3, 0x7, 0x11, 0x2, 0x2, 0x9f, 0xa4, 0x7, 0x1b, 0x2, 0x2, 0xa0, 0xa4, 
    0x5, 0x1e, 0x10, 0x2, 0xa1, 0xa4, 0x5, 0x20, 0x11, 0x2, 0xa2, 0xa4, 
    0x5, 0x16, 0xc, 0x2, 0xa3, 0x9f, 0x3, 0x2, 0x2, 0x2, 0xa3, 0xa0, 0x3, 
    0x2, 0x2, 0x2, 0xa3, 0xa1, 0x3, 0x2, 0x2, 0x2, 0xa3, 0xa2, 0x3, 0x2, 
    0x2, 0x2, 0xa4, 0xa6, 0x3, 0x2, 0x2, 0x2, 0xa5, 0x9d, 0x3, 0x2, 0x2, 
    0x2, 0xa6, 0xa9, 0x3, 0x2, 0x2, 0x2, 0xa7, 0xa5, 0x3, 0x2, 0x2, 0x2, 
    0xa7, 0xa8, 0x3, 0x2, 0x2, 0x2, 0xa8, 0x19, 0x3, 0x2, 0x2, 0x2, 0xa9, 
    0xa7, 0x3, 0x2, 0x2, 0x2, 0xaa, 0xaf, 0x8, 0xe, 0x1, 0x2, 0xab, 0xb0, 
    0x7, 0x1b, 0x2, 0x2, 0xac, 0xb0, 0x5, 0x1e, 0x10, 0x2, 0xad, 0xb0, 0x5, 
    0x20, 0x11, 0x2, 0xae, 0xb0, 0x5, 0x16, 0xc, 0x2, 0xaf, 0xab, 0x3, 0x2, 
    0x2, 0x2, 0xaf, 0xac, 0x3, 0x2, 0x2, 0x2, 0xaf, 0xad, 0x3, 0x2, 0x2, 
    0x2, 0xaf, 0xae, 0x3, 0x2, 0x2, 0x2, 0xb0, 0xb1, 0x3, 0x2, 0x2, 0x2, 
    0xb1, 0xb6, 0x7, 0x12, 0x2, 0x2, 0xb2, 0xb7, 0x7, 0x1b, 0x2, 0x2, 0xb3, 
    0xb7, 0x5, 0x1e, 0x10, 0x2, 0xb4, 0xb7, 0x5, 0x20, 0x11, 0x2, 0xb5, 
    0xb7, 0x5, 0x16, 0xc, 0x2, 0xb6, 0xb2, 0x3, 0x2, 0x2, 0x2, 0xb6, 0xb3, 
    0x3, 0x2, 0x2, 0x2, 0xb6, 0xb4, 0x3, 0x2, 0x2, 0x2, 0xb6, 0xb5, 0x3, 
    0x2, 0x2, 0x2, 0xb7, 0xc2, 0x3, 0x2, 0x2, 0x2, 0xb8, 0xb9, 0xc, 0x4, 
    0x2, 0x2, 0xb9, 0xbe, 0x7, 0x12, 0x2, 0x2, 0xba, 0xbf, 0x7, 0x1b, 0x2, 
    0x2, 0xbb, 0xbf, 0x5, 0x1e, 0x10, 0x2, 0xbc, 0xbf, 0x5, 0x20, 0x11, 
    0x2, 0xbd, 0xbf, 0x5, 0x16, 0xc, 0x2, 0xbe, 0xba, 0x3, 0x2, 0x2, 0x2, 
    0xbe, 0xbb, 0x3, 0x2, 0x2, 0x2, 0xbe, 0xbc, 0x3, 0x2, 0x2, 0x2, 0xbe, 
    0xbd, 0x3, 0x2, 0x2, 0x2, 0xbf, 0xc1, 0x3, 0x2, 0x2, 0x2, 0xc0, 0xb8, 
    0x3, 0x2, 0x2, 0x2, 0xc1, 0xc4, 0x3, 0x2, 0x2, 0x2, 0xc2, 0xc0, 0x3, 
    0x2, 0x2, 0x2, 0xc2, 0xc3, 0x3, 0x2, 0x2, 0x2, 0xc3, 0x1b, 0x3, 0x2, 
    0x2, 0x2, 0xc4, 0xc2, 0x3, 0x2, 0x2, 0x2, 0xc5, 0xca, 0x7, 0x13, 0x2, 
    0x2, 0xc6, 0xcb, 0x7, 0x1b, 0x2, 0x2, 0xc7, 0xcb, 0x5, 0x16, 0xc, 0x2, 
    0xc8, 0xcb, 0x5, 0x1e, 0x10, 0x2, 0xc9, 0xcb, 0x5, 0x20, 0x11, 0x2, 
    0xca, 0xc6, 0x3, 0x2, 0x2, 0x2, 0xca, 0xc7, 0x3, 0x2, 0x2, 0x2, 0xca, 
    0xc8, 0x3, 0x2, 0x2, 0x2, 0xca, 0xc9, 0x3, 0x2, 0x2, 0x2, 0xcb, 0x1d, 
    0x3, 0x2, 0x2, 0x2, 0xcc, 0xd3, 0x7, 0x1c, 0x2, 0x2, 0xcd, 0xd3, 0x7, 
    0x1a, 0x2, 0x2, 0xce, 0xd3, 0x5, 0xe, 0x8, 0x2, 0xcf, 0xd3, 0x5, 0x10, 
    0x9, 0x2, 0xd0, 0xd3, 0x5, 0x12, 0xa, 0x2, 0xd1, 0xd3, 0x5, 0x14, 0xb, 
    0x2, 0xd2, 0xcc, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xcd, 0x3, 0x2, 0x2, 0x2, 
    0xd2, 0xce, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xcf, 0x3, 0x2, 0x2, 0x2, 0xd2, 
    0xd0, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xd1, 0x3, 0x2, 0x2, 0x2, 0xd3, 0xd4, 
    0x3, 0x2, 0x2, 0x2, 0xd4, 0xdb, 0x7, 0x14, 0x2, 0x2, 0xd5, 0xdc, 0x7, 
    0x1c, 0x2, 0x2, 0xd6, 0xdc, 0x7, 0x1a, 0x2, 0x2, 0xd7, 0xdc, 0x5, 0xe, 
    0x8, 0x2, 0xd8, 0xdc, 0x5, 0x10, 0x9, 0x2, 0xd9, 0xdc, 0x5, 0x12, 0xa, 
    0x2, 0xda, 0xdc, 0x5, 0x14, 0xb, 0x2, 0xdb, 0xd5, 0x3, 0x2, 0x2, 0x2, 
    0xdb, 0xd6, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xd7, 0x3, 0x2, 0x2, 0x2, 0xdb, 
    0xd8, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xd9, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xda, 
    0x3, 0x2, 0x2, 0x2, 0xdc, 0x1f, 0x3, 0x2, 0x2, 0x2, 0xdd, 0xe4, 0x7, 
    0x1c, 0x2, 0x2, 0xde, 0xe4, 0x7, 0x1a, 0x2, 0x2, 0xdf, 0xe4, 0x5, 0xe, 
    0x8, 0x2, 0xe0, 0xe4, 0x5, 0x10, 0x9, 0x2, 0xe1, 0xe4, 0x5, 0x12, 0xa, 
    0x2, 0xe2, 0xe4, 0x5, 0x14, 0xb, 0x2, 0xe3, 0xdd, 0x3, 0x2, 0x2, 0x2, 
    0xe3, 0xde, 0x3, 0x2, 0x2, 0x2, 0xe3, 0xdf, 0x3, 0x2, 0x2, 0x2, 0xe3, 
    0xe0, 0x3, 0x2, 0x2, 0x2, 0xe3, 0xe1, 0x3, 0x2, 0x2, 0x2, 0xe3, 0xe2, 
    0x3, 0x2, 0x2, 0x2, 0xe4, 0xe5, 0x3, 0x2, 0x2, 0x2, 0xe5, 0xec, 0x7, 
    0x15, 0x2, 0x2, 0xe6, 0xed, 0x7, 0x1c, 0x2, 0x2, 0xe7, 0xed, 0x7, 0x1a, 
    0x2, 0x2, 0xe8, 0xed, 0x5, 0xe, 0x8, 0x2, 0xe9, 0xed, 0x5, 0x10, 0x9, 
    0x2, 0xea, 0xed, 0x5, 0x12, 0xa, 0x2, 0xeb, 0xed, 0x5, 0x14, 0xb, 0x2, 
    0xec, 0xe6, 0x3, 0x2, 0x2, 0x2, 0xec, 0xe7, 0x3, 0x2, 0x2, 0x2, 0xec, 
    0xe8, 0x3, 0x2, 0x2, 0x2, 0xec, 0xe9, 0x3, 0x2, 0x2, 0x2, 0xec, 0xea, 
    0x3, 0x2, 0x2, 0x2, 0xec, 0xeb, 0x3, 0x2, 0x2, 0x2, 0xed, 0x21, 0x3, 
    0x2, 0x2, 0x2, 0x1d, 0x27, 0x31, 0x35, 0x3c, 0x50, 0x57, 0x5c, 0x62, 
    0x67, 0x6d, 0x72, 0x78, 0x81, 0x8b, 0x94, 0x9b, 0xa3, 0xa7, 0xaf, 0xb6, 
    0xbe, 0xc2, 0xca, 0xd2, 0xdb, 0xe3, 0xec, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

IMPParser::Initializer IMPParser::_init;
