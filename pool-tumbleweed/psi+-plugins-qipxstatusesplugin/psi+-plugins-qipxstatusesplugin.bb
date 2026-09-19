SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to display x-statuses of contacts using the QIP Infium \
jabber client."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-qipxstatusesplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "5419a1e9ca5df2911cc09fac5ab11b88155c734f2bbd9b2e0314c87cf043ed962190f5c6500d612c9e22102dc584252fa6dbe377e462b09c83caf7fb1b3d119b"

RPROVIDES:${PN} += "libqipxstatusesplugin.so \
psi+-plugins-qipxstatusesplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
