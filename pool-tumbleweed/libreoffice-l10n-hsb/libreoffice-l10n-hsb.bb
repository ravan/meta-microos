SUMMARY = "Upper_Sorbian localization files for LibreOffice"
DESCRIPTION = "Provides Upper_Sorbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-hsb-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "5ac6eed80ac635e0b881c2c2b76de6dd4238ebbd790f5db2aaa9cf1efc3f2b009420820389c58e948c2ea2bc6d4dfef592383477d2b13fbdf3c8d0c3bfad8574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hsb \
libreoffice-l10n-hsb \
locale-libreoffice-hsb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
