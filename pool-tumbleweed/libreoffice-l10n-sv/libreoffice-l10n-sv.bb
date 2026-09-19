SUMMARY = "Swedish localization files for LibreOffice"
DESCRIPTION = "Provides Swedish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-sv-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "bd00f0c8b27c10b11e6d26f0a06a39fd84d284e1a11cf2bfa02041d75313065bf090a86107eff916daf60927cffaa5a7da9e91e9f823d74fa9b07c3abac6b3ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sv \
libreoffice-l10n-sv \
locale-libreoffice-sv"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sv-SE"

inherit rpm
