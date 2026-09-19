SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "The Polyhedral Library (PolyLib) operates on objects made up of \
unions of polyhedra of any dimension."
LICENSE = "MIT"

PV = "5.22.8"

RPM_NAME = "polylib-5.22.8-1.5.aarch64.rpm"
RPM_HASH = "2ae8bd4dca385a0cf7dcabc2f2504bfa8ac512eeb5835233c36d2e060815b891b75d32741056594fe443e37073b9504d435a1122cbc41f26d0c0d6e6aed2d410"

RPROVIDES:${PN} += "polylib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libpolylibgmp.so.8"

inherit rpm
