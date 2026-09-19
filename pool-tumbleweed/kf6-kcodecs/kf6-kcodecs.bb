SUMMARY = "Method collection to manipulate strings using various encodings"
DESCRIPTION = "KCodecs provides a collection of methods to manipulate strings using various \
encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcodecs-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "e063f8767a6c7a9e2d461361397aed0cf54ff2ddfd7080e62034cd390560e07da9fdb5950a2583409cb8587a957375cedb6300f2ec852bccef2a2a2e44f1c715"

RPROVIDES:${PN} += "kf6-kcodecs"

RDEPENDS:${PN} += ""

inherit rpm
