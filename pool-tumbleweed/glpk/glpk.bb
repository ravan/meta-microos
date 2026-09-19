SUMMARY = "GNU Linear Programming Kit"
DESCRIPTION = "The GLPK package is intended for solving large-scale linear \
programming, mixed integer programming, and other related problems. It \
is a set of routines written in ANSI C and organized in the form of a \
callable library."
LICENSE = "GPL-3.0-only"

PV = "5.0"

RPM_NAME = "glpk-5.0-5.3.aarch64.rpm"
RPM_HASH = "5117127874e563001334f889fe493e03b6ca91ecb197e41b6af00a5222dc27165647e93649f4192b1bbec1aebb9ca1644b902083127df53d4ce0967880c544da"

RPROVIDES:${PN} += "glpk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglpk.so.40 \
libm.so.6"

inherit rpm
