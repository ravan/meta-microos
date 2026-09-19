SUMMARY = "Library to Deal with Matroska Files"
DESCRIPTION = "Libmatroska is a C++ library to parse Matroska files (.mkv and .mka). \
It depends on libebml to work. You only need this package to compile \
your own applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "libmatroska7-1.7.2-1.1.aarch64.rpm"
RPM_HASH = "c5e5630e7ad36d7a24505aca81543c74063260f36cb6b4a1b57dacf8c3b3acc845263df4688bf3ad26a80b55e8b127cae6f71b43b058081497187353521ac964"

RPROVIDES:${PN} += "libmatroska.so.7 \
libmatroska7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libebml.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
