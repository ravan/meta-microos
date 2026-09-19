SUMMARY = "Base64 Encoding/Decoding Routines"
DESCRIPTION = "libb64 is a library of ANSI C routines for fast encoding/decoding data into and \
from a base64-encoded format. C++ wrappers are included, as well as the source \
code for standalone encoding and decoding executables."
LICENSE = "SUSE-Public-Domain"

PV = "2.0.0.1"

RPM_NAME = "libb64-2.0.0.1-1.3.aarch64.rpm"
RPM_HASH = "367460c94afd9dc59231e4cc9483cdbc6e82a4147c4c427d8af9c1756457ccf7ee297ea5f7938aa045467971968ab38b19f3769900b8ea645cb90e45dbee218c"

RPROVIDES:${PN} += "libb64"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
