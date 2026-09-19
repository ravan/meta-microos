SUMMARY = "Uzbek localization files for LibreOffice"
DESCRIPTION = "Provides Uzbek translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-uz-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "a3004551fc880c9ff6005c4ca51e55f41e413eef2a288a69c84c38544cde8c64676b971273ca92a38c7b7532170c4017521f6149351ab18053717e1b133e40bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-uz \
libreoffice-l10n-uz \
locale-libreoffice-uz"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
