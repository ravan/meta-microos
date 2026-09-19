SUMMARY = "LeechCraft Tag Manipulating Module"
DESCRIPTION = "This package provides a tag editor plugin for LeechCraft \
with with audio file tags can be manipulated."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-lmp-graffiti-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "004bcff763e530409497122e9d5e209d7994b5ee7b665194e309c3d53bba476f5a0c70b68a3a0c6c9b7ec523a83feff3994b33c60f40db07eeb872dd5fbc7ca3"

RPROVIDES:${PN} += "leechcraft-lmp-graffiti \
libleechcraft-lmp-graffiti.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-lmp-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-tags-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libm.so.6 \
libstdc++.so.6 \
libtag.so.2"

inherit rpm
