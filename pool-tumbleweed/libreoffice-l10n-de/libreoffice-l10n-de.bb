SUMMARY = "German localization files for LibreOffice"
DESCRIPTION = "Provides German translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-de-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "705028158cd81acd3dbae434bb08177e472a860f1ada7015792eb93154e6fcfaea8240ecb9d5ebed11ced5fb3fcaaf9ade52e38eb5bcd3ed26a08ec430ecec0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-de \
libreoffice-l10n-de \
locale-libreoffice-de"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-de"

inherit rpm
