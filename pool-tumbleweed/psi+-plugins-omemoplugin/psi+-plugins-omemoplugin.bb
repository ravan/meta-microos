SUMMARY = "Plugin for Psi"
DESCRIPTION = "OMEMO Multi-End Message and Object Encryption."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-omemoplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "771a6ba1a41b5f6915c6c85c1427d7dd2473b1a0c4d492bd784de57cd99a409b30fb49dbacedc434286051d73637b4e5fbdc7a763f19c84d20c4424090b0df62"

RPROVIDES:${PN} += "libomemoplugin.so \
psi+-plugins-omemoplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libomemo-c.so.0 \
libstdc++.so.6 \
psi+"

inherit rpm
