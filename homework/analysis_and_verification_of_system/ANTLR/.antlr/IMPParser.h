
// Generated from /root/IMP-Parser/ANTLR/IMP.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"




class  IMPParser : public antlr4::Parser {
public:
  enum {
    T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, 
    T__7 = 8, T__8 = 9, T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, 
    T__14 = 15, T__15 = 16, T__16 = 17, T__17 = 18, T__18 = 19, AVAL = 20, 
    BVAL = 21, VAR = 22, WS = 23, Integer = 24, Bool = 25, Var = 26
  };

  enum {
    RuleMain = 0, RuleBlock = 1, RuleAssignment = 2, RuleIfStmt = 3, RuleWhileStmt = 4, 
    RuleSequence = 5, RulePlus = 6, RuleMinus = 7, RuleTimes = 8, RuleBracketAExpr = 9, 
    RuleBracketBExpr = 10, RuleImpand = 11, RuleImpor = 12, RuleImpnot = 13, 
    RuleLesser = 14, RuleEqual = 15
  };

  IMPParser(antlr4::TokenStream *input);
  ~IMPParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class MainContext;
  class BlockContext;
  class AssignmentContext;
  class IfStmtContext;
  class WhileStmtContext;
  class SequenceContext;
  class PlusContext;
  class MinusContext;
  class TimesContext;
  class BracketAExprContext;
  class BracketBExprContext;
  class ImpandContext;
  class ImporContext;
  class ImpnotContext;
  class LesserContext;
  class EqualContext; 

  class  MainContext : public antlr4::ParserRuleContext {
  public:
    MainContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BlockContext *block();
    AssignmentContext *assignment();
    IfStmtContext *ifStmt();
    WhileStmtContext *whileStmt();
    SequenceContext *sequence();

   
  };

  MainContext* main();

  class  BlockContext : public antlr4::ParserRuleContext {
  public:
    BlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BlockContext *block();
    AssignmentContext *assignment();
    IfStmtContext *ifStmt();
    WhileStmtContext *whileStmt();
    SequenceContext *sequence();

   
  };

  BlockContext* block();

  class  AssignmentContext : public antlr4::ParserRuleContext {
  public:
    AssignmentContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> Var();
    antlr4::tree::TerminalNode* Var(size_t i);
    antlr4::tree::TerminalNode *Integer();
    BracketAExprContext *bracketAExpr();

   
  };

  AssignmentContext* assignment();

  class  IfStmtContext : public antlr4::ParserRuleContext {
  public:
    IfStmtContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BracketBExprContext *bracketBExpr();
    std::vector<BlockContext *> block();
    BlockContext* block(size_t i);

   
  };

  IfStmtContext* ifStmt();

  class  WhileStmtContext : public antlr4::ParserRuleContext {
  public:
    WhileStmtContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BracketBExprContext *bracketBExpr();
    BlockContext *block();

   
  };

  WhileStmtContext* whileStmt();

  class  SequenceContext : public antlr4::ParserRuleContext {
  public:
    SequenceContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<BlockContext *> block();
    BlockContext* block(size_t i);
    std::vector<AssignmentContext *> assignment();
    AssignmentContext* assignment(size_t i);
    std::vector<IfStmtContext *> ifStmt();
    IfStmtContext* ifStmt(size_t i);
    std::vector<WhileStmtContext *> whileStmt();
    WhileStmtContext* whileStmt(size_t i);
    SequenceContext *sequence();

   
  };

  SequenceContext* sequence();

  class  PlusContext : public antlr4::ParserRuleContext {
  public:
    PlusContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> Var();
    antlr4::tree::TerminalNode* Var(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Integer();
    antlr4::tree::TerminalNode* Integer(size_t i);
    std::vector<BracketAExprContext *> bracketAExpr();
    BracketAExprContext* bracketAExpr(size_t i);

   
  };

  PlusContext* plus();

  class  MinusContext : public antlr4::ParserRuleContext {
  public:
    MinusContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> Var();
    antlr4::tree::TerminalNode* Var(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Integer();
    antlr4::tree::TerminalNode* Integer(size_t i);
    std::vector<BracketAExprContext *> bracketAExpr();
    BracketAExprContext* bracketAExpr(size_t i);

   
  };

  MinusContext* minus();

  class  TimesContext : public antlr4::ParserRuleContext {
  public:
    TimesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> Var();
    antlr4::tree::TerminalNode* Var(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Integer();
    antlr4::tree::TerminalNode* Integer(size_t i);
    std::vector<BracketAExprContext *> bracketAExpr();
    BracketAExprContext* bracketAExpr(size_t i);

   
  };

  TimesContext* times();

  class  BracketAExprContext : public antlr4::ParserRuleContext {
  public:
    BracketAExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Var();
    antlr4::tree::TerminalNode *Integer();
    PlusContext *plus();
    MinusContext *minus();
    TimesContext *times();
    BracketAExprContext *bracketAExpr();

   
  };

  BracketAExprContext* bracketAExpr();

  class  BracketBExprContext : public antlr4::ParserRuleContext {
  public:
    BracketBExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Bool();
    ImpandContext *impand();
    ImpnotContext *impnot();
    ImporContext *impor();
    BracketBExprContext *bracketBExpr();

   
  };

  BracketBExprContext* bracketBExpr();

  class  ImpandContext : public antlr4::ParserRuleContext {
  public:
    ImpandContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> Bool();
    antlr4::tree::TerminalNode* Bool(size_t i);
    std::vector<LesserContext *> lesser();
    LesserContext* lesser(size_t i);
    std::vector<EqualContext *> equal();
    EqualContext* equal(size_t i);
    std::vector<BracketBExprContext *> bracketBExpr();
    BracketBExprContext* bracketBExpr(size_t i);
    ImpandContext *impand();

   
  };

  ImpandContext* impand();
  ImpandContext* impand(int precedence);
  class  ImporContext : public antlr4::ParserRuleContext {
  public:
    ImporContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> Bool();
    antlr4::tree::TerminalNode* Bool(size_t i);
    std::vector<LesserContext *> lesser();
    LesserContext* lesser(size_t i);
    std::vector<EqualContext *> equal();
    EqualContext* equal(size_t i);
    std::vector<BracketBExprContext *> bracketBExpr();
    BracketBExprContext* bracketBExpr(size_t i);
    ImporContext *impor();

   
  };

  ImporContext* impor();
  ImporContext* impor(int precedence);
  class  ImpnotContext : public antlr4::ParserRuleContext {
  public:
    ImpnotContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Bool();
    BracketBExprContext *bracketBExpr();
    LesserContext *lesser();
    EqualContext *equal();

   
  };

  ImpnotContext* impnot();

  class  LesserContext : public antlr4::ParserRuleContext {
  public:
    LesserContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> Var();
    antlr4::tree::TerminalNode* Var(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Integer();
    antlr4::tree::TerminalNode* Integer(size_t i);
    std::vector<PlusContext *> plus();
    PlusContext* plus(size_t i);
    std::vector<MinusContext *> minus();
    MinusContext* minus(size_t i);
    std::vector<TimesContext *> times();
    TimesContext* times(size_t i);
    std::vector<BracketAExprContext *> bracketAExpr();
    BracketAExprContext* bracketAExpr(size_t i);

   
  };

  LesserContext* lesser();

  class  EqualContext : public antlr4::ParserRuleContext {
  public:
    EqualContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> Var();
    antlr4::tree::TerminalNode* Var(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Integer();
    antlr4::tree::TerminalNode* Integer(size_t i);
    std::vector<PlusContext *> plus();
    PlusContext* plus(size_t i);
    std::vector<MinusContext *> minus();
    MinusContext* minus(size_t i);
    std::vector<TimesContext *> times();
    TimesContext* times(size_t i);
    std::vector<BracketAExprContext *> bracketAExpr();
    BracketAExprContext* bracketAExpr(size_t i);

   
  };

  EqualContext* equal();


  virtual bool sempred(antlr4::RuleContext *_localctx, size_t ruleIndex, size_t predicateIndex) override;
  bool impandSempred(ImpandContext *_localctx, size_t predicateIndex);
  bool imporSempred(ImporContext *_localctx, size_t predicateIndex);

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

