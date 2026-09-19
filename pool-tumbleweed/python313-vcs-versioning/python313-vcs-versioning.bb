SUMMARY = "the blessed package to manage your versions by vcs metadata"
DESCRIPTION = "the blessed package to manage your versions by vcs metadata"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python313-vcs-versioning-1.1.1-2.3.noarch.rpm"
RPM_HASH = "995144ea31a8cbadbef3925469fd57fdf786679497adeb7a125ce1ebbd80eb1b5d5ea4c93332f0e72e11f113cb8987b221c9007e34cebcdfbcaacd9ec87437da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vcs-versioning \
python3.13dist-vcs-versioning \
python313-vcs-versioning \
python3dist-vcs-versioning"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-packaging"

inherit rpm
