SUMMARY = "Tools for observing Kubernetes resources in real time, powered by Pulumi"
DESCRIPTION = "What happens when you boot up a Pod? What happens to a Service before it is allocated a public IP address? How often is a Deployment's status changing? \
 \
kubespy is a small tool that makes it easy to observe how Kubernetes resources change in real time, derived from the work we did to make Kubernetes deployments predictable in Pulumi's CLI. Run kubespy at any point in time, and it will watch and report information about a Kubernetes resource continuously until you kill it."
LICENSE = "Apache-2.0"

PV = "0.6.3"

RPM_NAME = "kubespy-0.6.3-1.14.aarch64.rpm"
RPM_HASH = "e100e1f0ffbd0fa9a47d7132559e3efc695eb8955fcfc34ffa2f92d25849b8e03d9bd8f487ba45f344c61098e6f6617f47cd1e6e82d949a54f66b986974a846d"

RPROVIDES:${PN} += "kubespy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
