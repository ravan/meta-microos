SUMMARY = "LeechCraft HTTP Module"
DESCRIPTION = "This package provides a HTTP implementation plugin for LeechCraft \
which will mainly used by many other plugins like Aggregator or \
SeekThru. \
 \
Features: \
 * Support for redirects. \
 * Automatic downloads from other plugins. \
 * Support for continuing interrupted downloads."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-cstp-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "22d181127821f0e9f624917e50a5b3bd5ec1ed01d6280758ad975349ad9575461ce3ebec1c45c26fee2afffa946006c0474c7558db3ea01ba36ebc86b17264b5"

RPROVIDES:${PN} += "leechcraft-cstp \
leechcraft-http \
libleechcraft-cstp.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
