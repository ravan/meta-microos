SUMMARY = "Install firmware on devices"
DESCRIPTION = "This application can update, reinstall and downgrade firmware on devices \
supported by fwupd."
LICENSE = "GPL-2.0-or-later"

PV = "49.0"

RPM_NAME = "gnome-firmware-49.0-2.3.aarch64.rpm"
RPM_HASH = "fd3b884f8ca2bfd5356fd0e9b5a3bfc334a5b3806fbe53621bf227a0336896c08562884003ab3238bc6ed6c7d7aa393f3ccbe79c4ad98ce0b0e4a3f60d1af047"

RPROVIDES:${PN} += "gnome-firmware \
gnome-firmware-updater \
gnome-firmware-updater-lang"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libfwupd.so.3 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libxmlb.so.2"

inherit rpm
