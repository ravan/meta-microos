SUMMARY = "Tajik localization files for LibreOffice"
DESCRIPTION = "Provides Tajik translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-tg-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "5b6c854173d212ec80d5d86f54f855f8b4362d18c5b58f49044ef4aab8bd02c06841edd3b1cd6ca74742e55dc388f24da7e975a3b3ceb48f0ff9e232eed6277e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tg \
libreoffice-l10n-tg \
locale-libreoffice-tg"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
