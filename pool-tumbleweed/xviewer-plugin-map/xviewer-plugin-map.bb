SUMMARY = "Xviewer map plugin"
DESCRIPTION = "xviewer map plugin"
LICENSE = "GPL-2.0-or-later"

PV = "3.4.3"

RPM_NAME = "xviewer-plugin-map-3.4.3-1.2.aarch64.rpm"
RPM_HASH = "365c16994ebd003872bf09417eafe978972af4561a3e4e863234d403b53b0562dc7837e995eab0654a951d1b3570499c96bcc3265641a8f486eb97148ea14d16"

RPROVIDES:${PN} += "libmap.so \
xviewer-plugin-map"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchamplain-0.12.so.0 \
libchamplain-gtk-0.12.so.0 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libexif.so.12 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.1 \
libxviewer.so \
xviewer-plugins-data"

inherit rpm
