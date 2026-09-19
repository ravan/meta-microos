SUMMARY = "Navigator for finding and browsing system icons"
DESCRIPTION = "Lookbook is a browser for system icons. Icons can be grouped by \
category or be searched by icon name. Icons are shown in different \
sizes. A code snippet to use in programs can be displayed."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "lookbook-1.2.0-2.8.aarch64.rpm"
RPM_HASH = "e2d29b3a724fc69e1a5579bc3412aa593a20edd59bba8bb4fd010ff0025d828bb9ca40fcee4b49e3b5eaac77a9eda612e327dd77e880ee324b16840d2de9fc1a"

RPROVIDES:${PN} += "lookbook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libhandy-1.so.0"

inherit rpm
