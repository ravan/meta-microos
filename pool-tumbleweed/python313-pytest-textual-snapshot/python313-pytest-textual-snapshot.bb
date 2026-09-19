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

RPM_NAME = "python313-pytest-textual-snapshot-1.1.0-1.4.noarch.rpm"
RPM_HASH = "8a89ac2ba3c52692e08748181cfbeb25266f7110459d7dd6e3b479098b8dc902d5d02772d9b0432e7f83a769671950691166e281d433b7ffd244004cba55f4ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-textual-snapshot \
python3.13dist-pytest-textual-snapshot \
python313-pytest-textual-snapshot \
python3dist-pytest-textual-snapshot"

RDEPENDS:${PN} += "python-abi"

inherit rpm
