SUMMARY = "Facilities for working with VCS repositories"
DESCRIPTION = "Facilities for working with VCS repositories"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-jaraco.vcs-2.0.0-2.5.noarch.rpm"
RPM_HASH = "ab8e3d14bb5c479da7f1a94cd5ba30b7d1790a23e84fcde917dea37c4ae8c3ef8bfaecdc59eefbd4ec2dd11ac0b7ecc7c1acd3813dc956de97496825e3e2244e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.vcs \
python3.13dist-jaraco.vcs \
python313-jaraco.vcs \
python3dist-jaraco.vcs"

RDEPENDS:${PN} += "python-abi \
python313-jaraco.classes \
python313-jaraco.versioning \
python313-more-itertools \
python313-packaging"

inherit rpm
