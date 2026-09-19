SUMMARY = "Telugu localization files for LibreOffice"
DESCRIPTION = "Provides Telugu translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-te-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "cd4f1a47c88ca23af28af14e766f74e1758ef949ecb3cb8c74b91f0fda2c219930c3b70134a46805918a555c276c7f408d2fad59eb9c7f24ef3bf7a70a11a7c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-te \
libreoffice-l10n-te \
locale-libreoffice-te"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-te-IN"

inherit rpm
