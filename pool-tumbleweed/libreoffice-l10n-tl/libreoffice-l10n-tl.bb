SUMMARY = "Tagalog localization files for LibreOffice"
DESCRIPTION = "Provides Tagalog translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-tl-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "3a8318809c87a82cf4b07208da7468ba4a22785902b5a22ba96c93050a29384eecb3a62de70c0dc564873bca0b57bdfaff68a72367fae6b2d7b36b1fcb12c556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tl \
libreoffice-l10n-tl \
locale-libreoffice-tl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
