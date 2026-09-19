SUMMARY = "Polish localization files for LibreOffice"
DESCRIPTION = "Provides Polish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-pl-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "dd6ff41f4dfb2f18efabb362c36a982d0e46a0188797e6e72f9065b60c584439e8333baf716042f3483e1d923ccfa57fab17f472637f6143b8041c72d0cb3cab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pl \
libreoffice-l10n-pl \
locale-libreoffice-pl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pl-PL"

inherit rpm
