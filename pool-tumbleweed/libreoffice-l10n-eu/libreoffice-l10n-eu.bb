SUMMARY = "Basque localization files for LibreOffice"
DESCRIPTION = "Provides Basque translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-eu-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "a261cabfdf7ad91aee6056b306a913d6594e09c474e4a4ba832f8df7c03096ac1a03b0171e6e49bc35ea5dab313d762b98a424171fe869569b7e756e53438e59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-eu \
libreoffice-l10n-eu \
locale-libreoffice-eu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
