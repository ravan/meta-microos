SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.34.11"

RPM_NAME = "kubernetes1.34-client-1.34.11-2.1.aarch64.rpm"
RPM_HASH = "dd0653e09eec5750f5693063babd3c6b92f738d497fb123224dc9c9feb46f8d6cf59e2b532e52ffdd687ba3a7705f939621e3758a67f2e638a7c14d41ca086e7"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.34-client"

RDEPENDS:${PN} += "kubernetes1.34-client-common \
update-alternatives"

inherit rpm
