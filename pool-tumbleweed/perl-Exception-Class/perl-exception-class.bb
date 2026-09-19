SUMMARY = "Module that allows you to declare real exception classes in Perl"
DESCRIPTION = "*RECOMMENDATION 1*: If you are writing modern Perl code with Moose or Moo I \
highly recommend using Throwable instead of this module. \
 \
*RECOMMENDATION 2*: Whether or not you use Throwable, you should use \
Try::Tiny. \
 \
Exception::Class allows you to declare exception hierarchies in your \
modules in a 'Java-esque' manner. \
 \
It features a simple interface allowing programmers to 'declare' exception \
classes at compile time. It also has a base exception class, \
Exception::Class::Base, that can be easily extended. \
 \
It is designed to make structured exception handling simpler and better by \
encouraging people to use hierarchies of exceptions in their applications, \
as opposed to a single catch-all exception class. \
 \
This module does not implement any try/catch syntax. Please see the 'OTHER \
EXCEPTION MODULES (try/catch syntax)' section for more information on how \
to get this syntax. \
 \
You will also want to look at the documentation for Exception::Class::Base, \
which is the default base class for all exception objects created by this \
module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.450.0"

RPM_NAME = "perl-Exception-Class-1.450.0-1.5.noarch.rpm"
RPM_HASH = "7a08100613de3ddabf23c1b1ba39fe9531fe1c68797de6a51e3786a50e3c9b90827ba5071c27e1ffc88701ff4e9fd964deaddf70f14737b08a343ecddf185268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exception--Class \
perl-Exception--Class--Base \
perl-Exception-Class"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Data--Inheritable \
perl-Devel--StackTrace"

inherit rpm
