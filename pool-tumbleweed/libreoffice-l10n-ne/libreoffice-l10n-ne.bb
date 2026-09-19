SUMMARY = "Nepali localization files for LibreOffice"
DESCRIPTION = "Provides Nepali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ne-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "4075eec216eeff721f43f8f31c965c544b20ec1abaf7dabda33cc1ee63d389de7a154ccc044aead1dbe11a444cbc9ebb8da91150b4bdecc659cb62350536b5b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ne \
libreoffice-l10n-ne \
locale-libreoffice-ne"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ne-NP"

inherit rpm
