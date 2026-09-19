SUMMARY = "Base System (32bit)"
DESCRIPTION = "The 32bit pattern complementing base."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-base-32bit-20241218-34.1.aarch64.rpm"
RPM_HASH = "a4b550eeab2b88c585e12ea291f6afbd6c8e9d8302e66ce5ca71117bc4bc8c1e91450645a85bc808cd41fab7f2ab3e71d6f45bc7aa1ec67c8dfc54cfa4242daa"

RPROVIDES:${PN} += "pattern- \
patterns-base-base-32bit"

RDEPENDS:${PN} += ""

inherit rpm
