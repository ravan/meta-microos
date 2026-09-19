SUMMARY = "Collection of LPEG patterns"
DESCRIPTION = "A collection of LPEG patterns \
 \
Use cases: \
 * Strict validation of user input \
 * Searching free-form input"
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "luajit-lpeg_patterns-0.5-4.2.noarch.rpm"
RPM_HASH = "f315872c4bf18ff6587e0bd985d37e451d030e7ed86525f48192f9d37ca9aaadd7bc960c54573e375b4c23ae97656b5c0c73ed15d0852639b05ea8ce58998a7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-lpeg-patterns"

RDEPENDS:${PN} += "luajit \
luajit-lpeg"

inherit rpm
