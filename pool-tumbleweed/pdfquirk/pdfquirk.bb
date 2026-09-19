SUMMARY = "App to create PDFs from images or scans"
DESCRIPTION = "PDF Quirk helps to generate PDF files from images from storage \
or directly from the scanner."
LICENSE = "GPL-3.0-only"

PV = "0.95"

RPM_NAME = "pdfquirk-0.95-3.8.aarch64.rpm"
RPM_HASH = "bebe29f55d4f0493525c2ad9a654fbd0e5893b8505bd714231ace87610693ddbcb2565fabed86bfee0540ae03c241018fbca8f65f279bbd2172ee63f92d5fc6f"

RPROVIDES:${PN} += "pdfquirk"

RDEPENDS:${PN} += "ImageMagick \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
