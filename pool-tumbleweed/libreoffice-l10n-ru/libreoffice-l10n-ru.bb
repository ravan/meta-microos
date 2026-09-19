SUMMARY = "Russian localization files for LibreOffice"
DESCRIPTION = "Provides Russian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ru-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "766925586b55c5d2111d4c9bd5407274b27eb891eba63866f151f3b0980788690b0e1291a1b8cf25b0aaa76a03d27424e51e54ba2506daf527d05688eff79ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ru \
libreoffice-l10n-ru \
locale-libreoffice-ru"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ru-RU"

inherit rpm
