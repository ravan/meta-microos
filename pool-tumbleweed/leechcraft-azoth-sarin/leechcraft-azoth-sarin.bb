SUMMARY = "LeechCraft Azoth Tox Module"
DESCRIPTION = "This package provides Tox support plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-sarin-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "a6f8bd1faa640795181d0c13c7bcf991b41f9bd479602fc57acfc5fc8c19e35f5aa0f33b680f82377177ac4dce797ecae6d988d843d0b0135be43ffb80cc953b"

RPROVIDES:${PN} += "leechcraft-azoth-protocolplugin \
leechcraft-azoth-sarin \
libleechcraft-azoth-sarin.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-azoth-util-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6 \
libtoxcore.so.2"

inherit rpm
