SUMMARY = "Swahili localization files for LibreOffice"
DESCRIPTION = "Provides Swahili translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-sw_TZ-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "3abf9c91060926d79ad1a3e28a8154c3aa144b38040caeac07673f07c81c092666badfd163c535d33fa28ee94b112ff9ea6e2e8dac6ed493319b7fafcb4dd773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sw-TZ \
libreoffice-l10n-sw-TZ \
locale-libreoffice-sw-TZ"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sw-TZ"

inherit rpm
