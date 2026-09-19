SUMMARY = "Srecord libraries"
DESCRIPTION = "This package contains the shared libraries for programs that manipulate EPROM \
load files."
LICENSE = "GPL-3.0-or-later"

PV = "1.65.0"

RPM_NAME = "libsrecord0-1.65.0-2.7.aarch64.rpm"
RPM_HASH = "a131b32fa9eb28b8ac2514a99cba37b8b8857323a60c72165ae33d8a524fd0458714a3a571e99b4830dd78fdebed35140c563a7c4e8b296084be83eb548bd6e2"

RPROVIDES:${PN} += "libsrecord.so.0 \
libsrecord0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libstdc++.so.6"

inherit rpm
