SUMMARY = "Openbox GNOME integration"
DESCRIPTION = "This package provides openbox GNOME integration and tools"
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "openbox-gnome-3.6.1-5.12.aarch64.rpm"
RPM_HASH = "afe7213bab4a1e3ec97e4bb158ffee98ffe56dbfe9a2ba4b361bf63e304a29dd11131f6d6437ef545012a2fd84da02d750d29f9a9f680e26c1906fac0184f0e9"

RPROVIDES:${PN} += "openbox-gnome"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXau.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
openbox"

inherit rpm
