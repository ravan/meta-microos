SUMMARY = "A Git URL parsing module (supports parsing and rewriting)"
DESCRIPTION = "A Git URL parsing module (supports parsing and rewriting)"
LICENSE = "Apache-2.0"

PV = "0.15.0"

RPM_NAME = "python314-giturlparse-0.15.0-1.2.noarch.rpm"
RPM_HASH = "44c9963189bb22f0205456b7bdde01a6ca5f2f5ff7912047d5515eee02abdafe6303990a3a383f2a09b5c33292e9cf0c3138ec89f810190766156d763a968f0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-giturlparse \
python314-giturlparse \
python3dist-giturlparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
