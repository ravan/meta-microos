SUMMARY = "Burnese localization files for LibreOffice"
DESCRIPTION = "Provides Burnese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-my-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "002e6c4442bd28d9abc21287f4d04bfb14a46e443f1dd7ac1115d509209767ea96410a12745ab2743ba96aacfc36432cbbc8cb429238be4ee101b1a350167eb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-my \
libreoffice-l10n-my \
locale-libreoffice-my"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
