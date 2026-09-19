SUMMARY = "Analyze Kubernetes NGINX Ingress resources to help with migration to Traefik"
DESCRIPTION = "The Ingress NGINX Migration is a tool that analyzes Kubernetes NGINX Ingress \
resources to help with migration planning to Traefik. \
 \
The Ingress NGINX Migration tool creates and serves an interactive HTML report, \
and to do so it: \
 \
- Analyzes all Ingress resources in a Kubernetes cluster or specific namespaces \
- Identifies Ingress NGINX Controller annotations and their compatibility with \
  Traefik \
- Supports both in-cluster deployment and external kubeconfig access \
- Generates timestamped migration HTML report showing: \
  - Total number of Ingress resources \
  - How many can be migrated automatically \
  - Which Ingress resources need manual attention \
  - Unsupported annotations and their frequency \
- Provides flexible ingress filtering by controller class, ingress class name, \
  and namespace"
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "ingress-nginx-migration-1.2.1-1.4.aarch64.rpm"
RPM_HASH = "cc2e5f7d74c631a30200d1c41570b454d057e887da3a14f55c23cfdf523c371828039dc9e8e944af7f91fd60ff1c7b08a3bdbb9598c693d73c0d871ff8f206a2"

RPROVIDES:${PN} += "ingress-nginx-migration"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
