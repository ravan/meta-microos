SUMMARY = "Directory Services Internals Library"
DESCRIPTION = "A Python native library containing necessary classes, functions and \
structures to interact with Windows Active Directory."
LICENSE = "GPL-2.0-only"

PV = "1.2.5"

RPM_NAME = "python313-dsinternals-1.2.5-1.2.noarch.rpm"
RPM_HASH = "b0d3ed148222ded01e2bbfd2a773742249f061f555cc906124e5aebd62a75e89fa62a48d994112ae3ebbdc78aeb44190e530e1a2ec0ad6ecaaa19fca531c9e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dsinternals \
python3.13dist-dsinternals \
python313-dsinternals \
python3dist-dsinternals"

RDEPENDS:${PN} += "python-abi"

inherit rpm
