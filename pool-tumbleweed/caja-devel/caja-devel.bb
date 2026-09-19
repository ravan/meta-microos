SUMMARY = "Caja development files"
DESCRIPTION = "Caja is the official file manager for the MATE desktop. It allows to \
browse directories, preview files and launch applications associated \
with them. It is also responsible for handling the icons on the MATE \
desktop. It works on local and remote filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.0"

RPM_NAME = "caja-devel-1.28.0-1.14.aarch64.rpm"
RPM_HASH = "fcb4787e84bcb42849a07a71daa7ce1b1e527df0e094c4dd5906b69af8be2eebe4b15a88347bbe3186d6db0369445af965bedb08e6f64238e5eaa32c090210cb"

RPROVIDES:${PN} += "caja-devel \
mate-file-manager-devel \
pkgconfig-libcaja-extension"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
caja \
libcaja-extension1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
