SUMMARY = "Monglolian localization files for LibreOffice"
DESCRIPTION = "Provides Monglolian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-mn-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "461d6bd7cb415c357750337ea6693365021f9b8ddbe0f9e91a4ad0a5a4d3c472d12856f805ca63467ca657ac8dec338f066f5e9c6f79c98f5afe1c10e054a971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mn \
libreoffice-l10n-mn \
locale-libreoffice-mn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
