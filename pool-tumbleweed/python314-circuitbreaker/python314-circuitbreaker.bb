SUMMARY = "Python implementation of the 'Circuit Breaker' Pattern"
DESCRIPTION = "Python implementation of the 'Circuit Breaker' Pattern"
LICENSE = "BSD-3-Clause"

PV = "2.1.3"

RPM_NAME = "python314-circuitbreaker-2.1.3-2.5.noarch.rpm"
RPM_HASH = "6cda8668028ed6780e9383258bf54c78cfb4a6508cb9bd65aa354237a0ef2afbc9f56df7e527f4bb8ee801ec085daaa138010a61e45b50ed66efe6d93d01bb83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-circuitbreaker \
python314-circuitbreaker \
python3dist-circuitbreaker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
