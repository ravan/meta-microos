SUMMARY = "Venda localization files for LibreOffice"
DESCRIPTION = "Provides Venda translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ve-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "2cb35b10dd8126ebe9affdcaf420f84f15bfdbbf2abe9b9e1f5ef80635a0e8638bafe6c1d2d589b540735f0ec9d7cd83aecdb5bb63470edef06ded8d20c77965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ve \
libreoffice-l10n-ve \
locale-libreoffice-ve"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
