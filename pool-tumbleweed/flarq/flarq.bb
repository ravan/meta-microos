SUMMARY = "Transmitting and receiving frames of ARQ data (hamradio)"
DESCRIPTION = "Fast Light Automatic Repeat reQuest is a file transfer application that is based \
on the ARQ specification developed by Paul Schmidt, K9PS.  It is capable of \
transmitting and receiving frames of ARQ data via Fldigi. The interaction \
between Flarq and Fldigi requires no operator intervention."
LICENSE = "GPL-3.0-only"

PV = "4.2.13"

RPM_NAME = "flarq-4.2.13-1.1.aarch64.rpm"
RPM_HASH = "e8ddb31cdb9c5225dc4786accc5c04f2a314c6975087427b7136cdde91858f5217ebc68349a9c87a393683251cd1cee38c0939205fd559f2f3ec4911d13d5ef3"

RPROVIDES:${PN} += "flarq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libflxmlrpc.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
