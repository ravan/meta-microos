SUMMARY = "Development files for libscg, a SCSI transport library"
DESCRIPTION = "libscg is a SCSI transport library, providing an abstraction layer \
from operating systems' mechanisms to issue SCSI commands. \
 \
This subpackage contains the header files for developing applications \
that want to make use of libscg."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "libscg-devel-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "4a8a7100772aadbb6a6171991dfa83a60a003a072e494c128e12638744b1c0d314e7211e5b4d9b840248036302f3cfb9382ac021ea12d94bcaeef9fa6f188a91"

RPROVIDES:${PN} += "libscg-devel"

RDEPENDS:${PN} += "librscg1-0 \
libscg1-0 \
libscgcmd1-0 \
libschily-devel"

inherit rpm
