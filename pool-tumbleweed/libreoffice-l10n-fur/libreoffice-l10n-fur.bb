SUMMARY = "Friulian localization files for LibreOffice"
DESCRIPTION = "Provides Friulian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-fur-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "56487c7bf0ed9d6d0109d16da1840655ae527bbbeae9f42cacb548796b6c7acf333d16c8f0e6d942aa1603e330df8a65554343924a34ab49e7d99c007e04f8dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fur \
libreoffice-l10n-fur \
locale-libreoffice-fur"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
