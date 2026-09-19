SUMMARY = "Eog exif-display plugin"
DESCRIPTION = "The Eye of Gnome exif display plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "eog-plugin-exif-display-44.1-2.3.aarch64.rpm"
RPM_HASH = "5c60ffd8990c9b02913393f909104b5095b330da9dbbb99a8b9acbdc8104fa58ab351d25856d632745865c2a11c967aa2f09d4f558c70144121616d689975bee"

RPROVIDES:${PN} += "eog-plugin-exif-display \
eog-plugins-/usr/lib64/eog/plugins/exif-display.plugin \
libexif-display.so"

RDEPENDS:${PN} += "eog-plugins-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libeog.so \
libexif.so.12 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.1 \
libpeas-gtk-1.0.so.1"

inherit rpm
