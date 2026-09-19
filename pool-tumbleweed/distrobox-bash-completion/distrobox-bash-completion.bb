SUMMARY = "Bash completion for distrobox"
DESCRIPTION = "Bash command line completion support for distrobox."
LICENSE = "GPL-3.0-only"

PV = "1.8.2.5"

RPM_NAME = "distrobox-bash-completion-1.8.2.5-3.2.noarch.rpm"
RPM_HASH = "da8a9d39d8246f5e931040a2e91358b30484811fdbbed73f4b49c62a326859486565e876e43371196755e684be40672ac2e1228668c8de82902dc4a2f7819d6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distrobox-bash-completion"

RDEPENDS:${PN} += "bash-completion \
distrobox"

inherit rpm
