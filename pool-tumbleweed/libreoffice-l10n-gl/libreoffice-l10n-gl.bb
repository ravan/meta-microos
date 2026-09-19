SUMMARY = "Galician localization files for LibreOffice"
DESCRIPTION = "Provides Galician translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-gl-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "598d6eb515e28ad6d2573bc01b81c754f88719417dae8cd38d9c92422e62dca016496adff88a5e94e27737e5db56a25682c5f6ece7efd0418ae5fbc75a2ff05b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gl \
libreoffice-l10n-gl \
locale-libreoffice-gl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gl"

inherit rpm
