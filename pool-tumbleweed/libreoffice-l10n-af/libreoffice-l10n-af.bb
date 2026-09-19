SUMMARY = "Afrikaans localization files for LibreOffice"
DESCRIPTION = "Provides Afrikaans translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-af-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "93d6997cb748d2777e5994e893225f670ae687c12384af7e0b54d5feb9729d3cbd0e7f75e992c77e6f8f6a5d13afe8d24e0c8d0a87c91ff3157ee6d84cd5153c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-af \
libreoffice-l10n-af \
locale-libreoffice-af"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-af-ZA"

inherit rpm
