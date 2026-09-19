SUMMARY = "X On-Screen Display library"
DESCRIPTION = "A tool for displaying a TV-like on-screen display in X"
LICENSE = "GPL-2.0-or-later"

PV = "2.2.14"

RPM_NAME = "xosd-2.2.14-1.11.aarch64.rpm"
RPM_HASH = "c9209dac447b9220c36cca859363f7c27ba428515c9c73dd1b543e65fd37ba1e57adc8e09744b39cc4e08b53b63f2bba3c393add2ba32c4547b67e6377b865b9"

RPROVIDES:${PN} += "xosd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libxosd.so.2"

inherit rpm
