SUMMARY = "Farsi localization files for LibreOffice"
DESCRIPTION = "Provides Farsi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-fa-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "4d5b9c8a40242ce3f338a0bbd17b4ae4b32c04c21ef48edd231f9bfdebe3270b3a0e3285eeabd5a4e7218fb974257a4183a364de911d962fd67dbb0146a53370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fa \
libreoffice-l10n-fa \
locale-libreoffice-fa"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
