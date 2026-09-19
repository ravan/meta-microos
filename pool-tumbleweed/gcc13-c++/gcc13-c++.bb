SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "gcc13-c++-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "90ee1b74806b14621c863a705d37295a9c88a3901b3e2c771a41951d0dae055790d69753736a247464a024f0743de9391ed4ce2db5eb0e24734c36bb7820e678"

RPROVIDES:${PN} += "gcc13-c++"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc13 \
libz.so.1 \
libzstd.so.1"

inherit rpm
