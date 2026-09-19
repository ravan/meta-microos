SUMMARY = "Tools for testing processes"
DESCRIPTION = "Testcase classes and assertions for testing processes."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python314-process-tests-3.0.0-2.5.noarch.rpm"
RPM_HASH = "a1c3b6a057b0a3afbd956c880c5dee7edb6d27bcebf0466d649f5c6703f78ca6fc7cf34dd8c7ae0bdfda1beaf31308db999eaa055050120fc666ed14a386705a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-process-tests \
python314-process-tests \
python3dist-process-tests"

RDEPENDS:${PN} += "python-abi"

inherit rpm
