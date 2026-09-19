SUMMARY = "Show resource requests, limits, and utilization in a Kubernetes cluster"
DESCRIPTION = "This is a simple CLI that provides an overview of the resource requests, limits, and utilization in a Kubernetes cluster. It attempts to combine the best parts of the output from kubectl top and kubectl describe into an easy to use CLI focused on cluster resources."
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "kubectl-capacity-0.8.0-1.14.aarch64.rpm"
RPM_HASH = "9be8922db667d882eb3144225be8e82137e9fa4f07529c1efcbf101d34d2ade37265b219d13db63d072ca72ed910f8c733892ea467cf194991325b59d152eff5"

RPROVIDES:${PN} += "kubectl-capacity"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
