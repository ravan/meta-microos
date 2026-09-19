SUMMARY = "Simple pure-python AVM meta-data handling"
DESCRIPTION = "Simple pure-python AVM meta-data handling"
LICENSE = "MIT"

PV = "0.9.9"

RPM_NAME = "python314-pyavm-0.9.9-1.4.noarch.rpm"
RPM_HASH = "79f6a6677047e46e7d424d0aaafad41abd3185e2763fa0d519f9b2d4609334723607a7477c569e0fc05a6a79350f4503464e4032735ac64c38dacc7ba9218944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyavm \
python314-pyavm \
python3dist-pyavm"

RDEPENDS:${PN} += "python-abi"

inherit rpm
