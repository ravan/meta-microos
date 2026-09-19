SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-c++-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "eab3cb4bc4d5bdbcded4b2639efff434673b08c412e938fe246ca96fc26cad50c8f55e8ce1445c9e8385912dc748bb585dda580a348eaa0d9460bdc39e574cee"

RPROVIDES:${PN} += "gcc7-c++"

RDEPENDS:${PN} += "gcc7 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc7 \
libz.so.1"

inherit rpm
