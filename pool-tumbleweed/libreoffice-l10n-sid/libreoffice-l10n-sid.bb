SUMMARY = "Sidamo localization files for LibreOffice"
DESCRIPTION = "Provides Sidamo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-sid-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "55416023918b8f75302fa3be895a1625797d2284eebc833fcc677f15daf220f34113a6f2b67185773d6fcd482a1802e3a833eb883ad39abd15a76813de3e9afd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sid \
libreoffice-l10n-sid \
locale-libreoffice-sid"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
