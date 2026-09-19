SUMMARY = "Bash tab-completion scripts for guestfs-tools"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for the virt-* tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.56.0"

RPM_NAME = "guestfs-tools-bash-completion-1.56.0-1.2.noarch.rpm"
RPM_HASH = "fd9cfcaf8f4ab6cf830392621fe15761b69276bd007d44bdd8f4898db49d7cc14fd082054b2270266cba6da2a9c4c8c0cebc9924ea18e31bfa5e364c1cdc76ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guestfs-tools-bash-completion"

RDEPENDS:${PN} += "bash-completion \
guestfs-tools"

inherit rpm
