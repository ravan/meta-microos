SUMMARY = "Files for Developing with libtee"
DESCRIPTION = "This component provides the TEE Client API as defined by the GlobalPlatform \
TEE standard. For a general overview of OP-TEE, please see the Notice.md file. \
 \
This package contains the libvisio development files."
LICENSE = "BSD-2-Clause"

PV = "4.6.0"

RPM_NAME = "optee-client-devel-4.6.0-1.6.aarch64.rpm"
RPM_HASH = "bf434eebfaa9bdc116a15476084e695991c0d6d2247a04937dfffbd10a3ae79ee0ff8bafa114f7ed3240ad2f943676dab512431d0bee3e867b1c10bf99c23aed"

RPROVIDES:${PN} += "optee-client-devel \
pkgconfig-teeacl \
pkgconfig-teec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libckteec0 \
libseteec0 \
libteeacl0 \
libteec2 \
pkgconfig-uuid"

inherit rpm
