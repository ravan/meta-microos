SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin allows you to convert selected text into another language."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-translateplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "47ee72e30fa7246eba46a5d4cd5fcfbea56a34a507ac1e849bdb97275fcf662605e76fabb47e8d58bc1c488eba22a6c14c0bfc6e7bf850737c865cb6560513ab"

RPROVIDES:${PN} += "libtranslateplugin.so \
psi+-plugins-translateplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
