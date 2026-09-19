SUMMARY = "Zsh Completion for pluto"
DESCRIPTION = "Zsh command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.24.3"

RPM_NAME = "pluto-zsh-completion-5.24.3-1.1.noarch.rpm"
RPM_HASH = "7d24d03aa44e1de35967e18dff38734ebc54f78d0370a51d989d4db2f78f0184bd0216d5563d0224a170a66e92df7103253bb28220a8bff8f7bb02a79ec40ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-zsh-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
