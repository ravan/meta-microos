SUMMARY = "Zsh Completion for copacetic"
DESCRIPTION = "zsh command line completion support for copacetic."
LICENSE = "Apache-2.0"

PV = "0.14.2"

RPM_NAME = "copacetic-zsh-completion-0.14.2-1.2.noarch.rpm"
RPM_HASH = "acce785495a1452bf33606ac78cd8e2c7e45d48d52264aaadf3e2f7ee4282596444c339c9a3fc8dc8963999ca434739a8fe6a544c44423afb4eaad17bfb9699f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "copacetic-zsh-completion"

RDEPENDS:${PN} += "copacetic"

inherit rpm
