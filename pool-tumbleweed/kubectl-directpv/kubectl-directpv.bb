SUMMARY = "Kubectl plugin for the MinIO CSI driver for Direct Attached Storage"
DESCRIPTION = "DirectPV is a CSI driver for Direct Attached Storage. In a simpler sense, it is \
a distributed persistent volume manager, and not a storage system like SAN or \
NAS. It is useful to discover, format, mount, schedule and monitor drives \
across servers. \
 \
This package contains the Kubectl plugin to manage the DirectPV CSI driver."
LICENSE = "Apache-2.0"

PV = "4.1.6"

RPM_NAME = "kubectl-directpv-4.1.6-1.5.aarch64.rpm"
RPM_HASH = "bf6d714b42ae5f2538675df3209319db49f3d6df116bdcc0d95bc12831b2a7dfd6c6e8d4b199beaf5abd4cf4411dafddbe45bb6f0a58e4f1151affb9199d23fc"

RPROVIDES:${PN} += "kubectl-directpv"

RDEPENDS:${PN} += ""

inherit rpm
