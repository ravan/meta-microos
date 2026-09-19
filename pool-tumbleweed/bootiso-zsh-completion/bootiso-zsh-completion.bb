SUMMARY = "ZSH Completion for bootiso"
DESCRIPTION = "ZSH command line completion support for bootiso."
LICENSE = "GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "bootiso-zsh-completion-4.2.0-3.10.noarch.rpm"
RPM_HASH = "2dbfec6a12edd9e96ba0356c0ecae7b50ab8257c06fe94558692a41b63593979ce3ac82f2a23b94f7795dd881147f80f48f8df6c0c7bf199077fec93881af943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bootiso-zsh-completion"

RDEPENDS:${PN} += "bootiso"

inherit rpm
