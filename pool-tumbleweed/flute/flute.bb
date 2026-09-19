SUMMARY = "Java CSS parser using SAC"
DESCRIPTION = "A Cascading Style Sheets parser using the Simple API for CSS, for Java."
LICENSE = "LGPL-2.1-or-later & W3C"

PV = "1.3.0"

RPM_NAME = "flute-1.3.0-6.18.noarch.rpm"
RPM_HASH = "01b5b19618caf4225fb82b80b24fc47ecc50d0bdd0949843c351d80c9ff6391ba176ecaeb3589c1ace7576913f14b245f02cbce5f962f4b382333338e754fcdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flute"

RDEPENDS:${PN} += "java \
jpackage-utils \
sac"

inherit rpm
