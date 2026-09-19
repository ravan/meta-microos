SUMMARY = "Gujarati localization files for LibreOffice"
DESCRIPTION = "Provides Gujarati translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-gu-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "8d7020a97ca0512148c2456f2bacf5a5e99240444c540f357de3f2f3cd44f070e0fe36517433ce5ccfe1f46d8a91b49ab4697c39470fa08671eaad3795bbaedc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gu \
libreoffice-help-gu-IN \
libreoffice-l10n-gu \
libreoffice-l10n-gu-IN \
locale-libreoffice-gu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gu-IN"

inherit rpm
