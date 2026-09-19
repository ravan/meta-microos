SUMMARY = "Albanian localization files for LibreOffice"
DESCRIPTION = "Provides Albanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-sq-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "87dcc2ff3688211cc091f720fdb94303e4a6b8ca7e093aad0862abeeabee1243f7c38405590f1b45b28934e79988cf752a38b95acbad05b9d86d9774002c3f0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sq \
libreoffice-l10n-sq \
locale-libreoffice-sq"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sq-AL"

inherit rpm
