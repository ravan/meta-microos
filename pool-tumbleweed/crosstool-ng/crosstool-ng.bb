SUMMARY = "Toolchain building framework"
DESCRIPTION = "crosstool-NG aims at building toolchains. Toolchains are an essential component \
in a software development project. It will compile, assemble and link the code \
that is being developed. Some pieces of the toolchain will eventually end up \
in the resulting binary/ies: static libraries are but an example."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-or-later & LGPL-2.1-only & LGPL-3.0-or-later"

PV = "1.25.0"

RPM_NAME = "crosstool-ng-1.25.0-1.14.aarch64.rpm"
RPM_HASH = "4e9a87014e484668a4f67a242b07506dd4a4ae9334a3a139c12b0c99aac314ebeb4974e70a160318e35dd857e8f0745beab282c48ceea9b2066eb3d5ef0d752d"

RPROVIDES:${PN} += "crosstool-ng"

RDEPENDS:${PN} += "/usr/bin/gmake \
/usr/bin/sh \
bzip2 \
gcc \
gcc-c++ \
glibc-devel-static \
gzip \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmenuw.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
m4 \
wget \
xz"

inherit rpm
