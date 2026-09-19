SUMMARY = "Romanian localization files for LibreOffice"
DESCRIPTION = "Provides Romanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ro-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "241a005fa3e20b175e4330186a3ab30371ff682e084c274abbb512b4eb8b2d9b3e6f7aab3db7292eed15503afa54f4ab8a865857c86ff81e3a8aaaeabfb23f88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ro \
libreoffice-l10n-ro \
locale-libreoffice-ro"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ro"

inherit rpm
