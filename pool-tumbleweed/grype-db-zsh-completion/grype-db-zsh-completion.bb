SUMMARY = "Zsh Completion for grype-db"
DESCRIPTION = "zsh command line completion support for grype-db."
LICENSE = "Apache-2.0"

PV = "0.54.3"

RPM_NAME = "grype-db-zsh-completion-0.54.3-1.1.noarch.rpm"
RPM_HASH = "6b64523bc9d839e96e507b771b7c2acb59e47f121233b7fe85c5be00487b0bfd7e64f91634c6c7bfff5f6446a06bd35dbcc2d0ce0466864df848680208edcdfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grype-db-zsh-completion"

RDEPENDS:${PN} += "grype-db"

inherit rpm
