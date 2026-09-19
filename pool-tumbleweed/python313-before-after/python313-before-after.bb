SUMMARY = "Python utilities for testing race conditions"
DESCRIPTION = "before_after provides utilities for testing race conditions."
LICENSE = "GPL-2.0-only"

PV = "1.0.1"

RPM_NAME = "python313-before-after-1.0.1-4.5.noarch.rpm"
RPM_HASH = "8ac405ac53e0f6166967d99fcd7ce01e06864461fd3e834a342189e76623bcbe58d59bd911536444d474522cde463ff6f06f430b124846c835f3b981da3ffc1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-before-after \
python3.13dist-before-after \
python313-before-after \
python3dist-before-after"

RDEPENDS:${PN} += "python-abi"

inherit rpm
