SUMMARY = "A PAR 2.0 compatible file creation, verification, and repair tool"
DESCRIPTION = "par2cmdline is a program for creating and using PAR2 files to detect damage in \
data files and repair them if necessary. It can be used with any kind of file."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "par2cmdline-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "4a4a2be4cb67102a90008be04df3586974cad2feb6aa671bf354d7cb9a74abd7aafb6eb842cd2d0ea0ab6875a0bcfc3b6b3957ce3d496944bc8aaf02fcd644f0"

RPROVIDES:${PN} += "par \
par2 \
par2cmdline"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libstdc++.so.6"

inherit rpm
