SUMMARY = "Hindi localization files for LibreOffice"
DESCRIPTION = "Provides Hindi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-hi-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "a3d7e2a115092e40d8005da0ec986ba42953d8e23f8df6086c6f8bbd8fec43b7048e6894b022786e7b67310c57d274fdc50b735173fbd4631dd9b07e4a7d5fc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hi \
libreoffice-help-hi-IN \
libreoffice-l10n-hi \
libreoffice-l10n-hi-IN \
locale-libreoffice-hi"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hi-IN"

inherit rpm
