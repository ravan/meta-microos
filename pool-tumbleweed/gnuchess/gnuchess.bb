SUMMARY = "GNU Chess Program"
DESCRIPTION = "A worthy chess opponent that runs in text mode. Find an X11 interface \
in the xboard package."
LICENSE = "GPL-3.0-or-later"

PV = "6.3.0"

RPM_NAME = "gnuchess-6.3.0-1.6.aarch64.rpm"
RPM_HASH = "7b430744612807645be93e045e9eb85ddf4924aecffa460ddec8ccc11e2b22e1e14c493bcc8a2fa8b26e99b351131c8a88cbb68a113170cf8a11e5f177e91b63"

RPROVIDES:${PN} += "chess-backend \
gchess \
gnuchess"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
