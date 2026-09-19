SUMMARY = "Prusa Block & Binary G-code reader / writer / converter"
DESCRIPTION = "A new G-code file format -- Core Library \
 \
Contains the basic definitions and functionality which allow to read a G-code file in binary format"
LICENSE = "AGPL-3.0-only"

PV = "0.2.0+git20240829.b5c57c4"

RPM_NAME = "libbgcode_core0_2_0-0.2.0+git20240829.b5c57c4-2.4.aarch64.rpm"
RPM_HASH = "2b07e5cd4d3d82852565a861893edc6f61116f777700e70a3795e22f670a4a16a1c8ab4b7db9140b24bf523944e762df3edb1a3f9256f43286b345d9a64390a2"

RPROVIDES:${PN} += "libbgcode-core.so.0.2.0 \
libbgcode-core0-2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
