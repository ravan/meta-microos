SUMMARY = "Async-friendly dependency injection for Python"
DESCRIPTION = "A small, async-friendly dependency-injection helper for Python: declare \
function parameters as dependencies and have them resolved automatically."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python314-uncalled-for-0.4.0-1.1.noarch.rpm"
RPM_HASH = "563d6b02684712c0459d2d1563704ae24d15e85aa7e86b10b8458da0fe66e524a8317eda25a8eb44ab1733f60b90ca1e2dcfb7b3f209879dbef6922ad8d90f50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-uncalled-for \
python314-uncalled-for \
python3dist-uncalled-for"

RDEPENDS:${PN} += "python-abi"

inherit rpm
