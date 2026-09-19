SUMMARY = "Documentation files for libmaa"
DESCRIPTION = "This RPM contains the documentation files for libmaa."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "libmaa-doc-1.5.1-2.1.noarch.rpm"
RPM_HASH = "d12d0b21f8f156f3956645d11024f349fec163d4f7db417c7c62d50f4306c87b7e62a77b3275602142ba716d21bedc5a40a4f0608d8c23387ef13d998c5c0901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmaa-doc"

RDEPENDS:${PN} += ""

inherit rpm
