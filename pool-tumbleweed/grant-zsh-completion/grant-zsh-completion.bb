SUMMARY = "Zsh Completion for grant"
DESCRIPTION = "zsh command line completion support for grant."
LICENSE = "Apache-2.0"

PV = "0.6.8"

RPM_NAME = "grant-zsh-completion-0.6.8-1.2.noarch.rpm"
RPM_HASH = "b1f5ffce03d4a0258430d802ea36a634cca27a720e6ea7f0df2a945320055ce60c564461121ab556ef1b2096ebd541d11e2854ce2752af371a43a81dc83c0e78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grant-zsh-completion"

RDEPENDS:${PN} += "grant"

inherit rpm
