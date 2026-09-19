SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "16.2.0+git9497"

RPM_NAME = "libtsan2-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "5a2b2317804083613df66e2b21e21b6132ffaf9d63f397198655a0a78e85ae47d1f7931e22c4f3a73f677d003b27755c7568bc55131609b5ddd70003a976b310"

RPROVIDES:${PN} += "libtsan.so.2 \
libtsan2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
