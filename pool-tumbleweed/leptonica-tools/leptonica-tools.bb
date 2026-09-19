SUMMARY = "Leptonica tools"
DESCRIPTION = "Programs for manipulating images."
LICENSE = "BSD-2-Clause"

PV = "1.87.0"

RPM_NAME = "leptonica-tools-1.87.0-1.5.aarch64.rpm"
RPM_HASH = "961f54fdbf196742a7dba676244f2adac16e44b56d37a27f585314c8f702c5aa36da49dcb3b89cb8c6445583cfb892accb218f7577cef95de3eb4ef199e0ca60"

RPROVIDES:${PN} += "leptonica-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libleptonica.so.6"

inherit rpm
