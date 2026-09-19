SUMMARY = "Santali localization files for LibreOffice"
DESCRIPTION = "Provides Santali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-sat-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "5122a41bb8d8d8fd6b18ddfdb8ccbc4fb2d951d52911e86507b387d35c59eca46cf16754d7ee5140401e0442938a32956bf1220ff4fe6641a71c2bb439921da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sat \
libreoffice-l10n-sat \
locale-libreoffice-sat"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
