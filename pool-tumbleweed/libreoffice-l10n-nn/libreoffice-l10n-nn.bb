SUMMARY = "Nynorsk localization files for LibreOffice"
DESCRIPTION = "Provides Nynorsk translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-nn-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "d4aa3571eee70d5ee18c3e53a08bc54e2e61e102080a05861d7569adf269385679a4eede6f647629aff7cb7c3d2164ac25bd8201b201abe2ec34ad5f30524368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nn \
libreoffice-l10n-nn \
locale-libreoffice-nn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-nn-NO"

inherit rpm
