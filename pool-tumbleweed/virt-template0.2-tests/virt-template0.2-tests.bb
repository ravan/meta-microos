SUMMARY = "Functional test suite for virt-template"
DESCRIPTION = "The compiled ginkgo functional test suite of virt-template. It runs against \
a cluster where KubeVirt and virt-template are deployed (KUBECONFIG)."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "virt-template0.2-tests-0.2.2-1.1.aarch64.rpm"
RPM_HASH = "1d19f1a88a4404ebdd2517c2846cf0e80402f79e3c460ad562f63f246430f654a103e79920363d18df33df5fe1f7a76ef0ea3743103d17c830e082db0c56375f"

RPROVIDES:${PN} += "virt-template-tests \
virt-template0.2-tests"

RDEPENDS:${PN} += ""

inherit rpm
