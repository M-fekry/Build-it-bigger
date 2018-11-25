package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;
import android.util.Pair;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static java.security.AccessController.getContext;
import static org.junit.Assert.*;
@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest extends AndroidTestCase {

    @Test
    public void connectedTestForAsyncTaskResponse() {

        try{

            EndpointsAsyncTask task = new EndpointsAsyncTask();
            task.execute();
            String joke = task.get(30, TimeUnit.SECONDS);
            assertNotNull(joke);
            assertTrue(joke.length() > 0);

        }catch(Exception e) {

            fail(e.getMessage());
        }





    }
}