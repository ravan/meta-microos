SUMMARY = "Command-line frontend for the org.freedesktop.Flatpak service"
DESCRIPTION = "This package contains a number of command-line utilities for use inside \
Flatpak sandboxes. They work by talking to portals."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.6"

RPM_NAME = "flatpak-spawn-1.0.6-1.8.aarch64.rpm"
RPM_HASH = "cf27c8cc02a44d29a30b2303db7f4a5e7c235f96da57c8709aea4448b6fee02d7b5117937680a952ce260f679f39fccb800594b07641a5ff005c7c4b71f073b8"

RPROVIDES:${PN} += "flatpak-spawn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
