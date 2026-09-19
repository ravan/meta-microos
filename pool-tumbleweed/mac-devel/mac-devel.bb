SUMMARY = "Development files for APE"
DESCRIPTION = "Development files for Monkey's Audio codec and decompressor."
LICENSE = "BSD-3-Clause"

PV = "10.26"

RPM_NAME = "mac-devel-10.26-1.11.aarch64.rpm"
RPM_HASH = "9d24ab18fd2353d48fd2bbd851869ddc794813708a55d6118b5c179e24f917a440a1bab5218585446642a5d4623926f1289ef33b44314f3fb2dfa905673824d9"

RPROVIDES:${PN} += "mac-devel"

RDEPENDS:${PN} += "mac"

inherit rpm
