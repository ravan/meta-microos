SUMMARY = "Occitan localization files for LibreOffice"
DESCRIPTION = "Provides Occitan translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-oc-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "ee5767ad783f655338d4de32f3372d2d8288614c5a8edd0351aadfb4871077ccc34f96b3329e6c3ed9a619274c69d147e1397769f024777aef895d84a2b8f198"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-oc \
libreoffice-l10n-oc \
locale-libreoffice-oc"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-oc-FR"

inherit rpm
