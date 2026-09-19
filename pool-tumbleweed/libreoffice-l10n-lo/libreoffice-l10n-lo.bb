SUMMARY = "Lao localization files for LibreOffice"
DESCRIPTION = "Provides Lao translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-lo-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "8267045e44d76648ed48f090125cafd0a809cfd0bac77f115f4a8b462b5435c24e4b47d68c2640de453437e02b37828611688afd9757d76b84d0613a73dc2e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lo \
libreoffice-l10n-lo \
locale-libreoffice-lo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lo-LA"

inherit rpm
