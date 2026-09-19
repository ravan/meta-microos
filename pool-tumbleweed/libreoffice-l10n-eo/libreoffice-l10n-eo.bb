SUMMARY = "Esperanto localization files for LibreOffice"
DESCRIPTION = "Provides Esperanto translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-eo-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "c0ebbaa31414c0113f694966c09aabe05a1aa942594567abf143bd641c8ecbbc5f7d31b3977fdc8d8e80183810e62630539a3bfbac8579133676c0322bc77c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-eo \
libreoffice-l10n-eo \
locale-libreoffice-eo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
