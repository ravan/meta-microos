SUMMARY = "Italian localization files for LibreOffice"
DESCRIPTION = "Provides Italian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-it-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "38db48935571d5ba9757caeca8eee0d0db9ed2565c69dcc4edc6a84ae5c3ea3b311a09403d66001250db609da0cf25a41a6fa17aba9fb95c9149a047581c4a4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-it \
libreoffice-l10n-it \
locale-libreoffice-it"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-it-IT"

inherit rpm
