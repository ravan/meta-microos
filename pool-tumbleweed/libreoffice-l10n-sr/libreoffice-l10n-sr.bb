SUMMARY = "Serbian localization files for LibreOffice"
DESCRIPTION = "Provides Serbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-sr-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "e4f9afd94cd11c3d9cbf2cf9f88fc70e777d9f0580a7bc9eef5e13832f0bb9197341cc54774ce7bd8e20cf7564c1b8da2d145200a6cb2f13484986956207311b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sr \
libreoffice-l10n-sr \
locale-libreoffice-sr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sr"

inherit rpm
