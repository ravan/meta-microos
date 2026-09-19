SUMMARY = "Browse and search system icons"
DESCRIPTION = "Browse and search system icons in Pantheon."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0"

RPM_NAME = "pantheon-iconbrowser-8.1.0-1.4.aarch64.rpm"
RPM_HASH = "7357ef5944b092f09efcfaa5b0aa6bbf48791e9eb56126f3d8bee1a58e2d9275fd16a9ebc4da105f0e9b0eb887b268175c3d38b00cb47c0502d2fe6bf7467436"

RPROVIDES:${PN} += "pantheon-iconbrowser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libgtksourceview-5.so.0"

inherit rpm
