SUMMARY = "A library for automatically generating command line interfaces"
DESCRIPTION = "Python Fire is a library for automatically generating command line \
interfaces (CLIs) from a Python object."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python313-fire-0.7.1-2.4.noarch.rpm"
RPM_HASH = "43360c91460f7e85d1a95706ace55536bff63c6eb53490cb5dfd004eb45c63dae4847d7994779f4fb43b2425a7535684340049cf3bfc5750d0f6b0091395c4ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fire \
python3.13dist-fire \
python313-fire \
python3dist-fire"

RDEPENDS:${PN} += "python-abi \
python313-termcolor"

inherit rpm
