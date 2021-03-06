/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 06:56:48 GMT 2017
 */

package org.cs362.dominion;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.*;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "CI`F^jZ0{!?C-nu");
      player0.coins = 8257536;
      player0.discard = list0;
      Card card0 = player0.drawCard();
      gameState0.gameBoard.put(card0, (Integer) null);
      // Undeclared exception!
      try { 
        player0.buyCard(gameState0.gameBoard);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "CI`F^jZ0{!?C-nu");
      player0.coins = 8257536;
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      Integer integer0 = new Integer(8257536);
      gameState0.gameBoard.put(card0, integer0);
      player0.buyCard(gameState0.gameBoard);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "CI`F^jZ0{!?C-nu");
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      Integer integer0 = new Integer(0);
      player0.numActions = (-1);
      gameState0.gameBoard.put(card0, integer0);
      player0.buyCard(gameState0.gameBoard);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "CI`F^jZ0{!?C-nu");
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      Integer integer0 = new Integer(0);
      gameState0.gameBoard.put(card0, integer0);
      player0.discard = list0;
      int int0 = player0.scoreFor();
      assertEquals(9, int0);
      
      player0.buyCard(gameState0.gameBoard);
      assertEquals(20, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "CI`F^jZ0{!?C-nu");
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      Integer integer0 = new Integer(0);
      gameState0.gameBoard.put(card0, integer0);
      player0.buyCard(gameState0.gameBoard);
      player0.buyCard(gameState0.gameBoard);
      int int0 = player0.scoreFor();
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "23iyf~h*v n<L");
      player0.discard = list0;
      player0.initializePlayerTurn();
      player0.numActions = 4;
      player0.endTurn();
      // Undeclared exception!
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "*+ 9s'n$$''.MK");
      player0.numActions = (-1394);
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "23iyf~h*v n<L");
      player0.numBuys = 5;
      player0.discard = list0;
      player0.endTurn();
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "23iyf~h*v n<L");
      player0.discard = gameState0.cards;
      player0.endTurn();
      player0.drawCard();
      Card card0 = player0.drawCard();
      assertTrue(list0.isEmpty());
      assertEquals(0, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, ">|/!iU=;Q\"");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      // Undeclared exception!
      try { 
        player0.printStateGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>(1588);
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.playTtreasureCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashSet<Card> linkedHashSet0 = new LinkedHashSet<Card>(3391, 1644.7264F);
      Card.Type card_Type0 = Card.Type.VICTORY;
      List<Card> list0 = Card.filter(linkedHashSet0, card_Type0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.drawCard();
      player0.numActions = 9;
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "23iyf~h*v n<L");
      player0.discard = list0;
      player0.endTurn();
      player0.initializePlayerTurn();
      player0.drawCard();
      player0.endTurn();
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player((GameState) null, "P`^V9C5f0Nqd<+=");
      // Undeclared exception!
      try { 
        player0.initializePlayerTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "ekYqK`-9=^$");
      Player player1 = player0.clone();
      player1.discard = null;
      // Undeclared exception!
      try { 
        player1.gain((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "M5");
      player0.drawCard();
      List<Card> list0 = player0.hand;
      player0.discard = list0;
      // Undeclared exception!
      player0.endTurn();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "\ncoins: ");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "3iy~$h*v <L");
      player0.hand = (List<Card>) null;
      // Undeclared exception!
      try { 
        player0.discard((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "+b~L9");
      player0.deck = null;
      // Undeclared exception!
      try { 
        player0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player((GameState) null, "w?<cmPJ@17]l9");
      String string0 = player0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "23igf~r* nOy<L");
      player0.discard = list0;
      player0.initializePlayerTurn();
      player0.endTurn();
      player0.drawCard();
      player0.endTurn();
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "23iyf~h*v n<L");
      player0.deck = null;
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "23iyf~h*v n<L");
      player0.hand = (List<Card>) null;
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "CI`F^jZ0{!?C-nu");
      player0.discard = list0;
      Card card0 = player0.drawCard();
      gameState0.gameBoard.put(card0, (Integer) null);
      // Undeclared exception!
      try { 
        player0.buyCard(gameState0.gameBoard);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "");
      player0.cardsToBuy = null;
      // Undeclared exception!
      try { 
        player0.buyCard(gameState0.gameBoard);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "23igf~r* nOy<L");
      player0.discard = list0;
      player0.initializePlayerTurn();
      player0.playTtreasureCard();
      player0.endTurn();
      Card card0 = player0.drawCard();
      assertEquals(0, list0.size());
      assertEquals(8, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "CI`F^jZ0{!?C-nu");
      player0.discard = list0;
      player0.drawCard();
      int int0 = player0.scoreFor();
      assertTrue(list0.isEmpty());
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "23iyf~h*v n<L");
      player0.discard = list0;
      player0.scoreFor();
      player0.endTurn();
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "CI`F^jZ0{!?C-nu");
      int int0 = player0.scoreFor();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashSet<Card> linkedHashSet0 = new LinkedHashSet<Card>(3391, 1644.7264F);
      Card.Type card_Type0 = Card.Type.VICTORY;
      List<Card> list0 = Card.filter(linkedHashSet0, card_Type0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.numActions = 9;
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "CI`F^jZ0{!?C-nu");
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "ekYqK`-9=^$");
      boolean boolean0 = player0.gain((Card) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "23iyf~h*v n<L");
      player0.printStateGame();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "23iyf~h*v n<L");
      player0.discard = list0;
      player0.endTurn();
      player0.initializePlayerTurn();
      player0.endTurn();
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "3iy~$h*v <L");
      player0.discard((Card) null);
  }
}
