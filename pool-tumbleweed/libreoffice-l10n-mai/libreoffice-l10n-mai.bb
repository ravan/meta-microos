SUMMARY = "Maithili localization files for LibreOffice"
DESCRIPTION = "Provides Maithili translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-mai-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "7fe1c17d12a0d476ea69aeb43fe2b26761c6666f3faa7326784e15fb31a062ca4a781f7a46513692991511b274f60a13d25352394a6b27d7657aed289e7950e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mai \
libreoffice-l10n-mai \
locale-libreoffice-mai"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
