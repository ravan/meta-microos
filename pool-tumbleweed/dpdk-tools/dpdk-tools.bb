SUMMARY = "Tools for setting up Data Plane Development Kit environment"
DESCRIPTION = "This package contains tools for setting up Data Plane Development Kit environment"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "25.11.3"

RPM_NAME = "dpdk-tools-25.11.3-1.1.noarch.rpm"
RPM_HASH = "46cfe8708fa391a91d9733d24b721453097e604681c4a021827ddf3b6506a67129577f456d8213e7ca14734aba3cc257ff8556e079ce037d6fd0dcad2bb55b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-thunderx-tools \
dpdk-tools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
dpdk \
findutils \
iproute \
kmod \
pciutils \
which"

inherit rpm
