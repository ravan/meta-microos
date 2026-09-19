SUMMARY = "Santali localization files for LibreOffice"
DESCRIPTION = "Provides Santali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-sat_Olck-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "b9e228b13a319056d48259192267b94c3ced11a5c0502b3e475f9d108ae3ec7287970fb30431c58540811d5f265e8783c939e63c3f99fcd7257488d811c0121b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sat-Olck \
libreoffice-l10n-sat-Olck \
locale-libreoffice-sat-Olck"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
