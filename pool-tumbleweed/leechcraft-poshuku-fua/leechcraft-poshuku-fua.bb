SUMMARY = "LeechCraft Poshuku module to change the user agent"
DESCRIPTION = "This package provides a fake user agent plugin for LeechCraft Poshuku \
for setting different User-Agent strings for different URLs. \
 \
Features: \
 * URLs are defined either by their substring or by regular expression. \
 * Several popular predefined user agents are present. \
 * Support for custom user-defined strings. \
 * Support for automatic insertion of current platform, language, \
etc. into the User-Agent string in arbitrary places."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-poshuku-fua-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "b3f0a4dffb557b2a128d046655865e44bc6371bda3d03fdda00520dc97f0b9af5a410044242829d5451f5ea0a90fc63916af78f328aa08e5c20b9fcbcd2bb065"

RPROVIDES:${PN} += "leechcraft-poshuku-fua \
libleechcraft-poshuku-fua.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
