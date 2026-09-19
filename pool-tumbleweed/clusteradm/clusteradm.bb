SUMMARY = "CLI to bootstrap the open-cluster-management control plane"
DESCRIPTION = "clusteradm is the command-line tool for Open Cluster Management (OCM), \
providing a unified interface to manage multi-cluster Kubernetes environments \
from the command line. \
 \
Open Cluster Management (OCM) is a CNCF sandbox project that enables end-to-end \
visibility and control across your Kubernetes clusters using a powerful \
hub-agent architecture. OCM provides: \
- Cluster Lifecycle Management: Register, manage, and monitor multiple \
  Kubernetes clusters \
- Application Distribution: Deploy and manage applications across multiple \
  clusters \
- Policy & Governance: Enforce security policies and compliance across your \
  fleet \
- Add-on Extensibility: Extend functionality with a rich ecosystem of add-ons \
 \
clusteradm serves as the primary CLI tool for interacting with OCM, enabling \
administrators to: \
- Initialize hub clusters and register managed clusters \
- Deploy and manage multi-cluster applications \
- Configure policies and governance \
- Manage cluster sets and placements \
- Install and configure add-ons"
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "clusteradm-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "fe89681a155d17b2daa066ec967f9e51d527256d6dc9001610a91c4b8fa9cb8937ff582fe969179b3e92e387a41bf8c3a9d86a933edfa05455e0f0996cc8ad73"

RPROVIDES:${PN} += "clusteradm"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
