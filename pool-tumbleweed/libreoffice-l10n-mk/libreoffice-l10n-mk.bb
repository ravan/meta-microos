SUMMARY = "Macedonian localization files for LibreOffice"
DESCRIPTION = "Provides Macedonian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-mk-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "2f76d8093775330402b86424097f7250bb912c0156c5cc7c2456eee952b82f9472f85b6b35d77ead3a42029c7f592727550e71324fdc9b61f9bb114cb4249961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mk \
libreoffice-l10n-mk \
locale-libreoffice-mk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
