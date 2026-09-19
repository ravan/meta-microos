SUMMARY = "Belarusian localization files for LibreOffice"
DESCRIPTION = "Provides Belarusian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-be-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "28a8b1764c126ddd508634eae6a41703a5a5453aa09fd6c01ec362f31aa56788db6f409cc6c2893957fd038be86d9c571546a43b63fcb2a7298c8de72a30f2da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-be \
libreoffice-l10n-be \
locale-libreoffice-be"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-be-BY"

inherit rpm
