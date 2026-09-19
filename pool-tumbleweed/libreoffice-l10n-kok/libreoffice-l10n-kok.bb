SUMMARY = "Konkani localization files for LibreOffice"
DESCRIPTION = "Provides Konkani translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-kok-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "d203d265082dc4d6a8473163333d841915fe6fffc819a8a193331ac82fd96bf89c602eebb46be72364cf3d927efd2f642a9de00d6f67246cd2d1c4548d7f5847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kok \
libreoffice-l10n-kok \
locale-libreoffice-kok"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
