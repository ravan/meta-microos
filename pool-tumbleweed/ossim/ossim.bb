SUMMARY = "Open Source Software Image Map (OSSIM)"
DESCRIPTION = "The OSSIM core utilities. \
Open Source Software Image Map (OSSIM) is an engine for \
remote sensing, image processing, geographical information systems and \
photogrammetry."
LICENSE = "LGPL-3.0-only"

PV = "2.12.1"

RPM_NAME = "ossim-2.12.1-1.1.aarch64.rpm"
RPM_HASH = "dc497aaec9141ca088578e981b34cdfd2aa05806c193ed8858118c01096a670b7f20cc8118e56e384663297e09975c9f8c7daa02f547281e20cf943b5647a8dd"

RPROVIDES:${PN} += "ossim"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libossim.so.2 \
libstdc++.so.6"

inherit rpm
