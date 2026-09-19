SUMMARY = "Library for Terminal Handling"
DESCRIPTION = "This contain the developpment library for handling terminals \
of termrec."
LICENSE = "LGPL-2.0-or-later"

PV = "0.19"

RPM_NAME = "libtty-devel-0.19-1.24.aarch64.rpm"
RPM_HASH = "cbc4afd53bbbd328f79a1a2da5436f05525b5d9ceb83fd95c8967eee0d46393ecc1993e173cbb99b580ced768edc5adfa50d171b143870ddb15153c53cd7ac3e"

RPROVIDES:${PN} += "libtty-devel"

RDEPENDS:${PN} += "libtty1"

inherit rpm
