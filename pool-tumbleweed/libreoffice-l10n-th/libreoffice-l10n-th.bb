SUMMARY = "Thai localization files for LibreOffice"
DESCRIPTION = "Provides Thai translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-th-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "052b8c5263ea70382190435c048db324579b40a86da0e580bfce5e16c97b2c15f99e574e63cd77bd3349f9b043972f48ccdbcdb4847d3bf2dd6264cb770bd0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-th \
libreoffice-l10n-th \
locale-libreoffice-th"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-th-TH"

inherit rpm
