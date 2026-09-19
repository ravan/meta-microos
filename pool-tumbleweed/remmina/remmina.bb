SUMMARY = "Versatile Remote Desktop Client"
DESCRIPTION = "Remmina is a remote desktop client written in GTK+, aiming to be useful for \
system administrators and travellers, who need to work with lots of remote \
computers in front of either large monitors or tiny netbooks. Remmina supports \
multiple network protocols such as RDP, VNC, NX, XDMCP and SSH via separate \
plugins in an integrated and consistant user interface."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.43"

RPM_NAME = "remmina-1.4.43-2.2.aarch64.rpm"
RPM_HASH = "54d0c684c7d622b9af0563226160b5a6c19fc9c465e149620d296ef50eaff12a6e671e40b9e3767bd4095b7eefbf6ac9e8b348295bbb1ab97f6a2fabab13d9a2"

RPROVIDES:${PN} += "remmina \
remmina-plugins-common"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libappindicator3.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-ui-gtk3.so.0 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libgcrypt.so.20 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libsodium.so.26 \
libssh.so.4 \
libvte-2.91.so.0"

inherit rpm
