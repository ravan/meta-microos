SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "16.2.0+git9497"

RPM_NAME = "libasan8-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "fdead25f997b411fd68eacc545336d3b957d72eee24838e3363fe323dbf0e798366c800daa235d706ce769ea292b5dd75abf001a82d7813656e4a901b9646da0"

RPROVIDES:${PN} += "libasan.so.8 \
libasan8"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
