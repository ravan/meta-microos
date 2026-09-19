SUMMARY = "CNI plugin providing multiple interfaces in containers"
DESCRIPTION = "Multus is a CNI plugin which provides multiple network interfaces in \
containers. It allows to use many CNI plugins at the same time and supports all \
plugins which implement the CNI specification."
LICENSE = "Apache-2.0"

PV = "3.6"

RPM_NAME = "multus-3.6-1.26.aarch64.rpm"
RPM_HASH = "f589a31421e861314e2b4aa37e41fbfec89a5e47a9872a2bd2306753d8f9c57ab37878ec3b74af5684c571ed0edd5fa4b22691ffdc41d6ddf98d012b62f77332"

RPROVIDES:${PN} += "multus"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
