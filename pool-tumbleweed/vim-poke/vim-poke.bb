SUMMARY = "Vim support for poke"
DESCRIPTION = "Provides Vim support for poke."
LICENSE = "GPL-3.0-or-later"

PV = "5.0"

RPM_NAME = "vim-poke-5.0-1.1.noarch.rpm"
RPM_HASH = "f136b593b261911bb49978a20c99b8acc2b5e457bec9793909d3a1a89ac6f51b32a2807a278c06bf22dfe9fcc2c064d8f7dc1987f50044ca11fbd8f1501f4782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-poke"

RDEPENDS:${PN} += "poke \
vim"

inherit rpm
