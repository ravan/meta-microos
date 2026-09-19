SUMMARY = "Bash Completion for weave-gitops"
DESCRIPTION = "Bash command line completion support for weave-gitops."
LICENSE = "MPL-2.0"

PV = "0.38.0"

RPM_NAME = "weave-gitops-bash-completion-0.38.0-1.16.noarch.rpm"
RPM_HASH = "f7d631e14c242886a50a89136642d2fab799bc79c4896b5d6ba4a588dd63b8450c22f7a0708a5fb506432d6dc98fe44ad7213526e515b0f083157d8dbcc51e8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-gitops-bash-completion"

RDEPENDS:${PN} += "bash-completion \
weave-gitops"

inherit rpm
