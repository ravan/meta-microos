SUMMARY = "Bash tab-completion scripts for libguestfs tools"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for guestfish, guestmount and various virt-* tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "libguestfs-bash-completion-1.60.1-1.1.noarch.rpm"
RPM_HASH = "25390827bd70ee3a173f67d2e03eece454c23f9693215b57937684c1149dafc859dce789342b43f381cdf47cbd123ee1976bc8468dc065235c898261e0d246bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
