SUMMARY = "Dogri localization files for LibreOffice"
DESCRIPTION = "Provides Dogri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-dgo-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "8540df1a14628052fc645b36be2a1a8e0d7cee5812f505c6097d55d5df28f2860c097bb557d68ecf2fead0b36a2f8723dfef611e6cbc51fbdb7ffeb0f4784141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dgo \
libreoffice-l10n-dgo \
locale-libreoffice-dgo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
