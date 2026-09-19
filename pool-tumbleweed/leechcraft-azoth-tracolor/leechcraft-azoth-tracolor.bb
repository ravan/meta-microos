SUMMARY = "LeechCraft Azoth color-indicating contacts activity Module"
DESCRIPTION = "This package provides a support for color-indicating contacts activity \
tracker plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-tracolor-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "54647291090ca478a6ba925e55d951c74a4c9e7a4dae2675e60187730a757c992f2cd170bf72efca4d00023062a5819b5b2f3b967eae98d7f9f167063f61bc7d"

RPROVIDES:${PN} += "leechcraft-azoth-tracolor \
libleechcraft-azoth-tracolor.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
