SUMMARY = "C++ toolkit for developing constraint-based systems"
DESCRIPTION = "Gecode is an open source C++ toolkit for developing constraint-based \
systems."
LICENSE = "MIT"

PV = "6.3.0~git20211208.6b09bea4"

RPM_NAME = "gecode-devel-6.3.0~git20211208.6b09bea4-1.16.aarch64.rpm"
RPM_HASH = "8221c46b9b9e7cb481a7715044db38d79941779b624f92a8cc8ccd67611caaf71290369c22a4a4a45d2ce4db89be62a8b66496ed84266c43375f4aeba018a48b"

RPROVIDES:${PN} += "gecode-devel"

RDEPENDS:${PN} += "libgecode51"

inherit rpm
