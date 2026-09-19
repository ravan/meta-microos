SUMMARY = "Bosnian localization files for LibreOffice"
DESCRIPTION = "Provides Bosnian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-bs-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "56a599cda31d8caa9ea324101ad5502074dcac33b222d2de6b0b23246f9950a1edd94fdb2cebea93ca4d28f1a409f9f8afa67066033f76555dadd6c0f7b39747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bs \
libreoffice-l10n-bs \
locale-libreoffice-bs"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
