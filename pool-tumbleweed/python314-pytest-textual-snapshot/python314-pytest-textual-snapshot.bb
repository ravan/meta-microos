SUMMARY = "Snapshot testing for Textual apps"
DESCRIPTION = "A pytest plugin for snapshot testing Textual applications. \
 \
A `pytest-textual-snapshot` test saves an SVG screenshot of a running \
Textual app to disk. The next time the test runs, it takes another \
screenshot and compares it to the saved one. If the new screenshot \
differs from the old one, the test fails. This is a convenient way to \
quickly and automatically detect visual regressions in your \
applications."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-pytest-textual-snapshot-1.1.0-1.4.noarch.rpm"
RPM_HASH = "4fa8b9f020addda588da9d9ea46fef6a6ea603114f5a142d20ebda50697c8ebfb8faaa1414a4122c386d2ab636daedc747d65a90ea4f62bd020ebad12b28337b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-textual-snapshot \
python314-pytest-textual-snapshot \
python3dist-pytest-textual-snapshot"

RDEPENDS:${PN} += "python-abi"

inherit rpm
