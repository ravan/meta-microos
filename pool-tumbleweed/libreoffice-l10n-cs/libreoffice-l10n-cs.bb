SUMMARY = "Czech localization files for LibreOffice"
DESCRIPTION = "Provides Czech translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-cs-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "59847c5daa54a50fa374cc5453148b713399cfd00fbd1d2b3e229624e33c229f1611f96d994e50fb10736138bc0d91df980b931502d173c88d44a11368d24fde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-cs \
libreoffice-l10n-cs \
locale-libreoffice-cs"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-cs-CZ"

inherit rpm
