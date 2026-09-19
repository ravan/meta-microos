SUMMARY = "Plugin for Psi"
DESCRIPTION = "The plugin is designed to enumerate messages, adding the messages numbers in \
chat logs and notification of missed messages. \
 \
Supports per contact on / off message enumeration via the buttons on the chats \
toolbar."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-enummessagesplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "5827387d4848a0354989cfedb8652eb69bb43583cea43d163560ef5320137bbef08ce71e58994e308f86fdaec63df4a0e7cd971bf3b6b544c7c716c6f2c6c902"

RPROVIDES:${PN} += "libenummessagesplugin.so \
psi+-plugins-enummessagesplugin"

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
