SUMMARY = "Tag utility library for LeechCraft"
DESCRIPTION = "A library providing some classes and functions commonly used \
with the LeechCraft tags subsystem."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-tags-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "c5557230a6397017b7ba379964af9a8113bee53643dfe126855d11075a2da1a757af8c9561d3935c341fbf9f004e348ef3dabf76dc29a5f47b4c7e77377b4724"

RPROVIDES:${PN} += "libleechcraft-util-tags-qt6-0-6-75 \
libleechcraft-util-tags-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
