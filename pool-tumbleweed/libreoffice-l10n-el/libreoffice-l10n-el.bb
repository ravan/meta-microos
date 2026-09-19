SUMMARY = "Greek localization files for LibreOffice"
DESCRIPTION = "Provides Greek translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-el-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "34a79fa170c21ae848036ad654227ed63f58b10cec0dec8390b94e778901b56273f4f8e8a8dd93bd4fff38318047fa2cf56caf0b883f973a2226a57b181949c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-el \
libreoffice-l10n-el \
locale-libreoffice-el"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-el-GR"

inherit rpm
