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

RPM_NAME = "python313-pybreaker-1.4.1-1.4.noarch.rpm"
RPM_HASH = "9eeb007c9cfe0da5a9d069a8f8734a04407175aca1e8218273c986ad57ca644b85692d54200312522f10f5c28aec8986755081a03a10b1a97dc25b8b06838a46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybreaker \
python3.13dist-pybreaker \
python313-pybreaker \
python3dist-pybreaker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
