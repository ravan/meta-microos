SUMMARY = "ZSH completion for flameshot"
DESCRIPTION = "zsh shell completions for flameshot."
LICENSE = "GPL-3.0-only"

PV = "14.0.0"

RPM_NAME = "flameshot-zsh-completion-14.0.0-1.2.noarch.rpm"
RPM_HASH = "ed2382ce1fbcbcac16f58b5481c7a63ef22cb3348b2d4be710b513f3a097c6a0778ab56eb5b970b966a73d39ab6ed2a2ff2b82baf0d6b42a2a7de257e989d434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flameshot-zsh-completion"

RDEPENDS:${PN} += "flameshot"

inherit rpm
