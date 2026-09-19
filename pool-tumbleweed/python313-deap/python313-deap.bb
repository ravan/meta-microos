SUMMARY = "Distributed Evolutionary Algorithms in Python"
DESCRIPTION = "DEAP is intended to be an easy to use distributed evolutionary algorithm \
library in the Python language. Its two main components are modular and \
can be used separately. The first module is a Distributed Task Manager \
(DTM), which is intended to run on cluster of computers. The second \
part is the Evolutionary Algorithms in Python (EAP) framework."
LICENSE = "LGPL-3.0-only"

PV = "1.4.3"

RPM_NAME = "python313-deap-1.4.3-1.7.aarch64.rpm"
RPM_HASH = "fd598840d210502a74363f8ca46b3436037797d4bd25937087073e563e98ff7f48d1f7c0a1d14188ace14b95195a232731250aa253ab1f56fda219baf3894cf0"

RPROVIDES:${PN} += "python3-deap \
python3.13dist-deap \
python313-deap \
python3dist-deap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
