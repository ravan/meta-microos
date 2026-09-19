SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin acts as an auto-answering machine."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-autoreplyplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "243d7590a317279556fd714e653e072a063062608ebfd35c02fa4d1651503882715ed5affaa52a1f374832df678be565513443083c7ca733a06187d4d4e0ba79"

RPROVIDES:${PN} += "libautoreplyplugin.so \
psi+-plugins-autoreplyplugin"

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
