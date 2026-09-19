SUMMARY = "Development Files for HexChat"
DESCRIPTION = "This package includes files needed to develop HexChat modules."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.2"

RPM_NAME = "hexchat-devel-2.16.2-4.1.aarch64.rpm"
RPM_HASH = "65bf1a22567912f5fe3bb25f28790f8361530ad0cdb7ae63a66128ccd1156ad57f7512788a4f78617230a95cf555b3933530c9ac122ecb29e82eab186d864e51"

RPROVIDES:${PN} += "hexchat-devel \
pkgconfig-hexchat-plugin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
hexchat"

inherit rpm
