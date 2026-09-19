SUMMARY = "Shell Art"
DESCRIPTION = "Because figlet ASCII is not as cool."
LICENSE = "BSD-3-Clause"

PV = "0.5+3"

RPM_NAME = "tdfiglet-0.5+3-2.9.aarch64.rpm"
RPM_HASH = "dd54c47ba2def9b16928bb5bbc5cdf0026153a7aefde9f08ed827612bef3b9621e4c6f3b92008be14b0360dfc8ed1fcff4c254abf034d840dd40142e7fb0f2a1"

RPROVIDES:${PN} += "tdfiglet"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
