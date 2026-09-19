SUMMARY = "LeechCraft Screenshooter Module"
DESCRIPTION = "This package provides a LeechCraft plugin to make screenshots of \
LeechCraft and then either save them locally or upload them to an \
imagebin."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-auscrie-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "334a1654c11ec338ea38e4369d5890872ca57707e8a1bd2a826737e0da7a75d73690a67e44ee1a898b4b3a882ed7042041742375f8effbbc201810120bf52fda"

RPROVIDES:${PN} += "leechcraft-auscrie \
libleechcraft-auscrie.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-imgaste \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
