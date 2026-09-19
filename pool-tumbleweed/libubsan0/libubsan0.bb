SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libubsan0-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "28ac50d5dba04a1b925c6ae6cdec203492ca27256367ecbf43413b7fcae88397ae57a81dc9ac1a1181e4d820d172f28f7d65800929f21a0e0f8a9caddf2bdfb4"

RPROVIDES:${PN} += "libubsan.so.0 \
libubsan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
