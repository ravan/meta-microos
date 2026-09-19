SUMMARY = "LeechCraft Poshuku Autosearch Module"
DESCRIPTION = "This package provides an autosearch plugin for LeechCraft Poshuku."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-poshuku-autosearch-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "a4780c0e8f3f5332252ee8e77599fea5549da48331f3f1443c6f4aaed1a0431a7a8fe7307e0ef87c8e4d464b9d4b6737fc11326cc3d8eeb3fb65bb6be6f4722f"

RPROVIDES:${PN} += "leechcraft-poshuku-autosearch \
libleechcraft-poshuku-autosearch.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
