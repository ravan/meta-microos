SUMMARY = "A file encryption tool"
DESCRIPTION = "Age features small explicit keys, no config options, and UNIX-style \
composability."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "age-1.3.2-1.1.aarch64.rpm"
RPM_HASH = "0728ef2811195cd25cc1c99e024f296d02c1d72254813f4db9ff4f8d0df65c770f3229de704c2671ac5be02479fdfea79e61623e2332f165c120dfbd08fcb81b"

RPROVIDES:${PN} += "age"

RDEPENDS:${PN} += ""

inherit rpm
