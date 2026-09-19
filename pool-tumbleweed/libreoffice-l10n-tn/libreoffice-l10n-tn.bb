SUMMARY = "Tswana localization files for LibreOffice"
DESCRIPTION = "Provides Tswana translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-tn-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "22768f84f76014bc96f7d4992ebb9f6824507c1058a4bdcdf816974e5da5050a858569c026bb0079c48eb9079c2e15da3aa5cde52d9efbf0f09e8a9a484511c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tn \
libreoffice-l10n-tn \
locale-libreoffice-tn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
