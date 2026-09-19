SUMMARY = "Turkish localization files for LibreOffice"
DESCRIPTION = "Provides Turkish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-tr-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "96fa21eed0553dd29498f47e717b205972ad2d6a82dd11f268169c5d52fc6b9a8935d12e0ac1512c8923de9ab91752d18cf16f0df9b6e19d7fdc796256bd26bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tr \
libreoffice-l10n-tr \
locale-libreoffice-tr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-tr-TR"

inherit rpm
