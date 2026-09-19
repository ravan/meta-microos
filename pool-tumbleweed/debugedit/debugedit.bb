SUMMARY = "Debuginfo extraction"
DESCRIPTION = "debugedit provides programs and scripts for creating debuginfo and source file distributions, \
collect build-ids and rewrite source paths in DWARF data for debugging, tracing and profiling."
LICENSE = "GPL-3.0-or-later"

PV = "5.1"

RPM_NAME = "debugedit-5.1-1.9.aarch64.rpm"
RPM_HASH = "a5fd60a036c4e6f7cc8bd3f92f17d63209c5d522616d23b6309f2d9c7898f5f928f56426a86738aec35fe725b220816ee0f40f4ba2ae5192c925104f79fd9399"

RPROVIDES:${PN} += "debugedit"

RDEPENDS:${PN} += "/usr/bin/bash \
binutils \
coreutils \
dwz \
elfutils \
findutils \
gawk \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
sed \
xz"

inherit rpm
