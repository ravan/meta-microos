SUMMARY = "Data Plane Development Kit API documentation"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "25.11.3"

RPM_NAME = "dpdk-doc-25.11.3-1.1.noarch.rpm"
RPM_HASH = "913c53ce4de4c7e0c60e0c19867b57fe2ccd95c7e55f5b53c69408d0b84c65d7838e5512db5c98179c220390d2fbb4c5a57fc8a2f69129f83d639ede5b0ee71a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-doc \
dpdk-thunderx-doc"

RDEPENDS:${PN} += ""

inherit rpm
