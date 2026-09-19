SUMMARY = "Bodo localization files for LibreOffice"
DESCRIPTION = "Provides Bodo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-brx-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "17e8beef2446cda2fedebff39ecb1acf467fd1d95d7be05b768030f2cc51a282218a23d40d11bf9aa0b7f71ae0d89426ad4444b0c499c6d2ef1bca410c249b29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-brx \
libreoffice-l10n-brx \
locale-libreoffice-brx"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
