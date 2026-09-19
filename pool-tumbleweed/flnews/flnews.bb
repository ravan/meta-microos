SUMMARY = "Graphical USENET newsreader"
DESCRIPTION = "flnews is a FLTK-based client with graphical user interface to read \
USENET newsgroups."
LICENSE = "BSD-2-Clause"

PV = "1.2.1"

RPM_NAME = "flnews-1.2.1-1.9.aarch64.rpm"
RPM_HASH = "e65cdb6711c9f753f46b43d6800fe9661768770291a532c91a185171b250848977f2a482358c3434caaca70e1c4d3e53a344cad0e32a0c6f5f9ce051b53f1cb5"

RPROVIDES:${PN} += "flnews"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfltk.so.1.3 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
xdg-utils"

inherit rpm
