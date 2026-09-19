SUMMARY = "Python RXP interface - fast validating XML parser"
DESCRIPTION = "PyRXP is a Python language wrapper around the excellent RXP parser, a \
validating, namespace-aware XML parser written in C."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python313-pyRXP-3.0.1-3.7.aarch64.rpm"
RPM_HASH = "67e8564efff35545df28eeda2823f28034e17bb144a3359dd63077a9407fbe6fa600a32d2c008797e58e53c6b4eed042fea54202e818d20bee84ce6ccdb99fa7"

RPROVIDES:${PN} += "python3-pyRXP \
python3.13dist-pyrxp \
python313-pyRXP \
python3dist-pyrxp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
