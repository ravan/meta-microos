SUMMARY = "Southern_Ndebele localization files for LibreOffice"
DESCRIPTION = "Provides Southern_Ndebele translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-nr-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "519c17af70f94d9efa9e6e288621d96cde21486a028526bfae730b8ef892d5e3a406d44e3a5ad0e96f90c66853ce309307e65e94e845add60ede7deb10eb13e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nr \
libreoffice-l10n-nr \
locale-libreoffice-nr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
