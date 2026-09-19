SUMMARY = "Zsh Completion for forgejo-runner"
DESCRIPTION = "zsh command line completion support for forgejo-runner."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.0"

RPM_NAME = "forgejo-runner-zsh-completion-13.1.0-1.1.noarch.rpm"
RPM_HASH = "223b3d08bb4c97a2316c0e5a8989c0119fb367db3a94b5b10febd8935cd7772e29c5fe03f4b77ea05ff62e62687ec118b96d77527ed9fbb08d1c104f9713835c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "forgejo-runner-zsh-completion"

RDEPENDS:${PN} += "forgejo-runner"

inherit rpm
