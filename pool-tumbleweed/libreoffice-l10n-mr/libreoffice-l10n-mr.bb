SUMMARY = "Marathi localization files for LibreOffice"
DESCRIPTION = "Provides Marathi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-mr-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "898b6bbf1fb0518020f9f1dec385c9ed16b96dd173efa389dedcf1d569126eb73e0dcd173399bd926675e938f58f2763b26b262ee67f2887214e049bcbb35228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mr \
libreoffice-l10n-mr \
locale-libreoffice-mr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
