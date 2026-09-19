SUMMARY = "Distributed Evolutionary Algorithms in Python"
DESCRIPTION = "DEAP is intended to be an easy to use distributed evolutionary algorithm \
library in the Python language. Its two main components are modular and \
can be used separately. The first module is a Distributed Task Manager \
(DTM), which is intended to run on cluster of computers. The second \
part is the Evolutionary Algorithms in Python (EAP) framework."
LICENSE = "LGPL-3.0-only"

PV = "1.4.3"

RPM_NAME = "python314-deap-1.4.3-1.7.aarch64.rpm"
RPM_HASH = "a17a9394f2c8148e65146ac0f00f9d5854bebbe9c6feba73a96c83aae2cef71752cf63e7cbc2a0780971c16ad7c4f8518f79d3f8d5c93f10569ab36249da4cf6"

RPROVIDES:${PN} += "python3.14dist-deap \
python314-deap \
python3dist-deap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm
