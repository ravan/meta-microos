SUMMARY = "Bengali_India localization files for LibreOffice"
DESCRIPTION = "Provides Bengali_India translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-bn_IN-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "2cb341e5e0537efdc6f3f5c5c1da8a95ef5e252bc66eca83b72ed26a262e7cca869a53e7516cd0cc153af1200b70ac3742d2ae21f4f6edc0e5893ee7cf59fa30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bn-IN \
libreoffice-l10n-bn-IN \
locale-libreoffice-bn-IN"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bn-IN"

inherit rpm
