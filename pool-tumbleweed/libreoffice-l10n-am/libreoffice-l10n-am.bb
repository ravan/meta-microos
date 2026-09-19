SUMMARY = "Amharic localization files for LibreOffice"
DESCRIPTION = "Provides Amharic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-am-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "e5103c1b42f8758e2f470c865b449f5b82481ffea1d8d65135b09d520c3c2d18ba8b8cd6e276968b19341bc9609d9a3d5a753cac780b5247d3d33da375d1cf0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-am \
libreoffice-l10n-am \
locale-libreoffice-am"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
