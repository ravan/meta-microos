SUMMARY = "Minuet: Build Environment"
DESCRIPTION = "Development headers and libraries for Minuet."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "minuet-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "1545eda3c544ddfae41031ef1b8603fccde08d137a1af0a5383043058ed740e73f542d34834017bc89571926d3de740146d924258a53c3989fbe1d251a7a67db"

RPROVIDES:${PN} += "minuet-devel"

RDEPENDS:${PN} += "minuet"

inherit rpm
