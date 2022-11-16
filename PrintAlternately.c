#include <semaphore.h>

typedef struct {
    int n;
} FooBar;

sem_t fooSem;
sem_t barSem;

FooBar* fooBarCreate(int n) {
    // initalize each semaphore
    sem_init(& fooSem, 0, 1);
    sem_init(& barSem, 0, 0);
   
    // allocate space
    FooBar* obj = (FooBar*) malloc(sizeof(FooBar));
    obj->n = n;
    return obj;
}

void foo(FooBar* obj) {
    for (int i = 0; i < obj->n; i++) {
        // wait on foo if bar has not printed yet
        sem_wait(&fooSem);
        // printFoo() outputs "foo". Do not change or remove this line.
        printFoo();
        // foo has printed so post barSem
        sem_post(&barSem);
    }
}

void bar(FooBar* obj) {    
    for (int i = 0; i < obj->n; i++) {
        // wait on bar until foo has printed
        sem_wait(&barSem);
        // printBar() outputs "bar". Do not change or remove this line.
        printBar();
        // bar has printed so post fooSem
        sem_post(&fooSem);
    }
}

void fooBarFree(FooBar* obj) {
    
}
