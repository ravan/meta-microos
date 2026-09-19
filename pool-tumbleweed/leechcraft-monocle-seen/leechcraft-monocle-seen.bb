SUMMARY = "Djvu support for LeechCraft Monocle"
DESCRIPTION = "This package contains a LeechCraft Monocle subplugin for djvu \
document support via the djvulibre backend."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-monocle-seen-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "ad8e570a2f1ba308533e67e017cc0a197c4bb830d1b402df030694cbd349834cffe4366bddacfb412e748cfdbd8428711cd55d77373ea28028d58dc5c6a49391"

RPROVIDES:${PN} += "leechcraft-monocle-seen \
leechcraft-monocle-subplugin \
libleechcraft-monocle-seen.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-monocle \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libdjvulibre.so.21 \
libgcc-s.so.1 \
libleechcraft-monocle-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
