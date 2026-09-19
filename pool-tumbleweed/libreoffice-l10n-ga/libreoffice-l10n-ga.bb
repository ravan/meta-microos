SUMMARY = "Irish localization files for LibreOffice"
DESCRIPTION = "Provides Irish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ga-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "50b4d8812b5f752cfe45f5469f2d09601eceeda219af82f9b12ee39d45c7c3afa7a0282e42177b77e149faa922e0879f963316f090dd402c63129b69ebd968a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ga \
libreoffice-l10n-ga \
locale-libreoffice-ga"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
