SUMMARY = "Modern Jabber/XMPP Client using GTK+/Vala"
DESCRIPTION = "Dino is an instant messaging client for the Jabber/XMPP network, \
providing a unique and modern user experience based on the latest \
technology from the GNOME project. Dino is still in early \
development and has limited features, but already has basic support \
for XMPP's latest encryption features. Future versions will provide \
a plug-in API, so that developers can easily add new optional \
features."
LICENSE = "GPL-3.0-only"

PV = "0.5.1"

RPM_NAME = "dino-0.5.1-1.4.aarch64.rpm"
RPM_HASH = "2b1ba31d1bed81ed085a298feaa1eac2c150e2ade0e2971f363896918cb64a6f11a43a34431ed8a870cca0512ea3fbf82ce4537ef0768b266a195dc8d2dc7df9"

RPROVIDES:${PN} += "dino \
dino-plugin-http-upload \
dino-plugin-omemo \
dino-plugin-openpgp \
libcrypto-vala.so.0 \
libcrypto-vala0 \
libdino.so.0 \
libdino0 \
libqlite.so.0 \
libqlite0 \
libxmpp-vala.so.0 \
libxmpp-vala0"

RDEPENDS:${PN} += "/usr/bin/sh \
gstreamer1 \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgpgme.so.45 \
libgraphene-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtp-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1 \
libicuuc.so.78 \
libm.so.6 \
libnice.so.10 \
libomemo-c.so.0 \
libpango-1.0.so.0 \
libqrencode.so.4 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libsrtp2.so.1 \
libstdc++.so.6 \
libwebrtc-audio-processing.so.1"

inherit rpm
