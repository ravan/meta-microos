SUMMARY = "Sindhi localization files for LibreOffice"
DESCRIPTION = "Provides Sindhi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-sd-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "592a2395f41f0b31bcb6bd3deff0de52208e58d4b06bcf4da309debc6a087138a01556ef72bb3190b4526d022438eacdeeee3136ff7b9e375aae9211ed4e5932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sd \
libreoffice-l10n-sd \
locale-libreoffice-sd"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
