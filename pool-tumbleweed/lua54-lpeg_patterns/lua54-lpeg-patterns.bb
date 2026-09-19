SUMMARY = "Collection of LPEG patterns"
DESCRIPTION = "A collection of LPEG patterns \
 \
Use cases: \
 * Strict validation of user input \
 * Searching free-form input"
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "lua54-lpeg_patterns-0.5-4.2.noarch.rpm"
RPM_HASH = "6cb3c9cc42cd45942e714db60a0cf2d8ea57b22faec616f6f31e8a3c58010b1e1bb3721c631d1224d2d69b1e1bff37c5403738bbc175a7b286480d4c635ea413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-lpeg-patterns \
lua54-lpeg-patterns"

RDEPENDS:${PN} += "lua54 \
lua54-lpeg"

inherit rpm
