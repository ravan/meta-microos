SUMMARY = "IDE library and command-line companion tool (development files)"
DESCRIPTION = "This tool aims to extract much of what makes GNOME Builder an IDE into a \
library and companion command-line tool. \
 \
This package contains the development headers."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & Apache-2.0"

PV = "1.1.1"

RPM_NAME = "foundry-devel-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "dcb8361b8ded19118de55ad289d80f0570706880534b8a44bdd6297530d4d073857c332fe3c50475f1a3b5f5cf63d921d9b153aeecd03e2b370eb3ab9431ca16"

RPROVIDES:${PN} += "foundry-devel \
pkgconfig-libfoundry-1 \
pkgconfig-libfoundry-adw-1 \
pkgconfig-libfoundry-gtk-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfoundry-1-1 \
libfoundry-gtk-1-1 \
pkgconfig-editorconfig \
pkgconfig-flatpak \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gom-1.0 \
pkgconfig-gtk4 \
pkgconfig-gtksourceview-5 \
pkgconfig-json-glib-1.0 \
pkgconfig-libadwaita-1 \
pkgconfig-libcmark \
pkgconfig-libdex-1 \
pkgconfig-libfoundry-1 \
pkgconfig-libfoundry-gtk-1 \
pkgconfig-libgit2 \
pkgconfig-libpanel-1 \
pkgconfig-libpeas-2 \
pkgconfig-libsecret-1 \
pkgconfig-libsoup-3.0 \
pkgconfig-libspelling-1 \
pkgconfig-libssh2 \
pkgconfig-libxml-2.0 \
pkgconfig-sysprof-capture-4 \
pkgconfig-template-glib-1.0 \
pkgconfig-vte-2.91-gtk4 \
pkgconfig-webkitgtk-6.0 \
pkgconfig-yaml-0.1 \
typelib-1-0-Foundry-1 \
typelib-1-0-FoundryGtk-1"

inherit rpm
