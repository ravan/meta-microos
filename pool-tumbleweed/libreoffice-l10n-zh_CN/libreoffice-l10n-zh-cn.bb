SUMMARY = "Simplified_Chinese localization files for LibreOffice"
DESCRIPTION = "Provides Simplified_Chinese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-zh_CN-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "5adde08fad885879ad9484d734305e9df56648d7fc8ab8ea7e12271da8f35f8a9151bfe0de9a5d7ad6aa3e104f67e3a2d81789b1a24cdf315c75a841bd98780a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zh-CN \
libreoffice-help-zh-Hans \
libreoffice-l10n-zh-CN \
libreoffice-l10n-zh-Hans \
locale-libreoffice-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
