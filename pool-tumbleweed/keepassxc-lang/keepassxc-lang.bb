SUMMARY = "Translations for package keepassxc"
DESCRIPTION = "Provides translations for the 'keepassxc' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.7.12"

RPM_NAME = "keepassxc-lang-2.7.12-1.7.noarch.rpm"
RPM_HASH = "2803fc3460c40de61e3ca0bcfe546b924e8907470ed95de096e6d804f27cccbc92f691e971eb88363e66f008dea8129bd27c5fa3dfe1f74ff7ab30700a455907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keepassxc-lang \
keepassxc-lang-all"

RDEPENDS:${PN} += "keepassxc"

inherit rpm
