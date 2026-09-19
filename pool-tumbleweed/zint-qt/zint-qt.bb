SUMMARY = "Zint Barcode Studio"
DESCRIPTION = "Zint Barcode Studio is a Qt-based GUI which allows desktop users to generate \
barcodes which can then be embedded in documents or HTML pages."
LICENSE = "GPL-3.0-or-later"

PV = "2.16.0"

RPM_NAME = "zint-qt-2.16.0-2.1.aarch64.rpm"
RPM_HASH = "5fdbeeee3c35f78da9b2fac97acd147f6a5c09c0f890ae8d31bb227734cb9fbfc3071f42cff148149031a8707f04808c4c3e52a71990c7667e7e9601d983a982"

RPROVIDES:${PN} += "zint-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQZint.so.2.16 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6UiTools.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
