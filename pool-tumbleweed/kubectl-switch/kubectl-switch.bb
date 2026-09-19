SUMMARY = "Simple tool to help manage multiple kubeconfig files"
DESCRIPTION = "kubectl-switch is a command-line tool for managing and switching between \
multiple Kubernetes configuration files located in the same directory. It \
simplifies the process of selecting a Kubernetes context from multiple \
kubeconfig files and updating the active configuration or namespace. \
 \
Just dump all your kubeconfigs into a single dir and let kubectl-switch manage \
them for you!"
LICENSE = "MIT"

PV = "2.4.32"

RPM_NAME = "kubectl-switch-2.4.32-1.1.aarch64.rpm"
RPM_HASH = "48bb621f9e9df51628add1c1c3700a13e0373d2d85af804f76c866ba47def6bce1167ca8adb859e043a6b0e53f23240c86cb957b02288c69277119e3f9b5a819"

RPROVIDES:${PN} += "kubectl-switch"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
