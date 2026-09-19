SUMMARY = "The LXDE file manager"
DESCRIPTION = "A file manager with tabbed browsing. It's also the \
LXDE default file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0+git20251208.0908744"

RPM_NAME = "pcmanfm-1.4.0+git20251208.0908744-1.4.aarch64.rpm"
RPM_HASH = "f95002509a3fa0c1ab86457bb6cf756de1ee5da16ce32cb2b98ad788b710fa38953aafc46159d1d97b89909fbf93e5b94f9e74e6dbf43cd980acb3c483fc682e"

RPROVIDES:${PN} += "config-pcmanfm \
pcmanfm"

RDEPENDS:${PN} += "gvfs \
gvfs-backends \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfm-gtk3.so.4 \
libfm.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
menu-cache \
polkit-gnome \
xdg-utils"

inherit rpm
