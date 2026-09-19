SUMMARY = "Zsh Completion for restic"
DESCRIPTION = "Zsh command line completion support for restic."
LICENSE = "BSD-2-Clause"

PV = "0.19.1"

RPM_NAME = "restic-zsh-completion-0.19.1-1.2.noarch.rpm"
RPM_HASH = "d7ea0b54caeed84e752c8b1d0337bf4a93ca61639efb35b3f6ddbd8e749b79604cb6c62a7132c0f50fff6c9b2f6fa07f460e72c583246bed0e493d5df9168800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-restic-zsh-completion \
restic-zsh-completion"

RDEPENDS:${PN} += "restic"

inherit rpm
