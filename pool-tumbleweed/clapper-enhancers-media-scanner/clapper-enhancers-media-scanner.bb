SUMMARY = "Clapper Enhancer Media Scanner"
DESCRIPTION = "Discovers queued media information"
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "clapper-enhancers-media-scanner-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "4d46af0fba9b93fa1a4754ec70a285dc330cb41c9566dca9132ed9922a82303c5f2959e92bfdd450e85528c3c8e431aa4a3797588ed595ab332c24fc73c809a7"

RPROVIDES:${PN} += "clapper-enhancers-media-scanner \
libclapper-media-scanner.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclapper-0.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpeas-2.so.0"

inherit rpm
