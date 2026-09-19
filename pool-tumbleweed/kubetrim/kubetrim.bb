SUMMARY = "Trim your KUBECONFIG automatically"
DESCRIPTION = "Tidy up old Kubernetes clusters from kubeconfig. \
 \
kubetrim tries to connect to each cluster in the current kubeconfig file, and \
removes any that are unreachable, or which error."
LICENSE = "MIT"

PV = "0.0.1"

RPM_NAME = "kubetrim-0.0.1-1.13.aarch64.rpm"
RPM_HASH = "2aa52ec0e66af8f48f6b52720ad44e6fca9b3fb9c36453e2173495e275812da9d65a5449b94874d1714cce290549e90758b7ae9aa763b31c094c094fb1019d15"

RPROVIDES:${PN} += "kubetrim"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
