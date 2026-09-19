SUMMARY = "Japanese localization files for LibreOffice"
DESCRIPTION = "Provides Japanese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ja-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "435cf2ab8a65f752be0ca636e0e3aef428b9490af462ce6b5425ce346712d8e5beca73e31814130829a15e8ebd7539ac7ed9d432762ebd7d62d431c4289108ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ja \
libreoffice-l10n-ja \
locale-libreoffice-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
