SUMMARY = "oneAPI Video Processing Library (oneVPL) dispatcher, tools, and examples"
DESCRIPTION = "The oneAPI Video Processing Library (oneVPL) provides a single video processing \
API for encode, decode, and video processing that works across a wide range of \
accelerators."
LICENSE = "MIT"

PV = "2.17.0"

RPM_NAME = "libvpl-2.17.0-1.2.aarch64.rpm"
RPM_HASH = "1350223abb112982ae688ca7c5c6ab29b3029f4058c8f7e3cdd85dfc33595b501b35cbece72f76d74db1f4885b4257b66480d8573b1362f2bad755eedacc6fea"

RPROVIDES:${PN} += "libvpl"

RDEPENDS:${PN} += ""

inherit rpm
