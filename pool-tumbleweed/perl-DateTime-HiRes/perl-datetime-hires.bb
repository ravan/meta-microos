SUMMARY = "Create DateTime objects with sub-second current time resolution"
DESCRIPTION = "This module enables you to generate DateTime objects that represent the \
current time with sub-second resolution."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.04"

RPM_NAME = "perl-DateTime-HiRes-0.04-1.17.noarch.rpm"
RPM_HASH = "2a2bc9ee21aa9f9dc029bfc4fb4fa19f28ac6bc5052090c6ac7ae3e34c2102c517cf37df26c470d4f08ea808d5e1b904ba2907e7febc963ab2b55b99c97a936d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--HiRes \
perl-DateTime-HiRes"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DateTime"

inherit rpm
