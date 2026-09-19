SUMMARY = "Bash Completion for lazyworktree"
DESCRIPTION = "Bash command line completion support for lazyworktree."
LICENSE = "Apache-2.0"

PV = "1.49.0"

RPM_NAME = "lazyworktree-bash-completion-1.49.0-1.2.noarch.rpm"
RPM_HASH = "d4eeaec05fdb71e6626fff9a2993ca7a9f1125e828d5aad407bb1031307aa856471792f773785cea45d2a6a91b113b2fbefb830a28d416f484d35e173f372e75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lazyworktree-bash-completion"

RDEPENDS:${PN} += "bash-completion \
lazyworktree"

inherit rpm
