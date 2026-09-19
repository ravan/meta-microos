SUMMARY = "Bokmal localization files for LibreOffice"
DESCRIPTION = "Provides Bokmal translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-nb-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "e27d06c6c9ddc1ff6ec82e7351ac5883edfb98e7345ca77b66b1548681fba97f55ab8f99750fcb29ce59072e9cce4b22d27e031e6f42772424a5346cdf3d6437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nb \
libreoffice-l10n-nb \
locale-libreoffice-nb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-no"

inherit rpm
