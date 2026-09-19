SUMMARY = "Glues object frameworks together transparently"
DESCRIPTION = "This class facilitates building frameworks of several classes that \
inter-operate. It was first designed and built for 'HTML::Mason', in which \
the Compiler, Lexer, Interpreter, Resolver, Component, Buffer, and several \
other objects must create each other transparently, passing the appropriate \
parameters to the right class, possibly substituting other subclasses for \
any of these objects. \
 \
The main features of 'Class::Container' are: \
 \
  * Explicit declaration of containment relationships (aggregation, factory \
creation, etc.) \
 \
  * Declaration of constructor parameters accepted by each member in a class \
framework \
 \
  * Transparent passing of constructor parameters to the class that needs them \
 \
  * Ability to create one (automatic) or many (manual) contained objects \
automatically and transparently"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.13"

RPM_NAME = "perl-Class-Container-0.13-1.35.noarch.rpm"
RPM_HASH = "de2bca3b9dfa0941062d3cda48999874a9dd623c5b59ec72eb3ad4786890e33e904113dc38092d09472326f04328c8fe53e9e0429e4f223160320a6c05751bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Container \
perl-Class-Container"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Params--Validate"

inherit rpm
