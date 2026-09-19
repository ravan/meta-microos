SUMMARY = "Ukrainian localization files for LibreOffice"
DESCRIPTION = "Provides Ukrainian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-uk-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "bf1ce9fcf6808e7952aa779a075766e90cfb8a7152abd629fbd6e35fc67c39ef04047377ec9b250b7de5dc0a8f16d2a6e2fa596ad73f024881257b3578d40c1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-uk \
libreoffice-l10n-uk \
locale-libreoffice-uk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-uk-UA"

inherit rpm
