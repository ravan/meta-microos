SUMMARY = "Create automatic curried method call closures for any class or object"
DESCRIPTION = "Create automatic curried method call closures for any class or object"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.0.1"

RPM_NAME = "perl-curry-2.0.1-1.7.noarch.rpm"
RPM_HASH = "c6f3f809a3be0ccf20ecfea21ae38d33396e770de1254b1a027d17db9d7e2fe51201e6d9a081a8c5db3d950e6a890fa1acc735646d07143aac67059e1296b51c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-curry \
perl-curry--weak"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
