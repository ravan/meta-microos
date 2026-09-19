SUMMARY = "Kubectl plugin to browse Kubernetes object hierarchies as a tree"
DESCRIPTION = "A kubectl plugin to explore ownership relationships between Kubernetes objects through ownersReferences on the objects. \
 \
The kubectl lineage plugin is very similar to kubectl tree, but it understands logical relationships between some API objects without needing ownerReferences."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "kubectl-tree-0.6.0-1.5.aarch64.rpm"
RPM_HASH = "3ce09f4bfffd7f5423df563ca8ac29db23121c56354794c7b01ca4fb4bff79742d9f27a391a20da2cb3506b9e467df683610c68f983ad6fdbcef534a6961a351"

RPROVIDES:${PN} += "kubectl-tree"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
