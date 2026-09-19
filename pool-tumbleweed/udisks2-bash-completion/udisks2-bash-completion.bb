SUMMARY = "Bash Completion for udisksctl"
DESCRIPTION = "Bash command line completion support for the udisksctl command."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.11.2"

RPM_NAME = "udisks2-bash-completion-2.11.2-1.1.noarch.rpm"
RPM_HASH = "247a6559f6b5b589fc7bf8a50a1460456823ecc07c4ef8ed84ecc64a6b5349c72b655f3b624e1a1dc5b1a92c31c505e00f4965033c404b3940ccda7ff7d0fb82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "udisks2-bash-completion"

RDEPENDS:${PN} += "bash-completion \
udisks2"

inherit rpm
