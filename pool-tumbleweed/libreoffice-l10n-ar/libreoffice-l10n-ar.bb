SUMMARY = "Arabic localization files for LibreOffice"
DESCRIPTION = "Provides Arabic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ar-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "edefc0ed2a65cb841d4546c207d198fcb99ec2042c6cc38baa9eb3da42f2f07152100241feea85cff70e6a4af27e475147b2ecbacad7096658ecb98ba9cb7173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ar \
libreoffice-l10n-ar \
locale-libreoffice-ar"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ar"

inherit rpm
