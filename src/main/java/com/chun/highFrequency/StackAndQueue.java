package com.chun.highFrequency;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @description: 栈和队列
 * @author: chun
 **/

public class StackAndQueue {
    public static void main(String[] args) {

        //双端队列操作,可手动实现单调队列
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        deque.offer(4);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque);

        //栈
        //push() / pop() / peek()
        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        System.out.println(stack);

        //队列
        //offer() / poll() / peek()
        Deque<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.poll();


    }
}
