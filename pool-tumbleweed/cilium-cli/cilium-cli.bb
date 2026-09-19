SUMMARY = "CLI to install, manage & troubleshoot Kubernetes clusters running Cilium"
DESCRIPTION = "CLI to install, manage and troubleshoot Kubernetes clusters running Cilium"
LICENSE = "Apache-2.0"

PV = "0.19.7"

RPM_NAME = "cilium-cli-0.19.7-1.1.aarch64.rpm"
RPM_HASH = "d699869e591a673af3bad13b2ad5778197cbc9f0a55080b7e2ae8aff68b25e62dba2b804de97b55119eaecb65c5821d7eed3de04f04240853284c77cae5401f0"

RPROVIDES:${PN} += "cilium-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
