SUMMARY = "Automated testing of examples in documentation"
DESCRIPTION = "python-sybil provides a way to test examples in one's documentation by parsing \
them from the documentation source and evaluating the parsed examples as part \
of the normal test run. Integration is provided for the main Python test runners."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python313-sybil-10.1.0-2.1.noarch.rpm"
RPM_HASH = "4533fddf92c2cfab63ea7de964fb2cf8e8921a7397f2858204f72ddad7372412d85813b74bc98e293767af4bc0d236fe308a481d4211f0af5ce974f0f322681e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sybil \
python3.13dist-sybil \
python313-sybil \
python3dist-sybil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
