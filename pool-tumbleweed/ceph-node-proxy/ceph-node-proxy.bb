SUMMARY = "HW monitoring agent for Ceph"
DESCRIPTION = "This package provides a Ceph hardware monitoring agent."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-node-proxy-18.2.7-8.1.noarch.rpm"
RPM_HASH = "27dca5d21360527c4cc7ebdaa3c9b0b08bad6649f01cb3a354f4080177997aefaa888fb4a774b348a25dc2c14fafe4ec1354665c5f2462d1f5ee33e95379f1ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-node-proxy \
python3.13dist-ceph-node-proxy \
python3dist-ceph-node-proxy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi"

inherit rpm
