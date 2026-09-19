SUMMARY = "Test files for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.40.0"

RPM_NAME = "qpid-proton-test-0.40.0-1.1.noarch.rpm"
RPM_HASH = "8fa2986a10d666cfc0fcf44c88900eb454af5e035eb674b036c155d8341097c4df0f4ab8761fea8302fa211454a44917b0ed33b259f14eff12a4a5aee63e0554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qpid-proton-test"

RDEPENDS:${PN} += ""

inherit rpm
