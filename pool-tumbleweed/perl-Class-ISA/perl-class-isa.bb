SUMMARY = "report the search path for a class's ISA tree"
DESCRIPTION = "Suppose you have a class (like Food::Fish::Fishstick) that is derived, via \
its @ISA, from one or more superclasses (as Food::Fish::Fishstick is from \
Food::Fish, Life::Fungus, and Chemicals), and some of those superclasses \
may themselves each be derived, via its @ISA, from one or more superclasses \
(as above). \
 \
When, then, you call a method in that class ($fishstick->calories), Perl \
first searches there for that method, but if it's not there, it goes \
searching in its superclasses, and so on, in a depth-first (or maybe \
'height-first' is the word) search. In the above example, it'd first look \
in Food::Fish, then Food, then Matter, then Life::Fungus, then Life, then \
Chemicals. \
 \
This library, Class::ISA, provides functions that return that list -- the \
list (in order) of names of classes Perl would search to find a method, \
with no duplicates."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.36"

RPM_NAME = "perl-Class-ISA-0.36-10.42.noarch.rpm"
RPM_HASH = "15c49e1ea4b6d53398ebeff694ba14dd1e1ce42295aeae61f5a2d6cc4b36bf0bf1cab1c5458c3f97bb7c1c7a42fbda1736ad240195fb6a66adb276b8108f8ed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--ISA \
perl-Class-ISA"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
