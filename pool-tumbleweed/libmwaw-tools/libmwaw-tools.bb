SUMMARY = "Tools to work with publications in pre MAC OSX text file-formats"
DESCRIPTION = "Command line tools to work with publications in pre MAC OSX text file-formats."
LICENSE = "GPL-2.0-or-later & (LGPL-2.1-or-later | MPL-2.0)"

PV = "0.3.21"

RPM_NAME = "libmwaw-tools-0.3.21-3.10.aarch64.rpm"
RPM_HASH = "968e4e9459a9b0c6de7a5770f91a2fb23cb6d834f2845c72ef06b8b0fd486c81e2711bf19938f3d5467d420113e638d454d8059588278f33fc4aff96c0f54165"

RPROVIDES:${PN} += "libmwaw-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmwaw-0.3.so.3 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
