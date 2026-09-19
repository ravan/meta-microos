SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is an implementation of XEP-0049: Private XML Storage."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-storagenotesplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "4a754d0358e9f1f25ee92798f6428d3116b2baa70eefb88b313480ddd3953ee43107274a3eb6e0852aefd8a2aca4e4cf70f93c5de686e010139818f72b8996da"

RPROVIDES:${PN} += "libstoragenotesplugin.so \
psi+-plugins-storagenotesplugin"

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
