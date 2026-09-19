SUMMARY = "Khmer localization files for LibreOffice"
DESCRIPTION = "Provides Khmer translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-km-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "dde1dae6def0950545661d001bc2a4743e2877f63010921b5bbf801a62cd3f8128a8e65c441af942017316e44719ed75c0fb7a4296e924efa2f83644cd2ae61f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-km \
libreoffice-l10n-km \
locale-libreoffice-km"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
