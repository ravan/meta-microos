SUMMARY = "Tibetian localization files for LibreOffice"
DESCRIPTION = "Provides Tibetian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-bo-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "885a98428568b99073637c2011751ea0b305f747e1fcd7d268d7034ce408514551518f47d6404b68735faf547881156ccb00235acad88fcbe7ef7552224675ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bo \
libreoffice-l10n-bo \
locale-libreoffice-bo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bo"

inherit rpm
