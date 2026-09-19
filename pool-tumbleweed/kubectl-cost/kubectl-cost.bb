SUMMARY = "CLI for determining the cost of Kubernetes workloads"
DESCRIPTION = "kubectl-cost is a kubectl plugin that provides easy CLI access to Kubernetes \
cost information, like historical cost and predicted future cost, via \
Kubecost's APIs. It allows developers, devops, and others to quickly determine \
the cost & efficiency of any Kubernetes workload."
LICENSE = "Apache-2.0"

PV = "0.6.6"

RPM_NAME = "kubectl-cost-0.6.6-1.13.aarch64.rpm"
RPM_HASH = "c0953837f5480cbf732a729805e082869facd93dafb06ac6a165838ec50cea3ee70fbb7842ca76b5eb838e6a8d1cac8b3ad3e7f75536a6d7bed072d6dbff24b3"

RPROVIDES:${PN} += "kubectl-cost"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
