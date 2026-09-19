SUMMARY = "Eog light-theme plugin"
DESCRIPTION = "The Eye of Gnome Light Theme plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "eog-plugin-light-theme-44.1-2.3.aarch64.rpm"
RPM_HASH = "69ee15af25cc2b6525d89a3f74df27e9271ca347a919e74d877c7119680d536881fe4d8af756ff8cb28c6ea532c074085f11b10238becb0a72e5abdb52fea96c"

RPROVIDES:${PN} += "eog-plugin-light-theme \
eog-plugins-/usr/lib64/eog/plugins/light-theme.plugin \
liblight-theme.so"

RDEPENDS:${PN} += "eog-plugins-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeog.so \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.1"

inherit rpm
