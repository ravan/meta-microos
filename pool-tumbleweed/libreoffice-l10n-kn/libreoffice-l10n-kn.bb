SUMMARY = "Kannada localization files for LibreOffice"
DESCRIPTION = "Provides Kannada translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-kn-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "a9633caea8fc321fba62914df4970414ff688dc33a12b811d68c86130ec12f8321db568d8170f1d8ab707c35c058d550152580a4ea5b55c5a4aca7c591237abe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kn \
libreoffice-l10n-kn \
locale-libreoffice-kn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
