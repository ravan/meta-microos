SUMMARY = "Python implementation of the 'Circuit Breaker' Pattern"
DESCRIPTION = "Python implementation of the 'Circuit Breaker' Pattern"
LICENSE = "BSD-3-Clause"

PV = "2.1.3"

RPM_NAME = "python313-circuitbreaker-2.1.3-2.5.noarch.rpm"
RPM_HASH = "1146a153ac4f368d4f36e0a76645de24bbac1907a62a7e926d3f5e9b44dd4e480399275c19cca1f95b8310d22a11782c91d80fa1e72f17b24e70761e19f8eef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-circuitbreaker \
python3.13dist-circuitbreaker \
python313-circuitbreaker \
python3dist-circuitbreaker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
