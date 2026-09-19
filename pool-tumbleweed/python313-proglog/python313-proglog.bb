SUMMARY = "Log and progress bar manager for Python"
DESCRIPTION = "Proglog is a progress logging system for Python. It allows developers \
to build libraries while giving the user control on the management of \
logs, callbacks and progress bars."
LICENSE = "MIT"

PV = "0.1.12"

RPM_NAME = "python313-proglog-0.1.12-1.5.noarch.rpm"
RPM_HASH = "a4a18e2d86d0691d9e6dfea84f08946c28c383c22f2a7f2504f5e88c774588e67b05a1df4ebf0192ba46184b2def7d1e6f3aca57f94256a2fc697287e499e7ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proglog \
python3.13dist-proglog \
python313-proglog \
python3dist-proglog"

RDEPENDS:${PN} += "python-abi \
python313-tqdm"

inherit rpm
