SUMMARY = "Double-entry accounting system with a command-line reporting interface"
DESCRIPTION = "Ledger is a powerful, double-entry accounting system that is accessed from \
the UNIX command-line. This may put off some users, since there is no \
flashy UI, but for those who want unparalleled reporting access to their \
data there are few alternatives."
LICENSE = "BSD-3-Clause"

PV = "3.3.2"

RPM_NAME = "ledger-3.3.2-4.8.aarch64.rpm"
RPM_HASH = "1db4711c53e0ee8f54345da3566ccfbed05165317658db973928030a40509937c8e5e2fe66ca45aaa76abb5835e85197ed5ea20644b3495a7613008204db4135"

RPROVIDES:${PN} += "ledger"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
