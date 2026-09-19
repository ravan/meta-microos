SUMMARY = "Portuguese localization files for LibreOffice"
DESCRIPTION = "Provides Portuguese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-pt_PT-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "6a3b3e1a8480210df80dcebf1688e7955c2dd37df2d3dcfd303facfb60e9b45ddc4ac9732dac987a9e8ca436eb757cc2963276cd8dd3a30ab74570886bca53d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pt \
libreoffice-help-pt-PT \
libreoffice-l10n-pt \
libreoffice-l10n-pt-PT \
locale-libreoffice-pt-PT"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pt-PT"

inherit rpm
