SUMMARY = "qpdfview plugin: PostScript documents"
DESCRIPTION = "This plugin is required to read PostScript documents \
(*.ps files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-ps-0.5.0-4.5.aarch64.rpm"
RPM_HASH = "ba419cb439a3c6660b31dae80e7ebbc540db4da2bafc06f8f22de13063fd38b0c92dc8a2ac9432adb65a6d98bdc2f1ebf3f84c9085c109b24e51ff9291ecf7c0"

RPROVIDES:${PN} += "libqpdfview-ps.so \
qpdfview-plugin-ps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libspectre.so.1 \
libstdc++.so.6 \
qpdfview"

inherit rpm
