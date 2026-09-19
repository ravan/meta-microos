SUMMARY = "Spanish localization files for LibreOffice"
DESCRIPTION = "Provides Spanish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-es-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "0ff5bf0afa133b40b22a7c80ecc9d11a0c86dce1ee043244fee5a18376b31f1c9783218bbe9c7d2bfb696173d3bc44511114e578ad7b7328d1c70d8f3dee6767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-es \
libreoffice-l10n-es \
locale-libreoffice-es"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-es"

inherit rpm
