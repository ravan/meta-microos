SUMMARY = "Northern_Sotho localization files for LibreOffice"
DESCRIPTION = "Provides Northern_Sotho translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-nso-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "25e0c7daee6e796cccd9e251c13d2b698c30c2ff03980fbe6191a74536d3fed38a4af440d5d9cddb2cbf6cd3192fe4138b2b07475539473c2bbc0d2d6124dfc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nso \
libreoffice-l10n-nso \
locale-libreoffice-nso"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
