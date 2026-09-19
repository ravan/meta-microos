SUMMARY = "Zsh Completion for fnm"
DESCRIPTION = "Zsh command-line completion support for fnm."
LICENSE = "GPL-3.0-only"

PV = "1.38.1"

RPM_NAME = "fnm-zsh-completion-1.38.1-1.10.noarch.rpm"
RPM_HASH = "cdaf661ebda703187e9877d8afd056b3a5628712241a020a5f07f23c72c1e8acd708bc57aa59fb0a1167fceb4f35e41960cbc33f0b25e004f0b375eaf81bd176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fnm-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
