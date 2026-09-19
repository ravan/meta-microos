SUMMARY = "Palm Pilot Image Viewer to PGM Converter"
DESCRIPTION = "Tools for converting Pilot Image Viewer pdb files to and from Portable \
Graymaps and Portable Bitmaps. The tools support grayscale and \
monochrome images with or without compression and with or without \
notes. \
 \
If you are looking for a cool (and free) image viewer for your Pilot, \
you should look at TinyViewer (http://www.righto.com/pilot/tv.html)."
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "imgvtopgm-2.1-1.9.aarch64.rpm"
RPM_HASH = "669fae9f34e2cab9cfa61b8c088c2690ef31cff9ea6605b14e145b1e0f9a24940dc6f231acd784e14efdac5dac40e141f4856eb13a78c83fd020e4c2f99e0b08"

RPROVIDES:${PN} += "imgvtopgm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnetpbm.so.11 \
netpbm"

inherit rpm
