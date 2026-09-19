SUMMARY = "Indonesian localization files for LibreOffice"
DESCRIPTION = "Provides Indonesian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-id-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "de38e2c598c0d93edeb2044fdfb5dc6a3d0fe8fe8a614b136449c8771a770b84edb6c79b3fe905e6129e1d0ae27ae30afc95882819fa1d60abf496664aa2ebdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-id \
libreoffice-l10n-id \
locale-libreoffice-id"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-id"

inherit rpm
