SUMMARY = "GTK+ tray applet for use with NetworkManager"
DESCRIPTION = "This package contains utilities and applications for use with \
NetworkManager, including a panel applet for wireless networks."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "NetworkManager-applet-1.36.0-5.3.aarch64.rpm"
RPM_HASH = "5a9a47834bc720975842840ae367f6244285875d1e86700512d55633d1774ffd7bac9ddcde152b6b9b2a978008378fde336badc6e118deb69017610f775cfdbc"

RPROVIDES:${PN} += "NetworkManager-applet \
NetworkManager-client \
NetworkManager-gnome \
NetworkManager-gnome-lang"

RDEPENDS:${PN} += "NetworkManager \
NetworkManager-connection-editor \
dbus-org.freedesktop.secrets \
iso-codes \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libayatana-appindicator3.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmm-glib.so.0 \
libnm.so.0 \
libnma.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsecret-1.so.0 \
mobile-broadband-provider-info \
timezone"

inherit rpm
