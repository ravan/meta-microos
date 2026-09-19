SUMMARY = "LeechCraft HTML WYSIWYG editor Module"
DESCRIPTION = "This package provides a HTML WYSIWYG editor plugin for Leechcraft, \
usable with mail and blog modules."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-lhtr-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "a022c1e8df33ce656144d501df8f625f6bf554cabadd79c7842763ffc288c4d322ff74a55ac079c49a4fa3f335f43e04f7965521bb670cd704b5ac564d936941"

RPROVIDES:${PN} += "leechcraft-lhtr \
libleechcraft-lhtr.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6 \
libtidy.so.58"

inherit rpm
