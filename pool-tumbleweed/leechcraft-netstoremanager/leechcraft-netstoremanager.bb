SUMMARY = "LeechCraft Network file storages Module"
DESCRIPTION = "This package provides a network storage plugin for Leechcraft. \
 \
It allows to manage network storages such as Google Drive. \
Different storages can be added to it without modifying the plugin itself. \
 \
Features: \
 * Upload files from LeechCraft. \
 * Maintain the list of uploaded files. \
 * Delete the uploaded files (if supported by service). \
 * Support for prolongating uploaded files (if supported by service)."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-netstoremanager-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "1a44dead6a2d1e03da2241fb2134cb429f24c9661d052fa5c781e138c69aae86d4eec04adeb572b645d1208d7dd6b447b6e658946ef3b70743bc8886aee1c1da"

RPROVIDES:${PN} += "leechcraft-netstoremanager \
libleechcraft-netstoremanager.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-netstoremanager-subplugin \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libboost-container.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
