SUMMARY = "Collection of LPEG patterns"
DESCRIPTION = "A collection of LPEG patterns \
 \
Use cases: \
 * Strict validation of user input \
 * Searching free-form input"
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "lua53-lpeg_patterns-0.5-4.2.noarch.rpm"
RPM_HASH = "68251d609f751493ec41cd3a845e3f75f97e79891bcfed6caceb5eda62a4c1a72a5d3f6b737ea8fd18a6ac6dcf3c0d95948421e8461fa1760fd5cc4bab63508b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-lpeg-patterns"

RDEPENDS:${PN} += "lua53 \
lua53-lpeg"

inherit rpm
