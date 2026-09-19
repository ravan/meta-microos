SUMMARY = "Open Collaboration Service client library"
DESCRIPTION = "Attica is a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "attica-qt5-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "0262c878e02969405f280b4c58f0bc7c509a224eca1dd7dd14548f547255c98d9a2161d49ad1c8e3a55c7594994cf16c290ca52b7ec8b5569754a265703b0b99"

RPROVIDES:${PN} += "attica-qt5"

RDEPENDS:${PN} += ""

inherit rpm
