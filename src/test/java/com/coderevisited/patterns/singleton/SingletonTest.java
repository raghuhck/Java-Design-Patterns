/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015  CodeRevisited.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.coderevisited.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * User :  Suresh
 * Date :  06/08/15
 * Version : v1
 */
public class SingletonTest {

    @Test
    public void testEarlySingleton() {
        SingletonEarly obj1 = SingletonEarly.getInstance();
        System.out.println(obj1);
        SingletonEarly obj2 = SingletonEarly.getInstance();
        System.out.println(obj2);
        Assert.assertEquals(obj1, obj2);
    }


    @Test
    public void testLazyUnSafe() {
        //Will fail in multithreaded env
        SingletonLazyUnSafe obj1 = SingletonLazyUnSafe.getInstance();
        System.out.println(obj1);
        SingletonLazyUnSafe obj2 = SingletonLazyUnSafe.getInstance();
        System.out.println(obj2);
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void testLazySynchronized() {
        SingletonLazySynchronized obj1 = SingletonLazySynchronized.getInstance();
        System.out.println(obj1);
        SingletonLazySynchronized obj2 = SingletonLazySynchronized.getInstance();
        System.out.println(obj2);
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void testDoubleCheckBroken() {
        //Will fail in multithreaded env
        SingletonBrokenDoubleCheck obj1 = SingletonBrokenDoubleCheck.getInstance();
        System.out.println(obj1);
        SingletonBrokenDoubleCheck obj2 = SingletonBrokenDoubleCheck.getInstance();
        System.out.println(obj2);
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void testDoubleCheck() {
        SingletonLazyDoubleChecked obj1 = SingletonLazyDoubleChecked.getInstance();
        System.out.println(obj1);
        SingletonLazyDoubleChecked obj2 = SingletonLazyDoubleChecked.getInstance();
        System.out.println(obj2);
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void testLazyHolder() {
        SingletonLazyHolder obj1 = SingletonLazyHolder.getInstance();
        System.out.println(obj1);
        SingletonLazyHolder obj2 = SingletonLazyHolder.getInstance();
        System.out.println(obj2);
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void testEnumSingleton() {
        SingletonEnum obj1 = SingletonEnum.INSTANCE;
        System.out.println(obj1);
        SingletonEnum obj2 = SingletonEnum.INSTANCE;
        System.out.println(obj2);
        Assert.assertEquals(obj1, obj2);
    }
}
