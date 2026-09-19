SUMMARY = "CUDA plugin for CRIU"
DESCRIPTION = "This package contains the CUDA support plugin for CRIU."
LICENSE = "GPL-2.0-only"

PV = "4.2.1"

RPM_NAME = "criu-plugin-cuda-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "4164d95bbae21f8e0027228f703e3d526067d7ec64387fee7d161d01aa619c8bd88deedd1904c6158b30f78993b064f1128c8224ea017c8283eb29df51fe03fb"

RPROVIDES:${PN} += "criu-plugin-cuda"

RDEPENDS:${PN} += "criu \
libc.so.6"

inherit rpm
