SUMMARY = "Bash Completion for netbird"
DESCRIPTION = "Bash command line completion support for netbird-management."
LICENSE = "AGPL-3.0-only & BSD-3-Clause"

PV = "0.78.1"

RPM_NAME = "netbird-management-bash-completion-0.78.1-1.1.noarch.rpm"
RPM_HASH = "27b75819612022471ccc6687f69fa53aa092a9bf47fd5e10a7180b54a02e35d737322cf6af3773786d42375f56630abfac0e4a9e43d8d7fd8355dae8c687cadc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbird-management-bash-completion"

RDEPENDS:${PN} += "bash-completion \
netbird-management"

inherit rpm
