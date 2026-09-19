SUMMARY = "Development files for python313-pyzmq"
DESCRIPTION = "Development libraries and headers needed to build software using python313-pyzmq."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "27.2.0"

RPM_NAME = "python313-pyzmq-devel-27.2.0-1.1.aarch64.rpm"
RPM_HASH = "60eb2462f5a8436a2968636eacd44e232254ccdbf95e156660cd11c9c83d89f091ef7d045e1e9fde82362d0dd9046140a8e909ccf7c853f272782146f33d23dc"

RPROVIDES:${PN} += "python3-pyzmq-devel \
python313-pyzmq-devel"

RDEPENDS:${PN} += "python-abi \
python313-devel \
python313-pyzmq \
zeromq-devel"

inherit rpm
