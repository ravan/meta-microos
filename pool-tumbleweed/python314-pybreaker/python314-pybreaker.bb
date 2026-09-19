SUMMARY = "Python implementation of the Circuit Breaker pattern"
DESCRIPTION = "PyBreaker is a Python implementation of the Circuit Breaker pattern, described \
in Michael T. Nygard's book `Release It!`_. \
 \
In Nygard's words, *'circuit breakers exists to allow one subsystem to fail \
without destroying the entire system. This is done by wrapping dangerous \
operations (typically integration points) with a component that can circumvent \
calls when the system is not healthy'*."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "python314-pybreaker-1.4.1-1.4.noarch.rpm"
RPM_HASH = "9f2c34394604c0a52e2a162f0627543f975dbd84132dcc719cfef45e0ef71015e6e5e66230e95054c52f128a1ae45bbab1f382809c33b11aaebdbe2bd32ced03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pybreaker \
python314-pybreaker \
python3dist-pybreaker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
