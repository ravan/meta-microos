SUMMARY = "Kubernetes client credential plugin implementing Azure authentication"
DESCRIPTION = "A client-go credential (exec) plugin implementing azure authentication. This \
plugin provides features that are not available in kubectl. It is supported on \
kubectl v1.11+"
LICENSE = "MIT"

PV = "0.2.19"

RPM_NAME = "kubelogin-0.2.19-1.3.aarch64.rpm"
RPM_HASH = "934384f88ccd34a7a370216e76547ce950fbf3262533d5ee7e0293560ee19aace01b688dbf58f511553c27c98f48bc69e65f17adfe6e5a2f64e67c69da385acf"

RPROVIDES:${PN} += "kubelogin"

RDEPENDS:${PN} += ""

inherit rpm
