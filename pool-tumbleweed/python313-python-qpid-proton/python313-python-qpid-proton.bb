SUMMARY = "Python language bindings for the Qpid Proton messaging framework"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.40.0"

RPM_NAME = "python313-python-qpid-proton-0.40.0-1.1.aarch64.rpm"
RPM_HASH = "40ccd38ce832ec2f33599af6c72446e94f756a73d63fa69068233268fe2b0530e49c6f35a06e1b20b4f9bf193beea7a6e2a64c601a5724444e98e2c4513b98bb"

RPROVIDES:${PN} += "python3-python-qpid-proton \
python3-qpid-proton \
python3.13dist-python-qpid-proton \
python313-python-qpid-proton \
python313-qpid-proton \
python3dist-python-qpid-proton"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libqpid-proton-core.so.10 \
libqpid-proton-core10 \
python-abi \
python313-cffi"

inherit rpm
