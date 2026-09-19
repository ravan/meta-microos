SUMMARY = "CLI for the Rancher Fleet GitOps tooling"
DESCRIPTION = "Fleet is GitOps and HelmOps at scale. Fleet is designed to manage multiple \
clusters. It's also lightweight enough that it works great for a single cluster \
too, but it really shines when you get to a large scale. By large scale we mean \
either a lot of clusters, a lot of deployments, or a lot of teams in a single \
organization. \
 \
Fleet can manage deployments from git of raw Kubernetes YAML, Helm charts, or \
Kustomize or any combination of the three. Regardless of the source all \
resources are dynamically turned into Helm charts and Helm is used as the \
engine to deploy everything in the cluster. This gives a high degree of \
control, consistency, and auditability. Fleet focuses not only on the ability \
to scale, but to give one a high degree of control and visibility to exactly \
what is installed on the cluster. \
 \
This package contains the CLI to interact with Fleet."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "fleet-cli-0.16.1-1.1.aarch64.rpm"
RPM_HASH = "fef59d9098c998279e465639ee7d3894e0d0ef830c72f12eeff9f43b3f9195d55b50505fad44879ff1fbe8effd642ab5b18d15c2509c85ff7a83bd9e460a52bd"

RPROVIDES:${PN} += "fleet \
fleet-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
