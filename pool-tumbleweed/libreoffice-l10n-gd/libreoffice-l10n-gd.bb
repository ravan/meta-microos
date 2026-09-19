SUMMARY = "Gaelic localization files for LibreOffice"
DESCRIPTION = "Provides Gaelic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-gd-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "e58a12a5e484f2db97af4562defc509f42e4392a2a43c017dec053e07a986c648d7d21536233097c7f999fb87b75d114144d909a2862c0055120372abef5ea1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gd \
libreoffice-l10n-gd \
locale-libreoffice-gd"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gd-GB"

inherit rpm
