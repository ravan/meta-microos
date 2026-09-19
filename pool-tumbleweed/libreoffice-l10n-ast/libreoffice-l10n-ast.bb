SUMMARY = "Asturian localization files for LibreOffice"
DESCRIPTION = "Provides Asturian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ast-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "f27f7a36457fb5a1eddfb277022fcb1a24deec839980499592f376093fef5bdc5dc49d3dd7d3ed2017be7c97d69a1075916e8e2ce4fbf16c2509dc8263e8f1ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ast \
libreoffice-l10n-ast \
locale-libreoffice-ast"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
