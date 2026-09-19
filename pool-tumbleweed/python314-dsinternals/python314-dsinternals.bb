SUMMARY = "Directory Services Internals Library"
DESCRIPTION = "A Python native library containing necessary classes, functions and \
structures to interact with Windows Active Directory."
LICENSE = "GPL-2.0-only"

PV = "1.2.5"

RPM_NAME = "python314-dsinternals-1.2.5-1.2.noarch.rpm"
RPM_HASH = "261a3ae7d3d5815a27f79b5db5c4d766aad1da5f94a872a1f6aeb2f82601f872292126fb5fe7344ee87f173753bfb5ea4616f00bc61cac582c23a1e1959fb630"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dsinternals \
python314-dsinternals \
python3dist-dsinternals"

RDEPENDS:${PN} += "python-abi"

inherit rpm
