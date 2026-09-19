SUMMARY = "Python language bindings for the Qpid Proton messaging framework"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.40.0"

RPM_NAME = "python314-python-qpid-proton-0.40.0-1.1.aarch64.rpm"
RPM_HASH = "6b034404ead598a39297c091e3a93b8fd58af01d9d12a88d66efb889d900651cd1a004d3975351112440a2f26d76985e0082f20b8047581b61e152f40f6088bc"

RPROVIDES:${PN} += "python3.14dist-python-qpid-proton \
python314-python-qpid-proton \
python314-qpid-proton \
python3dist-python-qpid-proton"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libqpid-proton-core.so.10 \
libqpid-proton-core10 \
python-abi \
python314-cffi"

inherit rpm
