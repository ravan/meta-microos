SUMMARY = "NetworkManager VPN support for OpenConnect"
DESCRIPTION = "NetworkManager-openconnect provides VPN support to NetworkManager for \
OpenConnect, an implementation of the Cisco AnyConnect VPN system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "1.2.10"

RPM_NAME = "NetworkManager-openconnect-1.2.10-5.5.aarch64.rpm"
RPM_HASH = "6a874eab177ed4d171fc5ba45c3916d52e3911befd55f368c62511f808d6818daa956e71dfd64c633feb178fb9a140a3f6eafaf6eb995640021e9e4d4504732e"

RPROVIDES:${PN} += "NetworkManager-openconnect \
group-nm-openconnect \
libnm-vpn-plugin-openconnect.so \
user-nm-openconnect"

RDEPENDS:${PN} += "/usr/bin/sh \
NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
libopenconnect.so.5 \
openconnect \
sysuser-shadow"

inherit rpm
