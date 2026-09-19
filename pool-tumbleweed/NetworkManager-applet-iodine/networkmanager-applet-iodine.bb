SUMMARY = "NetworkManager VPN support for iodine"
DESCRIPTION = "A network manager VPN plugin that allows you to tunnel your connection \
through a DNS tunnel. This can be useful if internet access is \
firewalled but DNS traffic is still allowed."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "NetworkManager-applet-iodine-1.2.0-12.5.aarch64.rpm"
RPM_HASH = "0390d096045780a9682d0c1f57648ab458d871d61c30d2a623c5e48633d2fad65e2299babe01e9b17fed1b2f3a106cfed5c26653bfe07b17cf8d1cd75d0138dd"

RPROVIDES:${PN} += "NetworkManager-applet-iodine \
NetworkManager-iodine-gnome"

RDEPENDS:${PN} += "NetworkManager-iodine \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnm.so.0 \
libnma.so.0 \
libsecret-1.so.0"

inherit rpm
