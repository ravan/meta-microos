SUMMARY = "Slovenian localization files for LibreOffice"
DESCRIPTION = "Provides Slovenian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-sl-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "2403a0c92521705580223b216e6b96a820fe36c6473741d5f98ee0a217f3951e7908cc6f85776312d9d8541b3d2e866e71d045d2c78f511bbf1a873f92db217d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sl \
libreoffice-l10n-sl \
locale-libreoffice-sl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sl-SI"

inherit rpm
