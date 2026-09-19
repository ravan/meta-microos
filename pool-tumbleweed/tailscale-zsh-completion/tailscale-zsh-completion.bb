SUMMARY = "Tailsacle zsh completion"
DESCRIPTION = "zsh completion for tailscale"
LICENSE = "BSD-3-Clause"

PV = "1.102.3"

RPM_NAME = "tailscale-zsh-completion-1.102.3-1.1.noarch.rpm"
RPM_HASH = "957db43edc894538de4e3fdb51f37c8331cfa58693bc2965cdbbbb351fb81bc924631c04045702c8713607af9bd45527c062b0aeaf76480e2f64a3539b40578d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tailscale-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
