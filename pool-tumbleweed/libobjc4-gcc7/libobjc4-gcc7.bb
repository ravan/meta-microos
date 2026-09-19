SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libobjc4-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "6a86f1816f92e11bd576c4784778e5dd6b7239d3aadd3f367a4091e349554bbd9fa8e7380e1d8003465f411b2b1be415615feb704dba6f38bfbbb847e0107cd4"

RPROVIDES:${PN} += "libobjc.so.4 \
libobjc4 \
libobjc4-gcc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
