SUMMARY = "Smart return value object"
DESCRIPTION = "Class::ReturnValue is a 'clever' return value object that can allow code \
calling your routine to expect: a boolean value (did it fail) or a list \
(what are the return values)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.550.0"

RPM_NAME = "perl-Class-ReturnValue-0.550.0-1.3.noarch.rpm"
RPM_HASH = "e67d6c0ceb9c8e0bca40854405ea6217cb04ac786f6ced7d7f6a7fceefb1b78815f2c905b3b81095aa6d6a508ee5c114f1a8ec9a40de395c1684cd4bea2d22d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--ReturnValue \
perl-Class-ReturnValue"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Devel--StackTrace"

inherit rpm
