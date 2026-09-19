SUMMARY = "Automated testing of examples in documentation"
DESCRIPTION = "python-sybil provides a way to test examples in one's documentation by parsing \
them from the documentation source and evaluating the parsed examples as part \
of the normal test run. Integration is provided for the main Python test runners."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python314-sybil-10.1.0-2.1.noarch.rpm"
RPM_HASH = "e1b76758c1734d908953a16c2bee7c1e9d14730f8f6102af7d62dda63794d3af264c9cb59aeca764af55233465e3166bd4ce4024491ef6182045a9c0133bca5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sybil \
python314-sybil \
python3dist-sybil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
