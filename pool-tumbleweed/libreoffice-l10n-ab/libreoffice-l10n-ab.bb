SUMMARY = "Abkhazian localization files for LibreOffice"
DESCRIPTION = "Provides Abkhazian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ab-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "aeca82f0a7df6f77e8837a98d3eb0f6d59514eb7e3f22cda2c1039d53f9687f9fe2bd99ff40c8ee6090e968276986fa1a2484ea6656508fd5cdabb8b78085d85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ab \
libreoffice-l10n-ab \
locale-libreoffice-ab"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
