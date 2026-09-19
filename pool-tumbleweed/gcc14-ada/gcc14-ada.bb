SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "gcc14-ada-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "09917f1d4bddfaa2cf81da5052c6616b5d3d2bdb6789a639324c62b036fea9f5343f84faf6914e282fda5f54b3ddc6b9467f071e77e13ef82446f1777a5683f3"

RPROVIDES:${PN} += "gcc14-ada"

RDEPENDS:${PN} += "gcc14 \
ld-linux-aarch64.so.1 \
libada14 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
