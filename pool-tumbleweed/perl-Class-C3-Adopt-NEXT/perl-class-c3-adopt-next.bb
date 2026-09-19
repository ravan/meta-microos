SUMMARY = "Make Next Suck Less"
DESCRIPTION = "the NEXT manpage was a good solution a few years ago, but isn't any more. \
It's slow, and the order in which it re-dispatches methods appears random \
at times. It also encourages bad programming practices, as you end up with \
code to re-dispatch methods when all you really wanted to do was run some \
code before or after a method fired. \
 \
However, if you have a large application, then weaning yourself off 'NEXT' \
isn't easy. \
 \
This module is intended as a drop-in replacement for NEXT, supporting the \
same interface, but using the Class::C3 manpage to do the hard work. You \
can then write new code without 'NEXT', and migrate individual source files \
to use 'Class::C3' or method modifiers as appropriate, at whatever pace \
you're comfortable with."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-Class-C3-Adopt-NEXT-0.14-1.40.noarch.rpm"
RPM_HASH = "5d0a163832ba5c6b56ad0416bfd8f590727a9459a214ddcfadea5d422ff883c9251a30b4b0cef0a8bb95254f286fb3228af5b7d83bf63458b3e8796a4408369f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--C3--Adopt--NEXT \
perl-Class-C3-Adopt-NEXT"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-List--Util \
perl-MRO--Compat"

inherit rpm
