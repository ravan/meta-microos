SUMMARY = "Collection of LPEG patterns"
DESCRIPTION = "A collection of LPEG patterns \
 \
Use cases: \
 * Strict validation of user input \
 * Searching free-form input"
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "lua55-lpeg_patterns-0.5-4.2.noarch.rpm"
RPM_HASH = "de3d6addcc34f63ed4a7088851c0f92a27a11f55d746384f0a510313721690b0daa467f1f95d44a3ed1e2f52634fa57aac748f108ea91c05cb383d1c14881f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-lpeg-patterns"

RDEPENDS:${PN} += "lua55 \
lua55-lpeg"

inherit rpm
