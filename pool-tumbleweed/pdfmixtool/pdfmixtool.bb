SUMMARY = "Split, Merge, Rotate and Mix PDF Files"
DESCRIPTION = "An application to split, merge, rotate, mix and create multipage PDF files."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "pdfmixtool-1.2.2-1.4.aarch64.rpm"
RPM_HASH = "483c5d26eb1e97a9a7b9e54696884b6877f11339dbc6049d62dcbf6277147e89b002289f340ff36184e3b753c814aabd8e7fd7ab562906abd8e58b92a5c673fe"

RPROVIDES:${PN} += "pdfmixtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpoppler-qt6.so.3 \
libqpdf.so.30 \
libstdc++.so.6"

inherit rpm
