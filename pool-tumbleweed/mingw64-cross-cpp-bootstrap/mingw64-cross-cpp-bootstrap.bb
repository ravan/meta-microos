SUMMARY = "MinGW Windows cross-C Preprocessor"
DESCRIPTION = "MinGW Windows cross-C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-cross-cpp-bootstrap-16.2.0-1.1.aarch64.rpm"
RPM_HASH = "a7133439315d20a7b7edd2ae854e478e18685465a25c302ccbf258b63c069d811ab04294c48091f6c13c3a4341524a895e8c9f4f78780542cb090b9f80d5ab59"

RPROVIDES:${PN} += "mingw64-cross-cpp-bootstrap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
