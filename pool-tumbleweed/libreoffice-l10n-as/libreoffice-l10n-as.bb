SUMMARY = "Assamese localization files for LibreOffice"
DESCRIPTION = "Provides Assamese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-as-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "ccf864d1791474f45d84b5070f69587de28872f85627742ff10b9e8441357485c1464367cbaf8f6e83b15d529015c4339ad673127ec699b42e1c24a9807d538c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-as \
libreoffice-l10n-as \
locale-libreoffice-as"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
