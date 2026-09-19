SUMMARY = "ZSH Completion for libsixel"
DESCRIPTION = "ZSH command line completion support for libsixel."
LICENSE = "MIT"

PV = "1.10.5"

RPM_NAME = "libsixel-zsh-completion-1.10.5-2.7.noarch.rpm"
RPM_HASH = "db6f5dc784686ca2e682c1783ceeb56319f4c3da736df4ec5b6f63494d74a661d8f95e8fe317a9fa1200a0502f94767a233f6169adda29aa255fec5b1e7db7b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsixel-zsh-completion"

RDEPENDS:${PN} += "libsixel-utils"

inherit rpm
