SUMMARY = "Translations for package lxqt-sudo"
DESCRIPTION = "Provides translations for the 'lxqt-sudo' package."
LICENSE = "LGPL-2.1-only"

PV = "2.4.0"

RPM_NAME = "lxqt-sudo-lang-2.4.0-1.2.noarch.rpm"
RPM_HASH = "802e98baca267429cea63dc70fefe10956da66b20e2a87fb9d89b7adc4fcb3861cf3cbf6367370ef86e6ea1c26d774ca2571456e2a0329073547cb75a86e5b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-sudo-lang \
lxqt-sudo-lang-all"

RDEPENDS:${PN} += "lxqt-sudo"

inherit rpm
