SUMMARY = "PostScript support for LeechCraft Monocle"
DESCRIPTION = "This package contains the PostRus subplugin for LeechCraft Monocle \
which supports PostScript document support via the ghostscript utilities."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-monocle-postrus-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "efdfb755374e6f015ce19c2c04521f0a1c08d6a08ccca0cea898a08b1c53329ac3025e96f7e15a7476dafc1b44649aaefdd7ae616dbe1c1c05d382a1623de49d"

RPROVIDES:${PN} += "leechcraft-monocle-postrus \
leechcraft-monocle-subplugin \
libleechcraft-monocle-postrus.so"

RDEPENDS:${PN} += "ghostscript \
ld-linux-aarch64.so.1 \
leechcraft-monocle-pdf \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
