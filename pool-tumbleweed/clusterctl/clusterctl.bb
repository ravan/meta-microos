SUMMARY = "CLI tool to handle the lifecycle of a Cluster API management cluster"
DESCRIPTION = "The clusterctl CLI tool handles the lifecycle of a Cluster API management \
cluster. \
 \
The clusterctl command line interface is specifically designed for providing a \
simple “day 1 experience” and a quick start with Cluster API. It automates \
fetching the YAML files defining provider components and installing them. \
 \
Additionally it encodes a set of best practices in managing providers, that \
helps the user in avoiding mis-configurations or in managing day 2 operations \
such as upgrades. \
 \
Below you can find a list of main clusterctl commands: \
 \
* clusterctl init: Initialize a management cluster. \
* clusterctl upgrade plan: Provide a list of recommended target versions for \
  upgrading Cluster API providers in a management cluster. \
* clusterctl upgrade apply: Apply new versions of Cluster API core and providers \
  in a management cluster. \
* clusterctl delete: Delete one or more providers from the management cluster. \
* clusterctl generate: cluster Generate templates for creating workload \
  clusters. \
* clusterctl generate yaml: Process yaml using clusterctl’s yaml processor. \
* clusterctl get kubeconfig: Gets the kubeconfig file for accessing a workload \
  cluster. \
* clusterctl move: Move Cluster API objects and all their dependencies between \
  management clusters. \
* clusterctl alpha rollout: Manages the rollout of Cluster API resources. For \
  example: MachineDeployments. \
 \
Avoiding GitHub rate limiting \
 \
While using providers hosted on GitHub, clusterctl is calling GitHub API which \
are rate limited; for normal usage free tier is enough but when using \
clusterctl extensively users might hit the rate limit. \
 \
To avoid rate limiting for the public repos set the GITHUB_TOKEN environment \
variable. To generate a token follow this documentation. The token only needs \
repo scope for clusterctl."
LICENSE = "Apache-2.0"

PV = "1.14.0"

RPM_NAME = "clusterctl-1.14.0-1.1.aarch64.rpm"
RPM_HASH = "432b8aaa85d4f43899e16da46c25e44feeed72045193977a28786c08d9790affd7d27ab2b9e28e84a59850a55f6d76518fa3b2db456c10abb3bc9eea161b8cdb"

RPROVIDES:${PN} += "clusterctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
