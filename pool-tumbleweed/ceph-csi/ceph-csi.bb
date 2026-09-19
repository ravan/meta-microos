SUMMARY = "Container Storage Interface driver for Ceph block and file"
DESCRIPTION = "Ceph CSI plugins implement an interface between CSI enabled Container \
Orchestrator (CO) and Ceph cluster. It allows dynamically provisioning \
Ceph block and file volumes and attaching them to workloads. \
 \
See https://github.com/ceph/ceph-csi for more information."
LICENSE = "Apache-2.0"

PV = "3.3.1+git0.a07260f19"

RPM_NAME = "ceph-csi-3.3.1+git0.a07260f19-1.29.aarch64.rpm"
RPM_HASH = "04dbf77088be7743bb23167fe3db0667c08dbd06ce43ec7ed4eb6de921127fd4a98708597626ecaf8ac102b65cedbcacfc9303c42cd9e0d5e7d07e730d152b7f"

RPROVIDES:${PN} += "ceph-csi"

RDEPENDS:${PN} += "libc.so.6 \
librados.so.2 \
librbd.so.1 \
pattern-"

inherit rpm
