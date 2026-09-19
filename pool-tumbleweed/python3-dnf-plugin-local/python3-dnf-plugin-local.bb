SUMMARY = "Local Plugin for DNF"
DESCRIPTION = "Local Plugin for DNF, Python 3 version. Automatically copy all downloaded \
packages to a repository on the local filesystem and generating repo metadata."
LICENSE = "GPL-2.0-or-later"

PV = "4.10.1"

RPM_NAME = "python3-dnf-plugin-local-4.10.1-1.6.noarch.rpm"
RPM_HASH = "a005511c35057da41f8b7590d55c216f3a8eac9349029fc02eb3e28edfe20362a20ae11b60125a2cc72e65662d242fee9aa5cd1dc859db775cc4bfac827651c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-dnf-plugin-local \
dnf-plugin-local \
dnf-plugins-extras-local \
python3-dnf-plugin-local \
python3-dnf-plugins-extras-local"

RDEPENDS:${PN} += "createrepo-c \
python-abi \
python3-dnf-plugins-core"

inherit rpm
