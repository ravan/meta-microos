SUMMARY = "Bulgarian localization files for LibreOffice"
DESCRIPTION = "Provides Bulgarian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-bg-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "c5b2edb091fc03a7644cf84eedb60bf70b33565e79c6c9dbc6497549049c4d9b588095b1e54fd1e32b411298a8ab68ebc06eed2832fe58824b047e60a48920c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bg \
libreoffice-l10n-bg \
locale-libreoffice-bg"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bg-BG"

inherit rpm
