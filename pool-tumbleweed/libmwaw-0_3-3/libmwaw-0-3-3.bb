SUMMARY = "Pre Mac OSX text file formats parser library"
DESCRIPTION = "Libmwaw is a new project for converting many pre-OSX MAC text formats."
LICENSE = "GPL-2.0-or-later & (LGPL-2.1-or-later | MPL-2.0)"

PV = "0.3.21"

RPM_NAME = "libmwaw-0_3-3-0.3.21-3.10.aarch64.rpm"
RPM_HASH = "68d328d44ec8b3bd0f73509e6ec3bca78d2aefd00241d38867adefed0de5992017a0596459a87735e59775bdd6786b6443dff16860a289fea9279219210e37b9"

RPROVIDES:${PN} += "libmwaw-0-3-3 \
libmwaw-0.3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
