SUMMARY = "Manipuri localization files for LibreOffice"
DESCRIPTION = "Provides Manipuri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-mni-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "23ba79aff10f5752ccd04ccd45fb44955361ff0d7b81d6567ff653533df07916d90ac2f8d1db3908c915b868d631fa323987f996a6a97bdaad31d987b00f06cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mni \
libreoffice-l10n-mni \
locale-libreoffice-mni"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
