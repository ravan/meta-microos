SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.5.0+git10516"

RPM_NAME = "libasan8-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "cfe1aeb9936409adb713c3af486d3fb3830d179849bbad0ae7c656d0ab72701e1bb4e21c9a666be919cbd441207a61b9c7b55df3eccd2e1f03840b0cbf735d2c"

RPROVIDES:${PN} += "libasan.so.8 \
libasan8 \
libasan8-gcc13"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
