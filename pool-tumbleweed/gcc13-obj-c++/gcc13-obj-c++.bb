SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "gcc13-obj-c++-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "94275acf9686754dbe69bb14c1fe21db5ae679071210877878ccb2ca0d702e5ae6fa7f674019d1e756b6d13ebed25b52ec1215526bfea2ad7d6f5729b345ba89"

RPROVIDES:${PN} += "gcc13-obj-c++"

RDEPENDS:${PN} += "gcc13-c++ \
gcc13-objc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
