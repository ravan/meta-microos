SUMMARY = "Minimal Appliance Base (32bit)"
DESCRIPTION = "The 32bit pattern complementing minimal_base."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-minimal_base-32bit-20241218-34.1.aarch64.rpm"
RPM_HASH = "711b2100a33d6c1076e47fd30956c4388bd602b3130b420471de037048a10099e8f9f17d7857e6dafe12bb7304ed3788a7c005a6348e307686d2d4c319edb522"

RPROVIDES:${PN} += "pattern- \
patterns-base-minimal-base-32bit"

RDEPENDS:${PN} += ""

inherit rpm
