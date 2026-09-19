SUMMARY = "Python module to generate and modify bytecode"
DESCRIPTION = "Python module to generate and modify bytecode"
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "python314-bytecode-0.19.0-1.1.noarch.rpm"
RPM_HASH = "6bb2b1a2fa68b3b84d5fb0171f1d7aec4b0d2f6930b15f8cd8fdd99800b30157144236f21b9dc26266b17f71960822f6dc4f653f7c4cbfe3af24be9e2bbd50f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bytecode \
python314-bytecode \
python3dist-bytecode"

RDEPENDS:${PN} += "python-abi"

inherit rpm
