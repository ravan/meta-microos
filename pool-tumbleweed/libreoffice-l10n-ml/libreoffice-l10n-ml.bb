SUMMARY = "Malayalam localization files for LibreOffice"
DESCRIPTION = "Provides Malayalam translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ml-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "5e2402a31a9cf10676c8323f0bbef841a754b97bb6d4e8af7f2b4c26104aabec17f475858b602a66d2a9156667f594d419930f85dd9084e24774c1fc8bef2805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ml \
libreoffice-l10n-ml \
locale-libreoffice-ml"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
