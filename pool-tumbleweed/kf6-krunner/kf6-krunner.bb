SUMMARY = "KDE Framework for providing different actions given a string query"
DESCRIPTION = "KDE Framework for providing different actions given a string query."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-krunner-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "52897f4b2b39e7d636a1a78ffaa7bf20fd638d8e484a10b0d002655910fec75c0345512511cbc2135a177dcb1f7a9403d79fdd026f87ca0c2ff6031e7afef64a"

RPROVIDES:${PN} += "kf6-krunner"

RDEPENDS:${PN} += ""

inherit rpm
