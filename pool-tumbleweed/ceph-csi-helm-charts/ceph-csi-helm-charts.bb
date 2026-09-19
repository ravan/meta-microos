SUMMARY = "Ceph CSI helm charts"
DESCRIPTION = "Helm charts for CephFS and RBD access through ceph-csi."
LICENSE = "Apache-2.0"

PV = "3.3.1+git0.a07260f19"

RPM_NAME = "ceph-csi-helm-charts-3.3.1+git0.a07260f19-1.29.noarch.rpm"
RPM_HASH = "73dfebb287b210e693173aceb17277b0fbe8566e226d0584f2822f11bc59ef4b35653c822bdce0824af4c63a5751ba10639a89a27b3df649d8f82127d88745ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-csi-helm-charts"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
