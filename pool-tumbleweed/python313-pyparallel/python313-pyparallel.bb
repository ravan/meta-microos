SUMMARY = "Python Parallel Port Extension"
DESCRIPTION = "This module encapsulates the access for the parallel port. It provides \
backends for Python running on Windows and Linux."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python313-pyparallel-0.2.2-4.5.noarch.rpm"
RPM_HASH = "278d7b56dbf515108c1dc1df041b54577c07f0171ed2ab95cbc0b69547c74bf6f21c8669385b9e80736f2af1f313a6c2249ed563b816da5bdbf92f714c267e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyparallel \
python3.13dist-pyparallel \
python313-pyparallel \
python3dist-pyparallel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
