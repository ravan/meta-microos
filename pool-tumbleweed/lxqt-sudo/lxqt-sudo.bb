SUMMARY = "GUI frontend for sudo"
DESCRIPTION = "A graphical frontend for plain sudo (for requesting optional password in GUI \
fashion). \
When invoked it simply spawns child sudo process with requested command (and \
arguments). If sudo requests user's password, the GUI password dialog is shown \
and (after submit) the password is provided to sudo."
LICENSE = "LGPL-2.1-only"

PV = "2.4.0"

RPM_NAME = "lxqt-sudo-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "b0aaece2b5b4e22cc43ec3a032f1f278d3b7272a7cf340a04a3eac240af741cdc588acd11eaceaf03e9dd5d29dae64df0572e95f9e549c897f0b72d8aa0d9a03"

RPROVIDES:${PN} += "lxqt-sudo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
liblxqt.so.2 \
libstdc++.so.6 \
sudo"

inherit rpm
