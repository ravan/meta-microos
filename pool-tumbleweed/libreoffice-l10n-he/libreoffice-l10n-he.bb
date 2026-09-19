SUMMARY = "Hebrew localization files for LibreOffice"
DESCRIPTION = "Provides Hebrew translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-he-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "765afab54e09dfbf7ac481c4058d604332cbd3c4f5a4c73bc23585c85f58f1d3519cbe01b63d88c003ecb34566a6a5c5ab5ab237532c04de6fd5502570e8adba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-he \
libreoffice-l10n-he \
locale-libreoffice-he"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-he-IL"

inherit rpm
