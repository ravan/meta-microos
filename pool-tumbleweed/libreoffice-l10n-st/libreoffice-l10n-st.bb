SUMMARY = "Southern_Sotho localization files for LibreOffice"
DESCRIPTION = "Provides Southern_Sotho translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-st-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "1550f525aa0ad8e0546a1ced8c873f38fe9e89467f3ea6acbc3c1d8f0fc962d65080267aa73dec40ac41b1afce509f1420af1ca9cf0a2d4a0ec243fb3f8d4b6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-st \
libreoffice-l10n-st \
locale-libreoffice-st"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
