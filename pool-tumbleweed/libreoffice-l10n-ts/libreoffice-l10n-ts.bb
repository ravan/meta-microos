SUMMARY = "Tsonga localization files for LibreOffice"
DESCRIPTION = "Provides Tsonga translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ts-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "99cd74833e49670f3d00ab5b8f95bed27bff7f2ddff8fd84d3d79c8c50da3ab155dbd4cd78ad6137c65447e34c66dded4d540b3bd8ca83f4c108cf7741649a08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ts \
libreoffice-l10n-ts \
locale-libreoffice-ts"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
