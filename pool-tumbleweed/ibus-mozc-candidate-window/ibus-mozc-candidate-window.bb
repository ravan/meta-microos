SUMMARY = "An optional candidate window for ibus-mozc"
DESCRIPTION = "This package provides an advanced candidate window for IBus. The \
window shows examples of selected words."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain & Zlib"

PV = "3.33.6133.102"

RPM_NAME = "ibus-mozc-candidate-window-3.33.6133.102-2.2.aarch64.rpm"
RPM_HASH = "72fcad4edc463ca3bc5cf547484f8a266657f1a0e6be0eb61c28fd1590d51bec63590784febe1fc4d420f4ae7a33ce8ee83611fbefb87386510588d76d70e397"

RPROVIDES:${PN} += "ibus-mozc-candidate-window \
locale-ibus-ja"

RDEPENDS:${PN} += "ibus-mozc \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
