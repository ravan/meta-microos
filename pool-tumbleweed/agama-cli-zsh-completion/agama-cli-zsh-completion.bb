SUMMARY = "Zsh Completion for agama-cli"
DESCRIPTION = "Zsh command-line completion support for agama-cli."
LICENSE = "GPL-2.0-or-later"

PV = "24+0.a836cced5"

RPM_NAME = "agama-cli-zsh-completion-24+0.a836cced5-54.1.noarch.rpm"
RPM_HASH = "d311717a4f809042df371327045ff69594e0d8bbf418b61ba3480d47bc744de7cf1f2789a433e5a87520823bcd77ab390e739bd6f406169d5abb12a2d733153f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "agama-cli-zsh-completion"

RDEPENDS:${PN} += "agama-cli \
zsh"

inherit rpm
