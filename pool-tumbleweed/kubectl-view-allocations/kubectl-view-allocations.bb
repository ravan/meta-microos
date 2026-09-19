SUMMARY = "kubectl plugin to list allocations"
DESCRIPTION = "kubectl plugin lists allocations for resources (cpu, memory, gpu,...) as \
defined into the manifest of nodes and running pods. It doesn't list usage like \
kubectl top. It can provide result grouped by namespaces, nodes, pods and \
filtered by resources'name. \
 \
Columns displayed : \
 \
* Requested : Quantity of resources requested by the container in the pod's manifest. It's the sum group by pod, namespace, node where container is running. With percentage of resources requested over what is allocatable in the group. \
* Limit : Quantity of resources max (limit) requestable by the container in the pod's manifest. It's the sum group by pod, namespace, node where container is running. With percentage of resources max / limit over what is allocatable in the group. \
* Allocatable : Allocatable resources defined (or detected) on nodes. \
* Free : Allocatable - max (Limit, Requested) \
* Utilization : Quantity of resources (cpu & memory only) used as reported by Metrics API. It's disable by default, metrics-server is optional and should be setup into the cluster."
LICENSE = "CC0-1.0"

PV = "3.0.2"

RPM_NAME = "kubectl-view-allocations-3.0.2-1.3.aarch64.rpm"
RPM_HASH = "81c79ad6cda46524185cc2652bb48f2213a58589f3dcf983a099d91dc548e97d28af7b9287e7419ac33a4bbd223484a360d0ba41fe07edecc4607c3e008dafb0"

RPROVIDES:${PN} += "kubectl-view-allocations"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
