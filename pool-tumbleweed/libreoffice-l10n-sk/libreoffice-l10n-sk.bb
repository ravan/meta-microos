SUMMARY = "Slovak localization files for LibreOffice"
DESCRIPTION = "Provides Slovak translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-sk-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "d655ed621d8b95e964581634549a651e37f0df492aba86c0219031555d4e0b8d5e956924fc9df00c4383c93b0d54b7305f732cad8fe011301bed4af2027cc388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sk \
libreoffice-l10n-sk \
locale-libreoffice-sk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sk-SK"

inherit rpm
