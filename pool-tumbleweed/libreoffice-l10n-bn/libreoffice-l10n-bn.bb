SUMMARY = "Bengali localization files for LibreOffice"
DESCRIPTION = "Provides Bengali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-bn-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "da156615e5abf881ce1b813d1625f7f6fec6afafde06650c4dc66f5e596d2f231f3a833d0af38c2f2388cefb0ae1c818156769fc0c118da7a03281bf8054d916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bn \
libreoffice-l10n-bn \
locale-libreoffice-bn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bn-BD"

inherit rpm
