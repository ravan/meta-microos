SUMMARY = "LibreOffice Icon Themes"
DESCRIPTION = "This package provides all of the LibreOffice icon themes."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-icon-themes-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "bb73f2559145fed9575e4a845064d64b61bb90d63771f5fd5fb706ead2738c5912002f8954973c5545080efd17f040c9a02f0e43110c7bac7fc430f4f2f8ee6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-icon-theme-breeze \
libreoffice-icon-theme-galaxy \
libreoffice-icon-theme-hicontrast \
libreoffice-icon-theme-sifr \
libreoffice-icon-theme-tango \
libreoffice-icon-themes"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice-share-linker"

inherit rpm
