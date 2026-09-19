SUMMARY = "Odia localization files for LibreOffice"
DESCRIPTION = "Provides Odia translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-or-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "f07f384ecdebef2c7c03bc0c6d86a699b4488968574ea6c224e90c494a6adaac5c243e601be687780243622e0d762963064b3695ed789d73d8fbdcf634a60f81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-or \
libreoffice-l10n-or \
locale-libreoffice-or"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
