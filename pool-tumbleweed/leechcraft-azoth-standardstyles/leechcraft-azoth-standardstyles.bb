SUMMARY = "LeechCraft Azoth Standard chat styles Module"
DESCRIPTION = "This package provides a standard styles support plugin for LeechCraft Azoth. \
 \
Standard styles are the ones in LeechCraft's own format."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-standardstyles-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "547d7b6ac9550bfb28de94f768d3b53e693040db7fd43ccd3f75ed3b275d038222d999dff765a759c0cae1ff82fade7424d84553ea409e0b28365a9eb4a20605"

RPROVIDES:${PN} += "leechcraft-azoth-standardstyles \
libleechcraft-azoth-standardstyles.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
