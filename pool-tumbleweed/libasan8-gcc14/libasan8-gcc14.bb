SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "14.4.0+git12698"

RPM_NAME = "libasan8-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "30b2b823355bb829a8d01de6435a9261a9df2528eee3421dcae1a376579dfae6edf2238ffadaff449904b14a6445af51f3cd3728d14e465cd9b248706f145dc9"

RPROVIDES:${PN} += "libasan.so.8 \
libasan8 \
libasan8-gcc14"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
