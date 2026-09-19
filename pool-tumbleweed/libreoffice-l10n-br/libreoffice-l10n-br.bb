SUMMARY = "Breton localization files for LibreOffice"
DESCRIPTION = "Provides Breton translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-br-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "a91991e9091017ea2bd42860e000de7baee298c35155f8db459486dde1071b71645481a3ca4438a30b9415dfa48f0b9923dfef331ce44e5ebe65b359f9fd62e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-br \
libreoffice-l10n-br \
locale-libreoffice-br"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-br-FR"

inherit rpm
