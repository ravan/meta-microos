SUMMARY = "Kinyarwanda localization files for LibreOffice"
DESCRIPTION = "Provides Kinyarwanda translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-rw-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "c9b24a69d83ee41cff365fe36674ac3dfab5ac78982e03a742629771c6f38aa8135f290c728b2f27fb8ae1cda8d8547ba37d41cbf0c4c5a5e0f42aca3a2d0447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-rw \
libreoffice-l10n-rw \
locale-libreoffice-rw"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
