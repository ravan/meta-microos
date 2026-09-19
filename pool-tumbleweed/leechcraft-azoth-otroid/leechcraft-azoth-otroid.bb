SUMMARY = "LeechCraft Azoth Off-the-Record Module"
DESCRIPTION = "This package provides support for Off-the-Record messaging for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-otroid-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "a3dea3de9c8e3193fcab9f2f95e3663ee0fa1d454888f40348479958a6072ed3ce6c1a7df388900e16965e2c1ea6c6b75b11d4420cf97a0c8b71f827fc76c367"

RPROVIDES:${PN} += "leechcraft-azoth-otroid \
libleechcraft-azoth-otroid.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-azoth-util-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libotr.so.5 \
libstdc++.so.6"

inherit rpm
