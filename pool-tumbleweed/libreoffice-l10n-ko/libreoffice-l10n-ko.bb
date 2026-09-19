SUMMARY = "Korean localization files for LibreOffice"
DESCRIPTION = "Provides Korean translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ko-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "a55dead7154d243d288fa17cff205ffa43709cf4c6cc428d811c47aa1f5702a3fbb26444c71caa6114d922e2f48fdb8855794d888af10865f93dd3765b91f99a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ko \
libreoffice-l10n-ko \
locale-libreoffice-ko"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
