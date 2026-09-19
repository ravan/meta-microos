SUMMARY = "Utility to monitor server resources used by X11 clients"
DESCRIPTION = "XResTop is a 'top' like tool for monitoring X Client server resource \
usage."
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "xrestop-0.6-1.11.aarch64.rpm"
RPM_HASH = "7dc4a1d301978babb345925e327594636b992c5c38c6e9eefb5c09bd8b6f336a20cef0002c6fbde43a963d6200b3905372979eef37684a991ac617b097ef999e"

RPROVIDES:${PN} += "xrestop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXRes.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
