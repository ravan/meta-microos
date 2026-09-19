SUMMARY = "Hypothesis extension for generating filesystem paths"
DESCRIPTION = "Hypothesis extension for generating filesystem paths"
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python313-hypothesis-fspaths-0.1-3.5.noarch.rpm"
RPM_HASH = "68ba707ea5fc22f0b07218649dd10e3e28386cec3e4d0d1d5321d934b797454d701492a14f9327f0cdf907a68732aa1cf39590bcb4f12a56b7377fa911f6d662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hypothesis-fspaths \
python3.13dist-hypothesis-fspaths \
python313-hypothesis-fspaths \
python3dist-hypothesis-fspaths"

RDEPENDS:${PN} += "python-abi \
python313-hypothesis"

inherit rpm
