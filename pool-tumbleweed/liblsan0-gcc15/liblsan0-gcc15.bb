SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "15.3.0+git11272"

RPM_NAME = "liblsan0-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "f257c73ef3c66cb1b27604f8dbce72b8d65e295e20001770de0db623d8d7d87bc85e83a57715ea9d320e9bb07b1acd5884c9422096447f4160a26ad976395243"

RPROVIDES:${PN} += "liblsan.so.0 \
liblsan0 \
liblsan0-gcc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
