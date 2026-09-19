SUMMARY = "Zsh Completion for jujutsu"
DESCRIPTION = "zsh command line completion support for jujutsu."
LICENSE = "MIT"

PV = "0.44.0"

RPM_NAME = "jujutsu-zsh-completion-0.44.0-1.2.noarch.rpm"
RPM_HASH = "d3815c10f353c65ed7bd9cb2f6d9f0473bc6b805e682d1dfc91e4103b3082348fea13aa43db3c346e18a94a0eeb2c4b52490b9c26480959a35b64bec390fd86c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jujutsu-zsh-completion"

RDEPENDS:${PN} += "jujutsu"

inherit rpm
