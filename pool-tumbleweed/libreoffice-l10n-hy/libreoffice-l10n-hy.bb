SUMMARY = "Armenian localization files for LibreOffice"
DESCRIPTION = "Provides Armenian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-hy-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "3eacb00bb671df4ae11b3b1a642f06edd255c70bd1fdc1b154801438a46ae302f1ff25fcb128f082a975392b43610f8586998e8047b4f123c2600073bb26af7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hy \
libreoffice-l10n-hy \
locale-libreoffice-hy"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
