SUMMARY = "French localization files for LibreOffice"
DESCRIPTION = "Provides French translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-fr-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "50b6f8365043e69396f0fdef154cd55d0306370f8e6c2b1a36d62c1309f89012deafec75c2c99a3bea132e8fe0140885fb55679953f2af7f4e4e1097cc065af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fr \
libreoffice-l10n-fr \
locale-libreoffice-fr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-fr-FR"

inherit rpm
