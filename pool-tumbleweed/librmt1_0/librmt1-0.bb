SUMMARY = "Remote tape client interface library"
DESCRIPTION = "librmt offers a programmatic C interface for creating an IPC \
channel to the rmt program."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "librmt1_0-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "8d3e07e69c5b5b7036438df42eb19ca80136ddcac9ba068006e2dd559ad145117ae701d7d11bb3fc511c487a3091a3635c0e7cfc5f22f284797ec3f166e78065"

RPROVIDES:${PN} += "librmt.so.1.0 \
librmt1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libschily.so.2.0"

inherit rpm
