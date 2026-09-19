SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "gcc15-c++-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "d83f9104361144601810161a5a60f261dcb617e223293f9eed2fe826890135fad4100c2d48fd992dcf1dfefcc081556c17a90746f7109fb5b859b4720d675354"

RPROVIDES:${PN} += "gcc15-c++"

RDEPENDS:${PN} += "gcc15 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc15 \
libz.so.1 \
libzstd.so.1"

inherit rpm
