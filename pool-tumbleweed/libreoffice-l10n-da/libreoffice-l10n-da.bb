SUMMARY = "Danish localization files for LibreOffice"
DESCRIPTION = "Provides Danish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-da-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "a66813a97eea4a5fcaf616108fd64db54722131b1b94875cc4cc27160c4a1a7303386d2c249a4373672c861dcb96bf6e10fe0ca9531490e490dbd23b6e7fbc08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-da \
libreoffice-l10n-da \
locale-libreoffice-da"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-da-DK"

inherit rpm
