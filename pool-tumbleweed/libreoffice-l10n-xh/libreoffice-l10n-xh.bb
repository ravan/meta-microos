SUMMARY = "Xhosa localization files for LibreOffice"
DESCRIPTION = "Provides Xhosa translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-xh-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "73b57fb7464a58014a17ef39b34e5c5763b31c01c20971ff70fdea326a3de65ee829f599c074ff790ef77e742356af6ccb15eb127075c9f6928a8b44c44f5430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-xh \
libreoffice-l10n-xh \
locale-libreoffice-xh"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
