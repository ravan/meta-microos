SUMMARY = "GNU GCC COBOL Compiler"
DESCRIPTION = "This package contains a COBOL compiler."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "gcc15-cobol-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "65b7d0cceff5879dc76c33ac1e0d8d6b502bc16cdd359406e7a4e94862d054c574114afcb6a55ba8fa17bbb1bb7b779c7b04cd274d8e7ddc01f9fd7542be329d"

RPROVIDES:${PN} += "gcc15-cobol"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc15 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcobol1 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
