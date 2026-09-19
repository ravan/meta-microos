SUMMARY = "English_GB localization files for LibreOffice"
DESCRIPTION = "Provides English_GB translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-en_GB-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "3a122a93f420a3a5932000874c409c51a2b0abd3528d6666e4cfc9330dc929d6ff8a8f7a7ab6d8edbf7df50a6b9af96213466b7f524fdc13b9abfefc7a650ec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en-GB \
libreoffice-l10n-en-GB \
locale-libreoffice-en-GB"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en-GB"

inherit rpm
