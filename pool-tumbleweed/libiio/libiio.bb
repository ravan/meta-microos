SUMMARY = "Industrial I/O tools"
DESCRIPTION = "Library for industrial I/O."
LICENSE = "LGPL-2.1-or-later"

PV = "0.26"

RPM_NAME = "libiio-0.26-1.10.aarch64.rpm"
RPM_HASH = "2254c3688ecbade68324d85cca4da7f74e8a2d649f257a2f1e7f1c1944731029a236e7f5cba80abab4b0f33dc94d4281b223f140fbb538d7b7f02f6a0ede825b"

RPROVIDES:${PN} += "libiio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiio.so.0 \
systemd"

inherit rpm
