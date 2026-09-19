SUMMARY = "Zsh Completion for rclone"
DESCRIPTION = "Zsh command line completion support for rclone."
LICENSE = "MIT"

PV = "1.75.1"

RPM_NAME = "rclone-zsh-completion-1.75.1-2.1.noarch.rpm"
RPM_HASH = "c7eafe54ae09047cc362c55000792122548aa08f6a0993ebadb4557553bb6785b12855d02a4a0ad6b62e0e47c94eb3b029d45e2fdc8aafe3e21d58f1efb66065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rclone-zsh-completion"

RDEPENDS:${PN} += "rclone"

inherit rpm
