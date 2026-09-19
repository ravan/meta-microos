SUMMARY = "Enhanced Base System (32bit)"
DESCRIPTION = "The 32bit pattern complementing enhanced_base."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-enhanced_base-32bit-20241218-34.1.aarch64.rpm"
RPM_HASH = "23676828acfae54d7ecdcd51914c56dd4536d01cecc78d40878c1bbbdc3951163bcf592de330224a39f63099429b1b852236883d068e89d089560ef269194d42"

RPROVIDES:${PN} += "pattern- \
patterns-base-enhanced-base-32bit"

RDEPENDS:${PN} += ""

inherit rpm
