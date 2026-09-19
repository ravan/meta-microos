SUMMARY = "CLI for the KubeFirst GitOps Infrastructure & Application Delivery Platform"
DESCRIPTION = "The Kubefirst CLI creates instant GitOps platforms that integrate some of the \
best tools in cloud native from scratch in minutes."
LICENSE = "MIT"

PV = "2.10.5"

RPM_NAME = "kubefirst-2.10.5-1.7.aarch64.rpm"
RPM_HASH = "f73d76d34cc6651adf96989bd8565917fcfde9d2946a05f560a8626d9a5248fa17de1a874d10881cdde64e9ea6f8cb4c7c73d9226db8ac652889ac06d1cc7b95"

RPROVIDES:${PN} += "kubefirst"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
