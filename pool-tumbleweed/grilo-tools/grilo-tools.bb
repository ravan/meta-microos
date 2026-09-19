SUMMARY = "Framework for browsing and searching media content -- Tools"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides tools related to Grilo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.19"

RPM_NAME = "grilo-tools-0.3.19-2.5.aarch64.rpm"
RPM_HASH = "b0c2ed5e52b5de181976c2c2eb350c8268cd2dfbe85c44d9cf3ee38e5965279dd9b9fc7b37cf9c75b89b3208322c366e0eb9aacdb13c2bf904956ba2561b8f2b"

RPROVIDES:${PN} += "grilo-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgrilo-0.3.so.0"

inherit rpm
