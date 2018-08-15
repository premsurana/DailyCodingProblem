#include<stdio.h>
#include<stdlib.h>
#include <inttypes.h>

struct node {
	int data;
	struct node *npx;
};

struct node *p;
void printList ();
void add(int num);

int main() {

	add(2);
	add(3);
	printList();
}

struct node* XOR(struct node *a, struct node *b) {
	return (struct Node*) ((uintptr_t) (a) ^ (uintptr_t) (b));
}

void add(int num) {

	struct node *r;
	r = malloc(sizeof(struct node));
	r -> data = num;
	
	r -> npx = XOR(p,NULL);
	
	if(p!= NULL) {
		struct Node* next = XOR(p->npx, NULL);
        	p->npx = XOR(r, next);
	}
	
	p = r;
}

void printList ()
{
    struct node *curr = p;
    struct node *prev = NULL;
    struct node *next;
 
    printf ("Following are the nodes of Linked List: \n");
 
    while (curr != NULL)
    {
        printf ("%d ", curr->data);
 
        next = XOR (prev, curr->npx);
        prev = curr;
        curr = next;
    }
}
