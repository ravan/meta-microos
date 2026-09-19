SUMMARY = "Traditional_Chinese localization files for LibreOffice"
DESCRIPTION = "Provides Traditional_Chinese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-zh_TW-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "2bc296b48e753690142db6eb6a53fcc279c2fd7993d4ea968c0286822e7bae6530da541e919fe8631fe1cfc708c7a6eee60117739b196eafe12cf4176d054ac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zh-Hant \
libreoffice-help-zh-TW \
libreoffice-l10n-zh-Hant \
libreoffice-l10n-zh-TW \
locale-libreoffice-zh-TW"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
