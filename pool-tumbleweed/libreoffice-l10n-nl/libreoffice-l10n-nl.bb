SUMMARY = "Dutch localization files for LibreOffice"
DESCRIPTION = "Provides Dutch translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-nl-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "aff476a1dd52bca9af7fc8d5ad7cad6358376ef3eb0fb7bceea647da374179798eaf5d6cd897335795570c62bcec3a635b26d8e7138471bbf631dcb50015277d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nl \
libreoffice-l10n-nl \
locale-libreoffice-nl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-nl-NL"

inherit rpm
