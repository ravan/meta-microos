SUMMARY = "Perlish implementation of Java like inner classes"
DESCRIPTION = "Yet another implementation of an anonymous class with per object \
overrideable methods, but with the added attraction of sort of working \
dispatch to the parent class's method."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.200.1"

RPM_NAME = "perl-Class-Inner-0.200.1-1.7.noarch.rpm"
RPM_HASH = "287aeb858fc96557efd48baded707b6abed0cc8a4f2b7244090d2a6e57579fcf1e3d9e6a6eeb87320af0b2de59c20a38ca7604e6dac8b08fd63aab773ed1fe51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Inner \
perl-Class-Inner"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
