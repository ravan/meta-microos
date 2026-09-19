SUMMARY = "Package for algebraic, geometric and combinatorial problems on linear spaces"
DESCRIPTION = "4ti2 is a collection of programs that compute and solve algebraic, \
geometric and combinational problems on linear spaces."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.15"

RPM_NAME = "4ti2-1.6.15-1.3.aarch64.rpm"
RPM_HASH = "f34c8b0e4404bda2968905a2b4ac479c540f8e897b48809bb1894be74d1bc13d7aa1af78bf42151224c495e35fc255362143e7e402bad90f99362af90cb977dc"

RPROVIDES:${PN} += "4ti2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
lib4ti2gmp.so.0 \
lib4ti2int32.so.0 \
lib4ti2int64.so.0 \
lib4ti2util.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzsolve.so.0"

inherit rpm
