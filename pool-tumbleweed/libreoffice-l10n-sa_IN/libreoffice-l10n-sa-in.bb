SUMMARY = "Sanskrit localization files for LibreOffice"
DESCRIPTION = "Provides Sanskrit translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-sa_IN-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "505eb0249e68a6bcb839bdde08d9bffa12b8e80f2a57fe6bfacb4c72668318fa9bd59717078885cfa279aa4ae8d43cffc099812faf6d3b6c0297b39f0007230c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sa-IN \
libreoffice-l10n-sa-IN \
locale-libreoffice-sa-IN"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
