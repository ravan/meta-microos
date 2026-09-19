SUMMARY = "Lower_Sorbian localization files for LibreOffice"
DESCRIPTION = "Provides Lower_Sorbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-dsb-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "2a0f0d9807faef3e79f147761995fdf9b4f7854310489545dddbf2e1b1252e22606f32cd07f0d40f4109ff4df7d81c38be431d07dd0844190a427000e20fb37c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dsb \
libreoffice-l10n-dsb \
locale-libreoffice-dsb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
