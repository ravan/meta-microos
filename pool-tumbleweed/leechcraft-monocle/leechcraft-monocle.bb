SUMMARY = "LeechCraft Document viewer Module"
DESCRIPTION = "This package provides a modular document viewer plugin for LeechCraft \
which supports different formats via backends."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-monocle-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "d38063386bc3de4e99a4ba4edcbdc20eb407ef3d3f0dfe75771c0bce94ab64036243455fb031a12182faa1d76cbd0f620cadf39b596f405505ae9cbeab9e5f5f"

RPROVIDES:${PN} += "leechcraft-monocle \
libleechcraft-monocle.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-monocle-subplugin \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-monocle-util-qt6.so.0.6.75 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-shortcuts-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
