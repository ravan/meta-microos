SUMMARY = "Bash Completion for ingress2gateway"
DESCRIPTION = "Bash command line completion support for ingress2gateway."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "ingress2gateway-bash-completion-1.2.0-1.2.noarch.rpm"
RPM_HASH = "4bc235c0c790b7ff1876a199145b4f6b81b8d62c6f551b6cf24f859029de6cfb1a970d63e1faff56cb401829d9490e7ee4f5a744b8e01b600d6242ab175c1b60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ingress2gateway-bash-completion"

RDEPENDS:${PN} += "bash-completion \
ingress2gateway"

inherit rpm
