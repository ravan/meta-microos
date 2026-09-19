SUMMARY = "the blessed package to manage your versions by vcs metadata"
DESCRIPTION = "the blessed package to manage your versions by vcs metadata"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python312-vcs-versioning-1.1.1-2.3.noarch.rpm"
RPM_HASH = "4911a0dfbfaf187a39f4d68dbc41540739d41e10ed39c03bdc3df77e8e6095c1877381cda9c160e866c8f2a078a6164ebc235b836705f0acd9f4b9e605b6ffed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-vcs-versioning \
python312-vcs-versioning \
python3dist-vcs-versioning"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
alts \
python-abi \
python312-packaging"

inherit rpm
