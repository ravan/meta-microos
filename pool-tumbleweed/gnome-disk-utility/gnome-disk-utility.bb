SUMMARY = "Disks application for dealing with storage devices"
DESCRIPTION = "The gnome-disk-utility project provides the Disks application for \
dealing with storage devices."
LICENSE = "GPL-2.0-or-later"

PV = "46.1"

RPM_NAME = "gnome-disk-utility-46.1-3.4.aarch64.rpm"
RPM_HASH = "965e0711d7431c21fee114d5adaa0603def48b352cde669360dc2b679c178cca48cfa4b8331fd2e982696d0a1bbd45d01077d0a610abcf443ea5c2b7c79f0e2a"

RPROVIDES:${PN} += "gnome-disk-utility"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libdvdread.so.8 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
liblzma.so.5 \
libm.so.6 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpwquality.so.1 \
libsecret-1.so.0 \
libsystemd.so.0 \
libudisks2.so.0 \
udisks2"

inherit rpm
