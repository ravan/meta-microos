SUMMARY = "Lithuanian localization files for LibreOffice"
DESCRIPTION = "Provides Lithuanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-lt-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "11923d19ac82a31dbcb469e83d7750d90b03d0df820962c885807e2ff54695c2ea0949ac07bd6e96ad32065067228f5c540052688d28410cada71fd873728346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lt \
libreoffice-l10n-lt \
locale-libreoffice-lt"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lt-LT"

inherit rpm
