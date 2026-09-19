SUMMARY = "ZSH completion for rainbow"
DESCRIPTION = "Zsh command line completion support for rainbow."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "rainbow-zsh-completion-2.8.0-1.13.noarch.rpm"
RPM_HASH = "a2555052f4132610e0d082fef9a75550d13045422ae7a911da0c0c12ca0d01a181abb92d6b7769d19bcb18e215f45c3a346cc466582cc477b6b711a1cbdcfb9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-rainbow-zsh-completion \
rainbow-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
