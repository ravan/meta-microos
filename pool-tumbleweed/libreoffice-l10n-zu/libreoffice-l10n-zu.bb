SUMMARY = "Zulu localization files for LibreOffice"
DESCRIPTION = "Provides Zulu translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-zu-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "fbdef6775e097f9d3c0d75919325806e6284866e5fcca1987521d25695aeed97df53bdbab34e0cf8a4953e9d0eb9fd975357807f1243c6fcef8b91c82114a1fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zu \
libreoffice-l10n-zu \
locale-libreoffice-zu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-zu-ZA"

inherit rpm
