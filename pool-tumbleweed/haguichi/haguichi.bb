SUMMARY = "Hamachi Network Manager"
DESCRIPTION = "Haguichi provides a graphical frontend for Hamachi. \
It features customizable commands, notification bubbles, tooltips, along with a \
searchable, sortable and collapsible network list. It also can backup and \
restore the Hamachi configuration directory."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.4"

RPM_NAME = "haguichi-1.5.4-1.3.aarch64.rpm"
RPM_HASH = "c7ef60fc0a4711ca3d650ad964b834fd814a702e5f49d6fe69c02eeaf7630cc2b43e72c85a1cbf4ab27c1e204ddec9dabe8459a3d8fb21c00607b835b152ec0c"

RPROVIDES:${PN} += "haguichi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libportal-gtk4.so.1 \
libportal.so.1"

inherit rpm
