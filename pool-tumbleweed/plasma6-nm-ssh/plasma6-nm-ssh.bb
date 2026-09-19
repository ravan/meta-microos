SUMMARY = "SSH support for plasma6-nm"
DESCRIPTION = "Secure Shell (SSH) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "6.7.5"

RPM_NAME = "plasma6-nm-ssh-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "a2450734359c61b5d12ff6c304611bc3bd127b136af04686a0bdfa27a2e4c11291ba1d4bdc78c36ef5f7370869941366fb46591c03b2881ca1d30020803e39a5"

RPROVIDES:${PN} += "NetworkManager-ssh-frontend \
plasma-nm5-ssh \
plasma6-nm-ssh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libplasmanm-editor.so \
libstdc++.so.6 \
plasma6-nm"

inherit rpm
