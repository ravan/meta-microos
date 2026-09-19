SUMMARY = "Oromo localization files for LibreOffice"
DESCRIPTION = "Provides Oromo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-om-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "ae5d6ee9488b6ab17551b7f00c418210bb26a67bc14dd87852b88a2e2d10f635c673c274ac757ff20744358cb0e0761a83f37cbc6a18953777aab5fb91b8c3ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-om \
libreoffice-l10n-om \
locale-libreoffice-om"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
