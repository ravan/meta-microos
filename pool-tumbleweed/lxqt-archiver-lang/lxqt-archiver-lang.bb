SUMMARY = "Translations for package lxqt-archiver"
DESCRIPTION = "Provides translations for the 'lxqt-archiver' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "lxqt-archiver-lang-1.4.0-1.3.noarch.rpm"
RPM_HASH = "7feb918310ab3c1d229ffbf922fbda77579109ffac7300dbb9c7b653a0e11201dcb9b7fd94a88da8f958ade945c4b25c89964a683434f292aa3a26f6da6aa3c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-archiver-lang \
lxqt-archiver-lang-all"

RDEPENDS:${PN} += "lxqt-archiver"

inherit rpm
