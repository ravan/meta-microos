SUMMARY = "Kashmiri localization files for LibreOffice"
DESCRIPTION = "Provides Kashmiri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ks-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "b9459338c491a8f933c63cca73455c36c4bb5f1cd0c34ee8f2562c1d365afc37d2b342bc703702eeccd641400536c24e57a23e14d08acd99ef6f9f3b0d03a20c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ks \
libreoffice-l10n-ks \
locale-libreoffice-ks"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
