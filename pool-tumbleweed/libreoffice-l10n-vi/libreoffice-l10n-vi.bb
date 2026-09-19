SUMMARY = "Vietnamese localization files for LibreOffice"
DESCRIPTION = "Provides Vietnamese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-vi-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "d09528c61a86ac625e2ea6947d8b95fd4295d1ef5088373eefbbbb38b9d243e55493fd0faf233976b83754e3331bc6119eee24fc5be107aecbc79127af85a5b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-vi \
libreoffice-l10n-vi \
locale-libreoffice-vi"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-vi"

inherit rpm
