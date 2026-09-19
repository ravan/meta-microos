SUMMARY = "Eog map plugin"
DESCRIPTION = "The Eye of Gnome map plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "eog-plugin-map-44.1-2.3.aarch64.rpm"
RPM_HASH = "8ccb090937964909c232595c249bab58c7dd578b0da94827c15ff53e1f9a34eea44081ff265e8ce5704efd9c8346a337a4e50275bdda43bfb6280fe6daea4601"

RPROVIDES:${PN} += "eog-plugin-map \
eog-plugins-/usr/lib64/eog/plugins/map.plugin \
libmap.so"

RDEPENDS:${PN} += "eog-plugins-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libchamplain-0.12.so.0 \
libchamplain-gtk-0.12.so.0 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libeog.so \
libexif.so.12 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.1"

inherit rpm
