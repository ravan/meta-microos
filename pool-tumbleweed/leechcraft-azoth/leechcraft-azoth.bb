SUMMARY = "LeechCraft Instant messenger Module"
DESCRIPTION = "This package provides a modular, multi-protocol IM client for LeechCraft. \
 \
Protocol support is provided by corresponding plugins. \
Unlike other multiprotocol clients which tend to implement only those \
features that are present in all the protocols, Azoth is modelled after the \
XMPP protocol, aiming to provide extensive and full support for XMPP while \
remaining usable for other protocols."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "8c975bdd2c951920ebf470c51c94c9cb0e52d7f2be36e148fe238c047bf86c472c8e29e6365d70a69ec09ae9c683db0c53c62d03afbfecaa185689384b7e8531"

RPROVIDES:${PN} += "leechcraft-azoth \
libleechcraft-azoth.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-azoth-protocolplugin \
leechcraft-azoth-standardstyles \
leechcraft-securestorage \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-azoth-util-qt6.so.0.6.75 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-network-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-shortcuts-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-tags-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-util-xsd-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libm.so.6 \
libqca-qt6.so.2 \
libstdc++.so.6"

inherit rpm
