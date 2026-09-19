SUMMARY = "Finnish localization files for LibreOffice"
DESCRIPTION = "Provides Finnish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-fi-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "35b8946d51bb307bb3f3f1cccea446365fc5fa63f550e40c133b270067c81c834304aa38bd083c99a6f60d223718646963be81d29d14bf5961f871bc67fcc260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fi \
libreoffice-l10n-fi \
locale-libreoffice-fi"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
libreoffice-voikko"

inherit rpm
