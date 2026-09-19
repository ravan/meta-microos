SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.5.0+git10516"

RPM_NAME = "liblsan0-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "ada3635a90839505b69cea2e8b6acd219ea47b4558036d642808a1d62c10f45154d0300858d47b1e8f8bcf235845107f763267951a3f3a330ecd6f589dbcd5d3"

RPROVIDES:${PN} += "liblsan.so.0 \
liblsan0 \
liblsan0-gcc13"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
