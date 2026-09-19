SUMMARY = "Zsh Completion for udisksctl"
DESCRIPTION = "Zsh command line completion support for the udisksctl command."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.11.2"

RPM_NAME = "udisks2-zsh-completion-2.11.2-1.1.noarch.rpm"
RPM_HASH = "016c1384127941b67f5405374bd85b087939f677f6f491266d7e79369f45dd59ba15ff65a42ac32d8787db4cf25ae61e8c47ea910ecb97ef835d297f75f66ad6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "udisks2-zsh-completion"

RDEPENDS:${PN} += "udisks2 \
zsh"

inherit rpm
