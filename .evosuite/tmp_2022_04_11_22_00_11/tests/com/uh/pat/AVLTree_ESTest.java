/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 12 03:01:21 GMT 2022
 */

package com.uh.pat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.uh.pat.AVLTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(239);
      aVLTree0.delete((-2383));
      aVLTree0.insert((-1));
      int int0 = 1001;
      aVLTree0.insert(1001);
      int int1 = 0;
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(239);
      aVLTree_Node0.key = 1001;
      AVLTree.Node aVLTree_Node1 = aVLTree0.new Node(1001);
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree0.insert(239);
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      aVLTree_Node2.left = aVLTree_Node0;
      aVLTree_Node2.height = 0;
      aVLTree_Node2.height = (-1300);
      aVLTree_Node2.height = (-2383);
      aVLTree0.getRoot();
      aVLTree0.getBalance(aVLTree_Node2);
      aVLTree0.height();
      aVLTree0.getBalance(aVLTree_Node2);
      aVLTree0.delete(0);
      aVLTree0.insert(int0);
      aVLTree0.delete(int1);
      int int2 = 0;
      aVLTree0.find(int2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.insert(1);
      aVLTree0.insert(4034);
      aVLTree0.delete(554);
      aVLTree0.insert(1849);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.height();
      AVLTree.Node aVLTree_Node1 = aVLTree0.new Node((-382));
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree0.find(1);
      aVLTree0.height();
      aVLTree_Node1.left = aVLTree_Node0;
      aVLTree0.delete(1);
      aVLTree0.delete(673);
      aVLTree0.getRoot();
      aVLTree0.delete((-1650));
      aVLTree0.getBalance(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = (-1634);
      aVLTree0.delete((-1634));
      aVLTree0.height();
      aVLTree0.delete(0);
      aVLTree0.find((-1));
      aVLTree0.delete((-1634));
      aVLTree0.insert((-1));
      aVLTree0.delete((-1634));
      int int1 = 0;
      aVLTree0.delete(0);
      aVLTree0.delete(1273);
      int int2 = 0;
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      aVLTree0.find(0);
      aVLTree_Node0.height = 1;
      // Undeclared exception!
      try { 
        aVLTree0.delete((-987));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.uh.pat.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 0;
      aVLTree0.insert(0);
      int int1 = 1694;
      aVLTree0.insert(1694);
      aVLTree0.delete(0);
      int int2 = 1;
      aVLTree0.insert(1);
      aVLTree0.delete(0);
      // Undeclared exception!
      try { 
        aVLTree0.delete(1694);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.getRoot();
      aVLTree0.getBalance((AVLTree.Node) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.insert(2796);
      aVLTree0.insert(2839);
      aVLTree0.delete(2796);
      aVLTree0.getRoot();
      // Undeclared exception!
      try { 
        aVLTree0.delete(2839);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1294));
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.insert((-2620));
      aVLTree0.insert(0);
      aVLTree0.delete((-1065));
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
      aVLTree0.delete(1879);
      aVLTree0.insert((-2402));
      aVLTree0.insert((-1294));
      aVLTree0.delete(1976);
      aVLTree0.delete((-1294));
      aVLTree0.delete(2097);
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      // Undeclared exception!
      try { 
        aVLTree0.insert(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("com.uh.pat.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(1085);
      aVLTree0.height();
      aVLTree0.find((-1));
      aVLTree0.find(0);
      aVLTree0.delete((-1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1078);
      int int0 = 0;
      aVLTree0.delete((-1915));
      aVLTree0.delete(0);
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.delete(0);
      int int1 = 294;
      int int2 = (-643);
      aVLTree0.insert((-643));
      // Undeclared exception!
      try { 
        aVLTree0.insert((-643));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("com.uh.pat.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 0;
      aVLTree0.delete(0);
      int int1 = 0;
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree0.getBalance(aVLTree_Node1);
      // Undeclared exception!
      aVLTree0.find(1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(163);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1);
      aVLTree0.insert(1);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node2 = aVLTree_Node1.left;
      aVLTree_Node0.right = null;
      aVLTree_Node0.left = aVLTree_Node1;
      int int0 = (-4014);
      aVLTree0.insert((-4014));
      aVLTree0.delete((-809));
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree_Node1.key = 0;
      aVLTree0.height();
      aVLTree0.getBalance(aVLTree_Node0);
      // Undeclared exception!
      try { 
        aVLTree0.insert(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("com.uh.pat.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 1900;
      aVLTree0.insert(1900);
      aVLTree0.insert(0);
      aVLTree0.delete(1);
      aVLTree0.insert((-1441));
      aVLTree0.delete((-1441));
      aVLTree0.height();
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      int int1 = 0;
      aVLTree_Node0.key = 1;
      aVLTree_Node0.height = 0;
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree_Node1.key = 0;
      aVLTree_Node0.key = 1;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node0.key = 1;
      // Undeclared exception!
      aVLTree0.delete(1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-30));
      aVLTree0.delete(3387);
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.height();
      aVLTree0.insert(3387);
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.insert((-30));
      aVLTree0.delete(0);
      aVLTree0.insert(1);
      aVLTree0.delete(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.right;
      aVLTree0.insert((-3611));
      aVLTree0.insert((-4));
      aVLTree0.delete(1);
      aVLTree0.insert(0);
      aVLTree0.insert(1);
      aVLTree0.find(1273);
      aVLTree0.getBalance(aVLTree_Node0);
  }
}
