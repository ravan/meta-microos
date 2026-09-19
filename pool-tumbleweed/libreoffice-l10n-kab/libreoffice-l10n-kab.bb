SUMMARY = "Kabyle localization files for LibreOffice"
DESCRIPTION = "Provides Kabyle translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-kab-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "1f76a8fa142fe3d21071ea68c737d36995a0743e6205fe822348ea85ff497a628cacb95ab9557cb81530843444ee4384973cb307383cf2b6684b811c19ad6bf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kab \
libreoffice-l10n-kab \
locale-libreoffice-kab"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
