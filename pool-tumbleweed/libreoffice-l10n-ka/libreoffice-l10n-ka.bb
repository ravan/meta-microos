SUMMARY = "Georgian localization files for LibreOffice"
DESCRIPTION = "Provides Georgian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ka-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "7b2cd8295b89227d941f03fd699e5f32a8cdb3d311ade9041fad6b103cc6b24ba8c0b770bf3fe16e96866f63bf1a617006f92ab5a8f1dc45137711a7614d9aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ka \
libreoffice-l10n-ka \
locale-libreoffice-ka"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
