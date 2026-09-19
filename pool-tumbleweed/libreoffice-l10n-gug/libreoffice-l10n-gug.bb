SUMMARY = "Paraguayan_Guaraní localization files for LibreOffice"
DESCRIPTION = "Provides Paraguayan_Guaraní translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-gug-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "baceef5c7516f8378bd1c0f835eb6279a0d17dcdfd619a3e7285a35de83ebe28b2106a71368937141535f4c41f38d01d1e895666b5626c75e6bec101341f7de6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gug \
libreoffice-l10n-gug \
locale-libreoffice-gug"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gug"

inherit rpm
