SUMMARY = "Hungarian localization files for LibreOffice"
DESCRIPTION = "Provides Hungarian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-hu-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "8060d89a4637ac758d2ed46066cfc0d77177717b227478dcccd152ad88f389a73fced866460adceba913d68ff620a53c49d7b15ebe2bde98918236c8c031f322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hu \
libreoffice-l10n-hu \
locale-libreoffice-hu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hu-HU"

inherit rpm
