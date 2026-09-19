SUMMARY = "Fish Completion for kumactl"
DESCRIPTION = "Fish command line completion support for kumactl."
LICENSE = "Apache-2.0"

PV = "2.14.3"

RPM_NAME = "kumactl-fish-completion-2.14.3-1.1.noarch.rpm"
RPM_HASH = "bbed607af6a4f564731bd98404f653fceebbd09b025f14efad51e555ad1a32a918dda3ddf691e99e2f26bd4856b7b4730000640577d947809208fdbab57e5bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kumactl-fish-completion"

RDEPENDS:${PN} += "kumactl"

inherit rpm
