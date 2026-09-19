SUMMARY = "A simple font management application for Gtk+ Desktop Environments"
DESCRIPTION = "Font Manager is intended to provide a way for average users to easily \
 manage desktop fonts, without having to resort to command line tools \
 or editing configuration files by hand. While designed primarily with \
 the Gnome Desktop Environment in mind, it should work well with other \
 Gtk+ desktop environments. \
 \
Font Manager is NOT a professional-grade font management solution."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.4"

RPM_NAME = "font-manager-0.9.4-2.2.aarch64.rpm"
RPM_HASH = "7c182c2b4c1c95204dd09abcac5b6a73f4ffeeec9d1dee00894f688b8bbce3a41ec9744bad1373aa9168d8d47aa552e1c5e74b767d9b943f3629c8759e8cd341"

RPROVIDES:${PN} += "font-manager"

RDEPENDS:${PN} += "/usr/bin/sh \
font-manager-common \
font-viewer \
fontconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libfontmanager.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libwebkitgtk-6.0.so.4 \
webkitgtk-6-0-injected-bundles"

inherit rpm
