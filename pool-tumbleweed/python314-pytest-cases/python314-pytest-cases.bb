SUMMARY = "Separate test code from test cases in pytest"
DESCRIPTION = "Separate test code from test cases in pytest."
LICENSE = "BSD-3-Clause"

PV = "3.10.1"

RPM_NAME = "python314-pytest-cases-3.10.1-1.3.noarch.rpm"
RPM_HASH = "7246ee46284f4f6321db0d03f7916a68d2bc1c05cacb81a447ed377b8e7253f26d6c517469aa719b83be946e2bc162d8fdc8f6b8e1aa2ddb542743cbd5dffa70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-cases \
python314-pytest-cases \
python3dist-pytest-cases"

RDEPENDS:${PN} += "python-abi \
python314-decopatch \
python314-makefun \
python314-packaging"

inherit rpm
