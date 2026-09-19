SUMMARY = "Mesa VA-API implementation"
DESCRIPTION = "This package contains the Mesa VA-API implementation provided through gallium."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-libva-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "7a1c7d3ae40c5453d0556f5df7abac049a2d53afe4df502158a16d9b4b428509ff8034d725e5fa9e575ff5fd34c3d57b67e5f15eee384d0590c36f43b4d003a0"

RPROVIDES:${PN} += "Mesa-libva"

RDEPENDS:${PN} += ""

inherit rpm
