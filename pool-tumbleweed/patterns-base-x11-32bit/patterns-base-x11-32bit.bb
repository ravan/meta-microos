SUMMARY = "X Window System (32bit)"
DESCRIPTION = "The 32bit pattern complementing x11."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-x11-32bit-20241218-34.1.aarch64.rpm"
RPM_HASH = "3ea45064c60062e2eb0cd07a43dc305d329a0d3e3495dcae87cd66cef1e154e4164e91c0001067e3b6bb7f55a1885f70105214bdfc4dd32b550da9e0698a0edc"

RPROVIDES:${PN} += "pattern- \
patterns-base-x11-32bit"

RDEPENDS:${PN} += ""

inherit rpm
