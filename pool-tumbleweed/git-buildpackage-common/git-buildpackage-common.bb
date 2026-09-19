SUMMARY = "Common files for git-buildpackage debian and rpm tools"
DESCRIPTION = "Common files and documentation, used by both git-buildpackage debian and rpm tools"
LICENSE = "GPL-2.0-only"

PV = "0.9.23"

RPM_NAME = "git-buildpackage-common-0.9.23-1.12.noarch.rpm"
RPM_HASH = "ad35e905a79655137ef4adcdabcb2b32926246e3b5c9ae25a261e3ec6279386cecb9e929a782f759361144c9ad78acfbeb821d2da1bcae0341c56a210e365dea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-git-buildpackage-common \
git-buildpackage-common \
python3.13dist-gbp \
python3dist-gbp"

RDEPENDS:${PN} += "/usr/bin/python3 \
git-core \
man \
python-abi \
python3-base \
python3-dateutil \
python3-setuptools"

inherit rpm
