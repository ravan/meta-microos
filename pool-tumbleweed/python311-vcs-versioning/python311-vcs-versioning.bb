SUMMARY = "the blessed package to manage your versions by vcs metadata"
DESCRIPTION = "the blessed package to manage your versions by vcs metadata"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-vcs-versioning-1.1.1-2.3.noarch.rpm"
RPM_HASH = "659918e0042cd570892e2f2d332dea2df564504c0f4bb7102998c7cbd7bd6c02233791a79e52ef6dd640ab1a1fda85a379c5cf94facee5b47b6ee889375c5adf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-vcs-versioning \
python311-vcs-versioning \
python3dist-vcs-versioning"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-packaging"

inherit rpm
