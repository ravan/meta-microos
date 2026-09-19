SUMMARY = "Latvian localization files for LibreOffice"
DESCRIPTION = "Provides Latvian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-lv-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "706df160bcfe7e81768a88b72a7638dfea17f4bd17ca4e6066345adc03e714aab125cb886daa0f41b688a240002317da10a0f8a9bb71f581061934f5e9923aa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lv \
libreoffice-l10n-lv \
locale-libreoffice-lv"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lv-LV"

inherit rpm
