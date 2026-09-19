SUMMARY = "Valencian localization files for LibreOffice"
DESCRIPTION = "Provides Valencian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-ca_valencia-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "e24edda08dde1b40e5971df5a6b194bc8837d6723551b4f9e6cb14b1ed0ca78e94c5bd82cfb5052c66dae4383762f485e5706b9a0136a3c190629a13246eebd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ca-valencia \
libreoffice-l10n-ca-valencia \
locale-libreoffice-ca-valencia"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ca-ES-valencia"

inherit rpm
