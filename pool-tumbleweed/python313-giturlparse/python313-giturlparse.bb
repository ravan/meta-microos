SUMMARY = "A Git URL parsing module (supports parsing and rewriting)"
DESCRIPTION = "A Git URL parsing module (supports parsing and rewriting)"
LICENSE = "Apache-2.0"

PV = "0.15.0"

RPM_NAME = "python313-giturlparse-0.15.0-1.2.noarch.rpm"
RPM_HASH = "efe1219fa6f58e1cee894b9b6164bc7d29f962c9ed6dc6b9b6f36ee9fd886fc478590d717c2b2276668282c3088429529540719ee6832564e7bb0afbf84577c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-giturlparse \
python3.13dist-giturlparse \
python313-giturlparse \
python3dist-giturlparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
