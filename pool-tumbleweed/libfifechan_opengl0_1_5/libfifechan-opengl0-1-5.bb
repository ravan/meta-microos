SUMMARY = "OpenGL extension library of the Fifechan GUI toolkit"
DESCRIPTION = "OpenGL extension for the fifechan library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.5"

RPM_NAME = "libfifechan_opengl0_1_5-0.1.5-1.28.aarch64.rpm"
RPM_HASH = "17e5a3d8be7aeb175ffefd94c93a3f8493501e9c5bb01a069b71c6f40bd7dc7314e64677ee405ce93b7e5dc2014118ef84943f358e2a84ff2ae188a108fd6757"

RPROVIDES:${PN} += "libfifechan-opengl.so.0.1.5 \
libfifechan-opengl0-1-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libfifechan.so.0.1.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
