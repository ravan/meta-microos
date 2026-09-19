SUMMARY = "SCSI command function library"
DESCRIPTION = "A library to create and parse SCSI commands (at the byte level)."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "libscgcmd1_0-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "9253e84f9106e2bbe8f8c59490aeec9b84fd198d989afd3f48b2ed91f94144ff76ff946d79f5f9e5b69d594387d107bc0943da19e63e27706cf0317c1e25e6ec"

RPROVIDES:${PN} += "libscgcmd.so.1.0 \
libscgcmd1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libscg.so.1.0 \
libschily.so.2.0"

inherit rpm
