SUMMARY = "GNOME Initial Setup Assistant"
DESCRIPTION = "Initial assistant, helping you to get the system up and running."
LICENSE = "GPL-2.0-or-later"

PV = "50.1"

RPM_NAME = "gnome-initial-setup-50.1-1.1.aarch64.rpm"
RPM_HASH = "574f91e4fb0f7a4a96384339ab00a1e122ae98a8593651c74ddc5238313ed45a1e0ded53944a9aebf2294aed8c822efd372b2a137f2a3eac16cf75d2f83ab2e2"

RPROVIDES:${PN} += "gnome-initial-setup \
group-gnome-initial-setup"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-getting-started-docs \
ld-linux-aarch64.so.1 \
libaccountsservice.so.0 \
libadwaita-1.so.0 \
libc.so.6 \
libfontconfig.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdm.so.1 \
libgeoclue-2.so.0 \
libgeocode-glib-2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-4.so.2 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgweather-4.so.0 \
libharfbuzz.so.0 \
libibus-1.0.so.5 \
libkrb5.so.3 \
libm.so.6 \
libnm.so.0 \
libnma-gtk4.so.0 \
libpango-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libpwquality.so.1 \
libwebkitgtk-6.0.so.4 \
sysuser-shadow"

inherit rpm
