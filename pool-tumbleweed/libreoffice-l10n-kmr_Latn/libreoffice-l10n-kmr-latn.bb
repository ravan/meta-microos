SUMMARY = "Kurdish localization files for LibreOffice"
DESCRIPTION = "Provides Kurdish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-kmr_Latn-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "9df610a17475b83a16da62a0182843f8c3ac7721e9450aa79272d272beb4a8393f6476c4f0d14d7e7a80d34f7103c3dd8014ddb36c8e26ac656501b553964e9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kmr-Latn \
libreoffice-l10n-kmr-Latn \
locale-libreoffice-kmr-Latn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-kmr-Latn"

inherit rpm
