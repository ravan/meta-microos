SUMMARY = "Simple GObject-based library to parse playlist formats"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "xplayer-plparser-1.0.3-1.13.aarch64.rpm"
RPM_HASH = "c6e756d3e7ddef90fe4c1403c7a6cbd96a87ad7e1efa67a6d470e2a32f3d1320c68c6bcd025cea21b63fb07dd14cd056d7c4c84d9038320a1e2651c49acdb2eb"

RPROVIDES:${PN} += "xplayer-plparser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libquvi-0.9-0.9.4.so"

inherit rpm
