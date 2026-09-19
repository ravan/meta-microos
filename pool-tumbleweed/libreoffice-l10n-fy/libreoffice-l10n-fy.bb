SUMMARY = "Frisian localization files for LibreOffice"
DESCRIPTION = "Provides Frisian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-fy-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "5220c5cbb541e4bfc2e800fe822109f817cfaaf709fbee659187bc03ae6532ca5b741a698810766bc89327a1553124377c81f18c8088d4d12496d6db7f40e3dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fy \
libreoffice-l10n-fy \
locale-libreoffice-fy"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
