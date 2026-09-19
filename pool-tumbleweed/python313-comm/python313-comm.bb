SUMMARY = "Jupyter Python Comm implementation"
DESCRIPTION = "Comm provides a way to register a Kernel Comm implementation, \
as per the Jupyter kernel protocol. It also provides a base \
Comm implementation and a default CommManager that can be used."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python313-comm-0.2.3-1.6.noarch.rpm"
RPM_HASH = "ad6b11d4e80237fb39d28f31ebb0e884f72b714b8d8ff436977a4d4bb273548b06a13484ac00cc578b4ea214dbed9596e895acc12d539f23f176cae0c8031320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comm \
python3.13dist-comm \
python313-comm \
python3dist-comm"

RDEPENDS:${PN} += "python-abi"

inherit rpm
