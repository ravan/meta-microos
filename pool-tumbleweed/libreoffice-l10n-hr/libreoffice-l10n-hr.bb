SUMMARY = "Croatian localization files for LibreOffice"
DESCRIPTION = "Provides Croatian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-hr-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "b88c51c5b299058788eac3b86e49e3bed0b7f1287e5e761fcac686f92a255378b9fed68a4281f887d08e3423a0801648030fde5928f8780c6d1fd326eddb2c93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hr \
libreoffice-l10n-hr \
locale-libreoffice-hr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hr-HR"

inherit rpm
