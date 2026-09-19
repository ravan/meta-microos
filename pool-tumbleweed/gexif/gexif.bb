SUMMARY = "GTK Tool for Viewing EXIF Information"
DESCRIPTION = "This tool contains simple GTK interface for viewing EXIF information \
within JPEG images created by some digital cameras."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5"

RPM_NAME = "gexif-0.5-208.7.aarch64.rpm"
RPM_HASH = "85addecf3bca13c39bd95079af0d090f60513431d425ddab1e9201f98e340c7e4faba3ef498c2c2b317307b1695db738bfe43774ba18baee6001fad88ba82438"

RPROVIDES:${PN} += "gexif"

RDEPENDS:${PN} += "gexif-lang \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexif-gtk.so.5 \
libexif.so.12 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
