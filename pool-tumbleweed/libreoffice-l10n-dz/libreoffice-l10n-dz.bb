SUMMARY = "Dzongkha localization files for LibreOffice"
DESCRIPTION = "Provides Dzongkha translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-dz-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "ec13e63f687af0da849f01362c04f4c766e2f015dd59302221400299e1dd08f4ad4df6bdb81ca5a5dcb53ab570b02d934e44b011559639896972badbe9d4a111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dz \
libreoffice-l10n-dz \
locale-libreoffice-dz"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
