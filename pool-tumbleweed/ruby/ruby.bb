SUMMARY = "An Interpreted Object-Oriented Scripting Language"
DESCRIPTION = "Ruby is an interpreted scripting language for quick and easy \
object-oriented programming.  It has many features for processing text \
files and performing system management tasks (as in Perl).  It is \
simple, straight-forward, and extensible. \
 \
* Ruby features: \
 \
- Simple Syntax \
 \
- *Normal* Object-Oriented features (class, method calls, for \
   example) \
 \
- *Advanced* Object-Oriented features(Mix-in, Singleton-method, for \
   example) \
 \
- Operator Overloading \
 \
- Exception Handling \
 \
- Iterators and Closures \
 \
- Garbage Collection \
 \
- Dynamic Loading of Object Files (on some architectures) \
 \
- Highly Portable (works on many UNIX machines; DOS, Windows, Mac, \
BeOS, and more)"
LICENSE = "MIT"

PV = "4.0"

RPM_NAME = "ruby-4.0-1.6.aarch64.rpm"
RPM_HASH = "b85378a009304210e4de57f56589f5dbe9fb87a19acdd79ce251ecbbdb138024265cd4816b33ccaea25ec6a6b25e3627c8d4ff26c2dbba979d5e06c293a1175c"

RPROVIDES:${PN} += "ruby \
rubygems"

RDEPENDS:${PN} += "ruby4.0"

inherit rpm
