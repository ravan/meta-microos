SUMMARY = "Catalan localization files for LibreOffice"
DESCRIPTION = "Provides Catalan translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ca-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "afb846b03d9d836853c65dbf14961ad5a7e56308ea95712fc1918cd97b15bf19347b30e4196de00d3f2dad47de9cf7495125bfb0efbc73c7851dfe25fa84461f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ca \
libreoffice-l10n-ca \
locale-libreoffice-ca"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ca"

inherit rpm
