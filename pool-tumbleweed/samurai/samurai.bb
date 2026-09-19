SUMMARY = "C99 implementation of the ninja build tool"
DESCRIPTION = "samurai is a ninja-compatible build tool written in C99. \
 \
samurai implements the ninja build language through version 1.9.0 \
except for MSVC dependency handling. It uses the same format for the \
'.ninja_log' and '.ninja_deps' files as ninja, currently version 5 \
and 4, respectively."
LICENSE = "Apache-2.0"

PV = "1.2+git41.g737f702"

RPM_NAME = "samurai-1.2+git41.g737f702-1.5.aarch64.rpm"
RPM_HASH = "2934e4c019c4a26230bb9e823e58e37ff05d8be7e1408866f2366870017f5d5e1f90a0140ff21d515f063c6937b7979a04e6fc4731613fb6f76fccb9f808189e"

RPROVIDES:${PN} += "samurai"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
