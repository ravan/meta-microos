SUMMARY = "Kubectl plugin to gather data about your cluster"
DESCRIPTION = "This is a kubectl plugin for gathering data about your cluster that may help to \
debug issues. \
 \
Kubernetes is big and complicated, and when something breaks it is hard to tell \
which info is needed for debugging. Even if you known which resources or logs \
are needed, it is hard to get the data manually. When working with multiple \
related clusters gathering the right data from the right cluster is even \
harder. \
 \
The kubectl gather tool makes it easy to gather data quickly from multiple \
clusters with a single command. It gathers all resources from all clusters. It \
also gather related data such as pods logs, on for specific cases, external \
logs stored on the nodes. The data is stored in a local directory, one file per \
resource, making it easy to navigate and inspect using standard tools. If you \
know what you want to gather, it is much faster and consume fraction of the \
storage to gather only specific namespaces from all clusters."
LICENSE = "Apache-2.0"

PV = "0.14.0"

RPM_NAME = "kubectl-gather-0.14.0-1.1.aarch64.rpm"
RPM_HASH = "1598b5b063911a7450883e063e106f44d9a3af2d371a9c55afc57df4412408ca8afc48847ca2435f8ffbdee6cf2add9ddb09297a7f2a6cbc86014560a40fefa1"

RPROVIDES:${PN} += "kubectl-gather"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
