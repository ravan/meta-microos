SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "16.2.0+git9497"

RPM_NAME = "liblsan0-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "0bde08c9289f5a26252ccaa4e439fe3c8ef9201b19c534fa086eae8198dfe2598fc8b207aee19694c2cdc8b8a1c9a66d4793be7f26ef35f8daeaac9b043a9d9e"

RPROVIDES:${PN} += "liblsan.so.0 \
liblsan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
