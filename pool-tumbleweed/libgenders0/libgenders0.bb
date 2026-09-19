SUMMARY = "C library API for genders"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with genders. This is the C API."
LICENSE = "GPL-2.0-or-later"

PV = "1.32"

RPM_NAME = "libgenders0-1.32-1.10.aarch64.rpm"
RPM_HASH = "d70c6a8f77466711109b5c093f2c61a22016d624d5ebf76155132bc397bbbd4f2f9899220f78ebfd081552eccb50e2b3f1c873ee928f4c2c35cf2621a49a4cab"

RPROVIDES:${PN} += "libgenders.so.0 \
libgenders0"

RDEPENDS:${PN} += "/sbin/ldconfig \
genders-base \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
