SUMMARY = "Package provides recommended R-foreign"
DESCRIPTION = "This packages provides R-foreign, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.8.91"

RPM_NAME = "R-foreign-0.8.91-58.3.aarch64.rpm"
RPM_HASH = "7400bcaa44df7dd6b29333894144ab76a73375a3a193b295e19f73fada29cd966e7b4d29c732427e95bc3cfdd2dab5557cefda4df8177fa2b394dd0064300285"

RPROVIDES:${PN} += "R-foreign"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
