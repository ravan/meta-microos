SUMMARY = "Punjabi localization files for LibreOffice"
DESCRIPTION = "Provides Punjabi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-pa-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "7cae0b7e2facb92d618f02971ab98c78a3fac1c8200c445915dda551beea75676117d21c7a144b1f596426361b470213941a6f421c752dae739caaee3f5da97c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pa \
libreoffice-help-pa-IN \
libreoffice-l10n-pa \
libreoffice-l10n-pa-IN \
locale-libreoffice-pa"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
