SUMMARY = "Fish Completion for kpt-cli"
DESCRIPTION = "Fish command line completion support for kpt-cli."
LICENSE = "Apache-2.0"

PV = "1.0.0~beta.67"

RPM_NAME = "kpt-cli-fish-completion-1.0.0~beta.67-1.2.noarch.rpm"
RPM_HASH = "6de5620fb73ba79859ba917b8fed1fe5295c93f331c2d7e24e4ac34c852010a00841c375f157d5120f04e64e0c458fd0fd95a9e2004346825c9bb2881e75cc23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpt-cli-fish-completion"

RDEPENDS:${PN} += "kpt-cli"

inherit rpm
