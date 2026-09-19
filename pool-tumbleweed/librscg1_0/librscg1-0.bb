SUMMARY = "Remote SCSI user level command transport routines"
DESCRIPTION = "A library containing additional routines on top of scg for dealing with \
remote SCSI command transports."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "librscg1_0-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "26c68c776b5f2b62e501121bb73766ddf014e88d381f796d74cd9c1c7904a921b0a22ae3cfbb98fc0f43f02f6e8835e7e43df426b4bb177250870e843c370aa2"

RPROVIDES:${PN} += "librscg.so.1.0 \
librscg1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libscg.so.1.0 \
libschily.so.2.0"

inherit rpm
