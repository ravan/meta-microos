SUMMARY = "English localization files for LibreOffice"
DESCRIPTION = "Provides English translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-en-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "697b78ec9dfe262695dac50df49efc44a16deda6f2e0887a7ac2c566f7fd99cd675e0b1b57fdcc30a45957f5cc666ba1c6eadc0aa339247b35293c0866574131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en \
libreoffice-help-en-US \
libreoffice-l10n-en \
locale-libreoffice-en"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en"

inherit rpm
