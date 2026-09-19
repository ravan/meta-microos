SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-go-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "19cbc6442315c023096053d3a67f6b6cd0f906ca4b7512f265aab2a79f58714c31104fc990fc74d1e4a29c1a468a77adf9f074754bc597820b3e10cf6ab97cf2"

RPROVIDES:${PN} += "gcc7-go"

RDEPENDS:${PN} += "gcc7 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgo.so.11 \
libgo11 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
