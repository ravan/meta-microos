SUMMARY = "qpdfview plugin: DjVu documents"
DESCRIPTION = "This plugin is required to read DjVu documents \
(*.djvu files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-djvu-0.5.0-4.5.aarch64.rpm"
RPM_HASH = "63fbbe279453b5dc0ae7bf4b592f8620f7c3456d43389edcb0a704fda3605347dc8a8f0e75aabfd7a01fb22a892bace227b3d461379ff0d723036b62c8ef283f"

RPROVIDES:${PN} += "libqpdfview-djvu.so \
qpdfview-plugin-djvu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdjvulibre.so.21 \
libgcc-s.so.1 \
libstdc++.so.6 \
qpdfview"

inherit rpm
