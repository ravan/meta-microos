SUMMARY = "Fish Completion for kubearmor-client"
DESCRIPTION = "Fish command line completion support for kubearmor-client."
LICENSE = "Apache-2.0"

PV = "1.4.9"

RPM_NAME = "kubearmor-client-fish-completion-1.4.9-1.2.noarch.rpm"
RPM_HASH = "44926c625c847e74d6a4cfc55a657ffca9a00a6c8268616ac8ce7bbf7cc68006adafd6576bd25968587761dea8863ba068d3926f2d1d80e80389df2ddcadae58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubearmor-client-fish-completion"

RDEPENDS:${PN} += "kubearmor-client"

inherit rpm
