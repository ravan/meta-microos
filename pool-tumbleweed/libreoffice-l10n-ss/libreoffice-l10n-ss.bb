SUMMARY = "Swati localization files for LibreOffice"
DESCRIPTION = "Provides Swati translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ss-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "a3375238f33a6ab9676232a98767abb98a6c9537e169e1bec39e7642e7f74f3b97abe7a1a68e7187f523b50709c9f0b0cbb1bc3b6220ae30f652ed284096ffea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ss \
libreoffice-l10n-ss \
locale-libreoffice-ss"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
