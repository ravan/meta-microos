SUMMARY = "Development files for the Neko virtual machine"
DESCRIPTION = "Development files and headers for the Neko virtual machine."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "neko-devel-2.4.1-3.3.aarch64.rpm"
RPM_HASH = "86e56d03210758756b9a87469f19615b550f518fab0e76fc7b449971b40e9aa7759ae4dca2f6ffe798db4b4fc6e6744bb2bc0b07d34dd843b26be65cbdbaebc7"

RPROVIDES:${PN} += "cmake-Neko \
neko-devel \
nekovm-devel"

RDEPENDS:${PN} += "libneko2"

inherit rpm
