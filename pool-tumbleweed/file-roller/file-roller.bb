SUMMARY = "An Archive Manager for GNOME"
DESCRIPTION = "File Roller is an archive manager for GNOME. With it, you can create \
and modify archives, view the contents of an archive, view a file \
contained in the archive, and extract files from the archive."
LICENSE = "GPL-2.0-or-later"

PV = "44.7"

RPM_NAME = "file-roller-44.7-1.2.aarch64.rpm"
RPM_HASH = "8719f201a4dd961b37da7a66f264f2d1a370060a7256c93b61c67010bec7bf62dab50b198b36555dbff0befaabd37366a818e177b0c41fb287d19b2e6c28b671"

RPROVIDES:${PN} += "file-roller"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libarchive.so.13 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0"

inherit rpm
