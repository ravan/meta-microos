SUMMARY = "Tamil localization files for LibreOffice"
DESCRIPTION = "Provides Tamil translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ta-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "3130d2e9b0e6d6834560c0cda3ced9be5549eea55c5fa53dbab0bf993998c8f57aa93461f9e1504f8c3162ca218d2da90a6cf962f7114d61a8f9a6bfca62d378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ta \
libreoffice-l10n-ta \
locale-libreoffice-ta"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
