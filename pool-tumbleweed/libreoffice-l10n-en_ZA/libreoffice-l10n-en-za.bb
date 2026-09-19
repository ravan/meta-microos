SUMMARY = "English_ZA localization files for LibreOffice"
DESCRIPTION = "Provides English_ZA translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-en_ZA-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "9940de01a8f7f7d4735c97c3a3b2628bab9e4fe82443c8be89014cda18f788e08cb0baac15e3ad76e3a4615036526968f102f9b63d7a1d687a618b5f33233560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en-ZA \
libreoffice-l10n-en-ZA \
locale-libreoffice-en-ZA"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en-ZA"

inherit rpm
