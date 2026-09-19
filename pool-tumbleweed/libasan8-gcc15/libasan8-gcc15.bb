SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "15.3.0+git11272"

RPM_NAME = "libasan8-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "83dfadfa5786cc24578f4780b74dd6e0cffe224f8b52fc98a791fe47711659e7655ef9b72d62fbf9a28527bb746d6b34edd56a4e74a60913fd584a20527e1d00"

RPROVIDES:${PN} += "libasan.so.8 \
libasan8 \
libasan8-gcc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
