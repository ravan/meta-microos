SUMMARY = "Iterate over collections"
DESCRIPTION = "This is an attempt to add smalltalk-like streams to Moose. It currently \
works with ArrayRefs and HashRefs. \
 \
* next \
 \
The next method provides the next item in the colletion. \
 \
  For arrays it returns the element of the array \
 \
  For hashs it returns a pair as a hashref with the keys: key and value \
 \
* has_next \
 \
The has_next method is a boolean method that is true if there is another \
item in the colletion after the current item. and falue if there isn't. \
 \
* peek \
 \
The peek method returns the next item without moving the state of the \
iterator forward. It returns undef if it is at the end of the collection. \
 \
* reset \
 \
Resets the cursor, so you can iterate through the elements again."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-MooseX-Iterator-0.11-10.35.noarch.rpm"
RPM_HASH = "58aa4e793fad26a1e7c0503d02f56e97d8efefffacc7e736cd9e1955cb2be33ac2ab046f5a75f4b186f5d375a42bf9bb5770c1ae884f8b263ac900a321f0f0cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Moose--Meta--Attribute--Custom--Iterable \
perl-MooseX--Iterator \
perl-MooseX--Iterator--Array \
perl-MooseX--Iterator--Hash \
perl-MooseX--Iterator--Meta--Iterable \
perl-MooseX--Iterator--Role \
perl-MooseX-Iterator"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose"

inherit rpm
