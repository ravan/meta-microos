SUMMARY = "Run-time load a class the first time you call a method in it"
DESCRIPTION = "*Class::Autouse* is a runtime class loader that allows you to specify \
classes that will only load when a method of that class is called. \
 \
For large classes or class trees that might not be used during the running \
of a program, such as Date::Manip, this can save you large amounts of \
memory, and decrease the script load time a great deal. \
 \
*Class::Autouse* also provides a number of 'unsafe' features for runtime \
generation of classes and implementation of syntactic sugar. These features \
make use of (evil) UNIVERSAL::AUTOLOAD hooking, and are implemented in this \
class because these hooks can only be done by a one module, and \
Class::Autouse serves as a useful place to centralise this kind of evil :)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.20.0"

RPM_NAME = "perl-Class-Autouse-2.20.0-1.6.noarch.rpm"
RPM_HASH = "5b9dda8b884bb0b8fc53e1162a2d0a0cf93d3f0242c197064eff46a485fed2de8ada2a22eec4e61bc5080d4b0cfb51581644e674d24a32b315b19a57368f216e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Autouse \
perl-Class--Autouse--Parent \
perl-Class-Autouse"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-prefork"

inherit rpm
