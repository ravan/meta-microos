SUMMARY = "LeechCraft Azoth IRC Module"
DESCRIPTION = "This package provides an IRC protocol plugin for LeechCraft Azoth. \
 \
Features: \
 * Secure Sockets Layer (SSL) cryptographic protocol. \
 * Channel bookmarks. \
 * Automatic password entry. \
 * Automatic login."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-acetamide-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "9cd7be221f1d4cef6c82ca51f4f649e7232b6e048aee0e82957727b7b10aec5bfc5cd80383f5c316d288020053edc64308f014337762c7a07f56bba75f73bedd"

RPROVIDES:${PN} += "leechcraft-azoth-acetamide \
leechcraft-azoth-protocolplugin \
libleechcraft-azoth-acetamide.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-azoth-util-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
