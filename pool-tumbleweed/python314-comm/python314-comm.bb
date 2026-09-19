SUMMARY = "Jupyter Python Comm implementation"
DESCRIPTION = "Comm provides a way to register a Kernel Comm implementation, \
as per the Jupyter kernel protocol. It also provides a base \
Comm implementation and a default CommManager that can be used."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python314-comm-0.2.3-1.6.noarch.rpm"
RPM_HASH = "9124e354414c2f4f7c6d041bdd1e543f22ce7f78899a3f0d2be5bbfd93697005d8d737d31d2a090cebf323c596e06ee44dbb3743d644035aa110afa7db989869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-comm \
python314-comm \
python3dist-comm"

RDEPENDS:${PN} += "python-abi"

inherit rpm
