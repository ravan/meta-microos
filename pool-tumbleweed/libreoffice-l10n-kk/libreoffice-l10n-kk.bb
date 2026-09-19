SUMMARY = "Kazakh localization files for LibreOffice"
DESCRIPTION = "Provides Kazakh translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-kk-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "0169abb875c915669d74b238b8dfc63f8b365378a0904834309fb9eb3bd745c69987920dad77fb71e687f6314bdcd26c3cbfe4e52cb02e62fd87076416b0ed66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kk \
libreoffice-l10n-kk \
locale-libreoffice-kk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
