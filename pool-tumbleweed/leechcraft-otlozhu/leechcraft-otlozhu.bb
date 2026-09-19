SUMMARY = "LeechCraft ToDo manager Module"
DESCRIPTION = "This package provides a GTD-inspired ToDo manager plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-otlozhu-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "05743b4a08a0842ada3716831960b50362bb871a1fdf4cea1073970ae21451d7e5a9252525ae8f9cf058f5bbcae872ab3857c32f9d49104b58d5a640f838f597"

RPROVIDES:${PN} += "leechcraft-otlozhu \
libleechcraft-otlozhu.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-tags-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
