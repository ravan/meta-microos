SUMMARY = "Check the presence of tabs in your project"
DESCRIPTION = "This module scans your project/distribution for any perl files (scripts, \
modules, etc) for the presence of tabs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.02"

RPM_NAME = "perl-Test-NoTabs-2.02-1.33.noarch.rpm"
RPM_HASH = "eea76c186e6caac9cd35eb0a46ac6bf39dacce90743ee4896d79ea8a067aae04ae154066eeab419f3ee3e88700a9cfd54e8febfbf04fcb1bf48a0be1d1c3052e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--NoTabs \
perl-Test-NoTabs"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
