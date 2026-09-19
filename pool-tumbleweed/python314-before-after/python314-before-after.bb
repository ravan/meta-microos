SUMMARY = "Python utilities for testing race conditions"
DESCRIPTION = "before_after provides utilities for testing race conditions."
LICENSE = "GPL-2.0-only"

PV = "1.0.1"

RPM_NAME = "python314-before-after-1.0.1-4.5.noarch.rpm"
RPM_HASH = "4717768d49d2bb064f73bf94c00648954db0327e5d170d9378bcf4ac1a5593d4587996a85a1fca8e04ea71fd2396097aaa8817b4be83920546ad15ee6d2e1c8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-before-after \
python314-before-after \
python3dist-before-after"

RDEPENDS:${PN} += "python-abi"

inherit rpm
