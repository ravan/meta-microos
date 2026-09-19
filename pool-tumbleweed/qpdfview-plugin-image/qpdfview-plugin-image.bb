SUMMARY = "qpdfview plugin: Image files"
DESCRIPTION = "This plugin is required to read Image files \
(*.tiff files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-image-0.5.0-4.5.aarch64.rpm"
RPM_HASH = "4323730220cdd5f528fffb1bf5f2615a2c6de662e326e8b999f20b4c402f6a9b56fd65889a4199fe65964e468f830bd4c812640acc9bd3c18c641863e8847e16"

RPROVIDES:${PN} += "libqpdfview-image.so \
qpdfview-plugin-image"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qpdfview"

inherit rpm
