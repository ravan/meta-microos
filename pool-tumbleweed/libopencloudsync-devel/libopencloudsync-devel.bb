SUMMARY = "Development files for the OpenCloud synchronization library"
DESCRIPTION = "Development files for the OpenCloud synchronization library. It \
implements the OpenCloud sync algorithm that keeps a local directory \
in sync with the content on your cloud."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.0.0"

RPM_NAME = "libopencloudsync-devel-4.0.0-1.1.aarch64.rpm"
RPM_HASH = "184472418b6fe19a32867b8354576fc0917c956504b992ede93dbdf6f5bb1fba9ae0ac3a0d49d7ce81f1874ce41e54eb9363c4580dcf6a6dd7beed505956cdfb"

RPROVIDES:${PN} += "cmake-OpenCloud \
libopencloudsync-devel"

RDEPENDS:${PN} += "libopencloudsync0"

inherit rpm
