SUMMARY = "the blessed package to manage your versions by vcs metadata"
DESCRIPTION = "the blessed package to manage your versions by vcs metadata"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python314-vcs-versioning-1.1.1-2.3.noarch.rpm"
RPM_HASH = "be79ed6a89e9239923426e791c89c4be9c14c0012eda19a303ad363ad249f16abe8dcb1efab3200f939a1a267b32cdd169486d6978755abdc6c3b055cc1074c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-vcs-versioning \
python314-vcs-versioning \
python3dist-vcs-versioning"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-packaging"

inherit rpm
