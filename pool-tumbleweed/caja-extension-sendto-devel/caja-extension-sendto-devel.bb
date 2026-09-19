SUMMARY = "Development files for caja-sendto"
DESCRIPTION = "This package provides the functionality to the caja file browser to \
send files over e-mail or instant messaging protocols via Evolution, \
Empathy and Pidgin."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extension-sendto-devel-1.28.0-2.11.aarch64.rpm"
RPM_HASH = "cd909f1daf6682c0070ee51726941c9555c821840ee69b63ac09cae69dd766c2a3265832aa98d0ad6373ea02517aa386b072cb368f5fb0a6c3d4aec950a59577"

RPROVIDES:${PN} += "caja-extension-sendto-devel \
caja-sendto-devel \
mate-file-manager-sendto-devel \
pkgconfig-caja-sendto"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
caja-extension-sendto \
caja-extension-sendto-pidgin \
caja-extension-sendto-upnp \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
