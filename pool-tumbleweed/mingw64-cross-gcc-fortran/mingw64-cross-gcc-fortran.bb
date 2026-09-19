SUMMARY = "MinGW Windows cross-compiler for Fortran"
DESCRIPTION = "MinGW Windows cross-compiler for Fortran"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-cross-gcc-fortran-16.2.0-1.1.aarch64.rpm"
RPM_HASH = "db7980916bd86c193c723987abdd0780fd5dcff8e5d8a101d0e9c29ba9f58eaeeefe6bf7dddd237c28a37e1e6fee5f4121e7f7809ae57742e070babf01748e96"

RPROVIDES:${PN} += "mingw64-cross-gcc-fortran"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
