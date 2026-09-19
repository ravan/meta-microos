SUMMARY = "Thunar Plugin That Adds Context-menu Items from Dropbox"
DESCRIPTION = "Thunar Dropbox is a plugin for thunar that adds context-menu items from \
dropbox. This plugin does not come with dropbox itself, you will need \
to install that separately."
LICENSE = "GPL-3.0-only"

PV = "0.3.1"

RPM_NAME = "thunar-plugin-dropbox-0.3.1-1.26.aarch64.rpm"
RPM_HASH = "6aa41eac3633dd090a9f246cb1879934a43d97a862c89aba2b82ca3425062052478b9fc3e1b641910fe8046155c17958098a340d547eab0114954eac4dc8d173"

RPROVIDES:${PN} += "thunar-dropbox \
thunar-plugin-dropbox"

RDEPENDS:${PN} += "dropbox \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libthunarx-3.so.0 \
thunar"

inherit rpm
