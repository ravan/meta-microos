SUMMARY = "Estonian localization files for LibreOffice"
DESCRIPTION = "Provides Estonian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-et-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "f8b4221e28369ead6e587d946c6a566ed2a717e3fc9d082ba2e84a90205e6fcd6aafbafad71ccca0639265fba3f4db5de3e157f54760e4e5944a8a313111ca64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-et \
libreoffice-l10n-et \
locale-libreoffice-et"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-et-EE"

inherit rpm
