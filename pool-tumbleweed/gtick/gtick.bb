SUMMARY = "A metronome application"
DESCRIPTION = "GTick is a metronome application written for GNU/Linux and other UN*X-like \
operting systems supporting different meters (Even, 2/4, 3/4, 4/4 and more) \
and speeds ranging from 10 to 1000 bpm."
LICENSE = "GPL-3.0-only"

PV = "0.5.5"

RPM_NAME = "gtick-0.5.5-2.7.aarch64.rpm"
RPM_HASH = "e4ce0272e15f4e67369b5deae0dcb71be29aced3709f141ff29245a11f5f349598a125566b351f140e2b1ed5b9bb7947478e221117334d639c4b20a318d4f489"

RPROVIDES:${PN} += "gtick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
