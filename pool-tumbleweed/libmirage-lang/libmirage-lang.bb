SUMMARY = "Translations for libmirage"
DESCRIPTION = "Provides translations for the 'libmirage' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.2"

RPM_NAME = "libmirage-lang-3.3.2-2.1.noarch.rpm"
RPM_HASH = "ea4a6986b82acdd43ab61236707ffdc5555a8fce809ff36b8645214e57aa5fa1bec6c3c9b5e4dc86021e2c123407c45641ee2aa635aace2c2b2f66d4e4628f02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmirage-lang \
libmirage-lang-all \
locale-libmirage-ka \
locale-libmirage-ro \
locale-libmirage-ru \
locale-libmirage-sl"

RDEPENDS:${PN} += ""

inherit rpm
