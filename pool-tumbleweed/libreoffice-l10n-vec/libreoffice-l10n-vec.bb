SUMMARY = "Venetian localization files for LibreOffice"
DESCRIPTION = "Provides Venetian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-vec-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "bdcc0a5f86ae3c00f8c66e564f4b301dac0c8661bfd02c82a73db353376dd27a486caf66409ef3ac4f8b66a81e11ffbe6f6128ecd9d3206f250f92f29600bd57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-vec \
libreoffice-l10n-vec \
locale-libreoffice-vec"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
