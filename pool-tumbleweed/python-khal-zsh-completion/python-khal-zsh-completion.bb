SUMMARY = "ZSH completion for khal"
DESCRIPTION = "zsh shell completions for khal"
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python-khal-zsh-completion-0.14.1-1.1.noarch.rpm"
RPM_HASH = "61d66d5a987301e81b9274f3195b841e1e0b8ff8fa6d2515971edaea3fccbb7826359a0c1b14eff3f69350206e133581d63cb8b5319f691dcc6276ab2ec3ad5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-khal-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
