SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "16.2.0+git9497"

RPM_NAME = "libubsan1-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "f15b397ce63f4ac41b8eec600533d69544d4d5d184554318b649ab6ac04a9d7a2b9ab5d75871955dcc31dc6767d9b497883bfe478a6065153166580027bd7322"

RPROVIDES:${PN} += "libubsan.so.1 \
libubsan1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
