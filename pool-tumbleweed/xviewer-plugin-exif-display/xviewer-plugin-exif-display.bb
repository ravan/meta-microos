SUMMARY = "Xviewer exif-display plugin"
DESCRIPTION = "xviewer exif display plugin"
LICENSE = "GPL-2.0-or-later"

PV = "3.4.3"

RPM_NAME = "xviewer-plugin-exif-display-3.4.3-1.2.aarch64.rpm"
RPM_HASH = "f7446c79f94383dea292ceb73cc896bf3bd0ce8ef56fa0ed06bef562dbcadc5ee94f12b29d2626f4e989ad643039f86bd5e734b93aa4359ae4780d9095425b84"

RPROVIDES:${PN} += "libexif-display.so \
xviewer-plugin-exif-display"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libexif.so.12 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.1 \
libpeas-gtk-1.0.so.1 \
libxviewer.so \
xviewer-plugins-data"

inherit rpm
