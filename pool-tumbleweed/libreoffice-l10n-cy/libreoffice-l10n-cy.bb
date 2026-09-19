SUMMARY = "Welsh localization files for LibreOffice"
DESCRIPTION = "Provides Welsh translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-cy-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "4824e5691a80f8c1ed7ca12a85bfa52ca15da6868e7b8aaed399ba7e75c56e5518d25ed1349908718f51afb29859fbca7710fba7ef3086643b7f9cf07e9aa649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-cy \
libreoffice-l10n-cy \
locale-libreoffice-cy"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
