SUMMARY = "Central_Kurdish localization files for LibreOffice"
DESCRIPTION = "Provides Central_Kurdish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ckb-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "21c68cc938b057404e0b3c5336fe7785767f39df91cd450bce3327372b802701be0b123132af03da9f562ee58b490564603ca44bd435d473413ee397d29397d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ckb \
libreoffice-l10n-ckb \
locale-libreoffice-ckb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
