SUMMARY = "Switchboard Network Plug"
DESCRIPTION = "Configure all available networks."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.0"

RPM_NAME = "switchboard-plug-network-8.2.0-1.4.aarch64.rpm"
RPM_HASH = "d76474ba90fefc36d3d387db760290875740f373c48ee97a70f5789d0203ec9c6d6e5a86cb5eb94140101e5f564bcfca41439222627a224b1d4d717d2b925f69"

RPROVIDES:${PN} += "libnetwork.so \
switchboard-plug-network"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libnm.so.0 \
libnma-gtk4.so.0 \
libswitchboard-3.so.0 \
switchboard"

inherit rpm
