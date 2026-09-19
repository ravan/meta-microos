SUMMARY = "Kubectl plugin for duplication of existing kubernetes resources"
DESCRIPTION = "This plugin is designed for on-the-fly duplication of Kubernetes resources. It \
focuses on providing a convenient way to edit resources before duplication, \
with a specific emphasis on Pods to create a fine-tuned resource quickly. This \
tool can be used for debugging running containers without them crashing, and \
simplifying the administration and general interaction with Kubernetes \
clusters."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "kubectl-dup-0.3.2-1.13.aarch64.rpm"
RPM_HASH = "bca278bc907fdbbb6a17351c8811def735f04337c42e7524b32353c2c0de5edfef16177cc2e75487ce09832cb4d9ca4b998728288cae8b68ff1daf99e54739ec"

RPROVIDES:${PN} += "kubectl-dup"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
