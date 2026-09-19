SUMMARY = "Sinhalese localization files for LibreOffice"
DESCRIPTION = "Provides Sinhalese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-si-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "e739925e08c6623e63e47b135b1823462a2fccd780359c04eab9370da2182bb711b99b69342e86ec8a6693a611e81411b57c6522c89f4da03870cf5551e7ea84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-si \
libreoffice-l10n-si \
locale-libreoffice-si"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-si-LK"

inherit rpm
