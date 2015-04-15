# LockerDB

An experimental key-value store NoSQL database written in Clojure.

## Purpose

The purpose of LockerDB is for myself to learn more about the implementation of
NoSQL databases (in particular key-value stores) and a chance to play around with
a new language (in this case, Clojure).

## Overview

LockerDB is designed to be an experimental key-value store type database. It is
based on the metaphors of "lockers", "bags", and "items".

The general idea is:

> Items are stored in bags which are stored in lockers.

### Lockers

Lockers are essentially the overall storage unit of the database. They may contain
many different bags, but a single bag cannot only be stored in a single lockers.

Note that lockers are aware of the bags that it contains, however the items in
which that bag stores are abstracted away from the concern of the locker.

You generally use only one bag at a time, while the rest are stored in a locker.
The locker will keep track of which bag you are currently using, and allow you
to switch between them.

### Bags

Bags contain the actual key-value pairs in which data is stored, or "items", and
reside inside a given locker. Bags can be thought of as almost like a namespace
for different items, or data.

Bags may contain many different items, however a given item can only reside in
any single bag.

Whichever current bag you are using will provide standard operations to modify
and manipulate the items which are currently stored inside the bag.

### Items

Items are your everyday things that are stored inside your bags. These are the
actual key-value pairs which make up your data stored inside LockerDB. A given
item can only reside in any given bag.

Keys are any given [Java String type](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html),
while the values may be any valid [primitive Java data
	type](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html).

Items may be added and removed through interaction with your current bag.

