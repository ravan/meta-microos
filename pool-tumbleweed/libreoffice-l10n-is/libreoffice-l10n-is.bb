SUMMARY = "Icelandic localization files for LibreOffice"
DESCRIPTION = "Provides Icelandic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-is-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "a5fa28112aebc434719a251fc78e17794eaf92a4a2b44110edaf4f8f88898385c7d5afcc58b481e4567a887006d2e39e0ac7172ece99a3fd213eb666a59e06ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-is \
libreoffice-l10n-is \
locale-libreoffice-is"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-is"

inherit rpm
