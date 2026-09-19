SUMMARY = "Linux Trace Toolkit Userspace Tracer Python 3 agent"
DESCRIPTION = "This library may be used by user space applications to generate \
tracepoints within the kernel LTT subsystem. \
 \
This package provides the LLTng-UST Python 3 agent."
LICENSE = "GPL-2.0-only"

PV = "2.14.0"

RPM_NAME = "python3-lttngust-2.14.0-1.3.aarch64.rpm"
RPM_HASH = "56485a584c07c4f54ee38d514ca33fe66f197b057963c8f085b45f4105cf7a3334eddf27e19f7876d01e02e8d7c6caba61aead189222f7047a325a2cd2466972"

RPROVIDES:${PN} += "python3-lttngust \
python3.13dist-lttngust \
python3dist-lttngust"

RDEPENDS:${PN} += "liblttng-ust-python-agent1 \
python-abi"

inherit rpm
