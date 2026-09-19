SUMMARY = "Luxembourgish localization files for LibreOffice"
DESCRIPTION = "Provides Luxembourgish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-lb-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "bcafe329d40c3cb9b21b97f61477cf2be57731e93a1ff1a5df730756b41fc230e3b3bd0bc812c1b6ba94a03ce7657948941b1a0dc35e3ceba4063b2686519fc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lb \
libreoffice-l10n-lb \
locale-libreoffice-lb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
