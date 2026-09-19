SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libasan4-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "bddeb66a276167e2b0c23a42f18008c6e1b68b7563676dd748c54c52221b480e09047ca221f2ecf6d05dcaffdd7849999d8bddaff4d45241ccbdaa49b1d4137f"

RPROVIDES:${PN} += "libasan.so.4 \
libasan4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
