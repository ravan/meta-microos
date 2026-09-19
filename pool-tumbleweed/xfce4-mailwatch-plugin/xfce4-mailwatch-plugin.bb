SUMMARY = "Versatile Mail Checking Plugin for the Xfce Panel"
DESCRIPTION = "The Mailwatch plugin is a multi-protocol, multi-mailbox mail checking tool \
which supports a variety of protocols and local mailbox formats. It can check \
multiple locations and execute custom actions when it finds new mail."
LICENSE = "GPL-2.0-only"

PV = "1.4.0"

RPM_NAME = "xfce4-mailwatch-plugin-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "39955b8a089320c87473992b8049efb0c68e422fd27da30a2ca3ce3dd00f2597ffaa9f1e4b7159093d749385f5b63b856a5652fda57a18c178aa7c8696d2c8fa"

RPROVIDES:${PN} += "libmailwatch.so \
xfce4-mailwatch-plugin \
xfce4-panel-plugin-mailwatch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libexo-2.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
