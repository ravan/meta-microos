SUMMARY = "Library to access CSE/CSME/GSC firmware via a MEI interface"
DESCRIPTION = "ME TEE Library is a C library to access CSE/CSME/GSC [Converged \
Security (and Management) Engine, Graphic System Controller] firmware \
via a MEI interface. The MEI TEE API simplifies connection and \
communication with the MEI device and firmware status registers \
retrieval."
LICENSE = "Apache-2.0"

PV = "6.0.2"

RPM_NAME = "libmetee6_0_2_0-6.0.2-1.5.aarch64.rpm"
RPM_HASH = "da087454ed96889af0783779fdc78e1c17c90e4a2d52ad3c05fd5251278aac4e4312d2a42fb349491e8da98991d1ada32d83ecbe6992195a666088caf8060dc3"

RPROVIDES:${PN} += "libmetee.so.6.0.2.0 \
libmetee6-0-2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
