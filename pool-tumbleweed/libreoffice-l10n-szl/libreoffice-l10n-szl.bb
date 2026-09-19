SUMMARY = "Silesian localization files for LibreOffice"
DESCRIPTION = "Provides Silesian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-szl-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "9b15f1ef727c413fa88578c726645837bcc6b6ca7ff15e81b043d1b180a718977e18ba404e5c4c64aecf80af58fb86841619b6fb68bd4475f3cc22b20bf3b76e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-szl \
libreoffice-l10n-szl \
locale-libreoffice-szl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
