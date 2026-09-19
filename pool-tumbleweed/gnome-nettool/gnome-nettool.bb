SUMMARY = "GNOME Interface for Various Networking Tools"
DESCRIPTION = "GNOME Nettool is a set of front-ends to various networking command line \
tools, like ping, netstat, ifconfig, whois, traceroute, and finger."
LICENSE = "GPL-2.0-or-later"

PV = "42.0+24"

RPM_NAME = "gnome-nettool-42.0+24-1.7.aarch64.rpm"
RPM_HASH = "953bf17edfa901dd71d1c2394de760fbdd6abc46fea26f1d79eb7d368cf5c23141ff2645ebb7670701b9523774f981e288bf7dc055622595493d801942808749"

RPROVIDES:${PN} += "gnome-nettool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libpango-1.0.so.0"

inherit rpm
