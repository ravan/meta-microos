SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "14.4.0+git12698"

RPM_NAME = "libgcc_s1-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "9bc413ace4b558234e29612280130435fcef7f4a953d94b7a0a215c391ee44a6ec8cf2c2d692de15a5f90c6be11078ee1c2cd5cb0b94629eef5768b1a72c2fb4"

RPROVIDES:${PN} += "libgcc-s.so.1 \
libgcc-s1 \
libgcc-s1-gcc14"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
