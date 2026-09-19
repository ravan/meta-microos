SUMMARY = "Base class to treat unhandled method calls as errors"
DESCRIPTION = "It's possible to accidentally inherit an AUTOLOAD method. Often this \
will happen if a class somewhere in the chain uses AutoLoader or \
defines one of their own. This can lead to confusing error messages \
when method lookups fail. \
 \
Sometimes you want to avoid this accidental inheritance.  In that case, \
inherit from Class::WhiteHole. All unhandled methods will produce \
normal Perl error messages. \
 \
 \
 \
Authors: \
-------- \
    Michael G Schwern <schwern@pobox.com>"
LICENSE = "Artistic-1.0"

PV = "0.04"

RPM_NAME = "perl-Class-WhiteHole-0.04-228.46.aarch64.rpm"
RPM_HASH = "68a4e6080ed236ba85a93845fb3867a36aafa0ef308a481866556c81a63c76864478eb716aa9ca03947f3aab63595bfeabaee50b085f76209b697671978bc2cc"

RPROVIDES:${PN} += "perl-Class--WhiteHole \
perl-Class-WhiteHole"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
