SUMMARY = "Shared libraries for ngspice"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. Its code \
is based on three open source software packages: Spice3f5, Cider1b1 \
and Xspice. This package contains the shared libraries."
LICENSE = "BSD-2-Clause"

PV = "46"

RPM_NAME = "libngspice0-46-1.2.aarch64.rpm"
RPM_HASH = "814ee88bd34ebff79fdcd311d642c157a1e573f2ec74cfc4022332418b2930d955eda29adb0756ca4df58fdd9eda5835e57d973125fdccf899d26ecbbe179c4f"

RPROVIDES:${PN} += "libngspice.so.0 \
libngspice0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
ngspice-scripts \
ngspice-xspice-cm"

inherit rpm
