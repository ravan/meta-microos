SUMMARY = "Fish Completion for kubeswitch"
DESCRIPTION = "Fish command line completion support for kubeswitch."
LICENSE = "Apache-2.0"

PV = "0.9.3"

RPM_NAME = "kubeswitch-fish-completion-0.9.3-1.10.noarch.rpm"
RPM_HASH = "22f5bda01d3de53ae159b9c77f2271a1fed50df9da6cf606fe02a29800144cf981b357c1b891ab12c55fb4904573d018c95686830b0fd944be278441e5ac8562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeswitch-fish-completion"

RDEPENDS:${PN} += "kubeswitch"

inherit rpm
