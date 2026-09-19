SUMMARY = "LeechCraft Package manager Module"
DESCRIPTION = "This package provides a package manager plugin for Leechcraft. \
 \
It allows to install script plugins, iconsets, translations, additional data \
and other similar packages. \
 \
It also supports dependencies between packages as well as versioning and \
automatic updates of the packages. \
 \
Features: \
 * Allows installation of script plugins, icons and various other data. \
 * Supports versioning and automatic updates of packages. \
 * Supports dependencies between packages. \
 * Operates in user's home directory."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-lackman-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "8659e53fef1fbdf75ddcf5696273278881f3fa54d2c8c3aab9bf0740a0bb0c08578ad7b39e35d577869908a161af6e44fcbc74701468e54f3fa4b95739c75795"

RPROVIDES:${PN} += "leechcraft-lackman \
libleechcraft-lackman.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-http \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-shortcuts-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-tags-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6 \
xz"

inherit rpm
