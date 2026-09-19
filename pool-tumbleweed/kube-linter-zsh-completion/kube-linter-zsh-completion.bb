SUMMARY = "Zsh Completion for kube-linter"
DESCRIPTION = "zsh command line completion support for kube-linter."
LICENSE = "Apache-2.0"

PV = "0.8.3"

RPM_NAME = "kube-linter-zsh-completion-0.8.3-1.5.noarch.rpm"
RPM_HASH = "a64c157c2301d2b09c2bf2447359b7781cba692627bb1bf138dd9b00433f82cb8a588b7d33f6c5dde599af872fd28bbaa98667fc941c669b0c190f2c90af68c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kube-linter-zsh-completion"

RDEPENDS:${PN} += "kube-linter"

inherit rpm
