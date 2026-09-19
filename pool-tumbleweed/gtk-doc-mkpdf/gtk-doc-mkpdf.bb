SUMMARY = "Gtkdoc PDF Generator"
DESCRIPTION = "PDF generator for Gtkdoc."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "gtk-doc-mkpdf-1.36.1-1.2.aarch64.rpm"
RPM_HASH = "8468ca021569746973d3fe6f841bb4a93e3a61f00dc0461b845571b3e1668ea6c5446e19cde9625c30bb71355371a2077648b0ee213014d220e9c6ddd0f090f3"

RPROVIDES:${PN} += "gtk-doc-mkpdf"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
dblatex \
gtk-doc"

inherit rpm
