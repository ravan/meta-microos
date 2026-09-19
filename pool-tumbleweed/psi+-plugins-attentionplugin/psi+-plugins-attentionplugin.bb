SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to send and receive special messages such as Attentions."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-attentionplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "cfb9a4cc4314e2c12c796c8fc4bafd077cf7fc4a781a3f4b73beafd4cd12a5f894336fa76147d7434ee6ec57542e1d110cc05ccdd5fb379a13713442f9b92a22"

RPROVIDES:${PN} += "libattentionplugin.so \
psi+-plugins-attentionplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
