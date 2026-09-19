SUMMARY = "Integration tests for AutoYaST2"
DESCRIPTION = "Profiles and test scripts for AutoYaST2 integration tests. \
For internal testing purposes only! Not useful on a real system!"
LICENSE = "GPL-3.0-only"

PV = "1.2.40"

RPM_NAME = "aytests-tests-1.2.40-1.19.noarch.rpm"
RPM_HASH = "8f47e03f7d8d5455c0119731dd641d3cd8603c567cf282b0c234e79c4ffbb2187bfaab4c8e45ca04e8c8f94480e6df4248524c8345837ecd66129ee4c5f943fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aytests-tests"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
