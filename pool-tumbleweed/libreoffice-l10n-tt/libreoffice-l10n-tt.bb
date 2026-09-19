SUMMARY = "Tatar localization files for LibreOffice"
DESCRIPTION = "Provides Tatar translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-tt-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "d8c616700205389c58a19bd1cc96dd66259b9b5c7db5499e79bcb3657d95e738f8744badb111dd1851dc5c96a1c100de7c344939b9db3bc87656bcf4786fb197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tt \
libreoffice-l10n-tt \
locale-libreoffice-tt"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
