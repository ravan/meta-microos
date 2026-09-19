SUMMARY = "Uyghur localization files for LibreOffice"
DESCRIPTION = "Provides Uyghur translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ug-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "323abe77df119a84d26f23ed81eb7cc013320874d78d77165628d73e1e28596c98068f8793d2c8714ef33efa8c1d04b0a0ac94ee7892f4d9a80ef47948f913ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ug \
libreoffice-l10n-ug \
locale-libreoffice-ug"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
