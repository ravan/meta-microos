SUMMARY = "Home directory fixtures"
DESCRIPTION = "Home directory fixtures"
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python314-pytest-home-0.6.0-1.4.noarch.rpm"
RPM_HASH = "e758aea77f93c09b87eb0df4821fef2a0be9af6b6fbf3735097e4085409e0e229a19dbcc4da7162bc78c489bc093e24c5f0d0a1092eea0a0472d69f0c4803e1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-home \
python314-pytest-home \
python3dist-pytest-home"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
