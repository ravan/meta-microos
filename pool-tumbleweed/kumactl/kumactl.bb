SUMMARY = "CLI for the Kuma service mesh"
DESCRIPTION = "Kuma is a modern Envoy-based service mesh that can run on every cloud, in a \
single or multi-zone capacity, across both Kubernetes and VMs. Thanks to its \
broad universal workload support, combined with native support for Envoy as its \
data plane proxy technology (but with no Envoy expertise required), Kuma \
provides modern L4-L7 service connectivity, discovery, security, observability, \
routing and more across any service on any platform, databases included. \
 \
Easy to use, with built-in service mesh policies for security, traffic control, \
discovery, observability and more, Kuma ships with an advanced multi-zone and \
multi-mesh support that automatically enables cross-zone communication across \
different clusters and clouds, and automatically propagates service mesh \
policies across the infrastructure. Kuma is currently being adopted by \
enterprise organizations around the world to support distributed service meshes \
across the application teams, on both Kubernetes and VMs. \
 \
Originally created and donated by Kong, Kuma is today CNCF (Cloud Native \
Computing Foundation) Sandbox project and therefore available with the same \
openness and neutrality as every other CNCF project. Kuma has been engineered \
to be both powerful yet simple to use, reducing the complexity of running a \
service mesh across every organization with very unique capabilities like \
multi-zone support, multi-mesh support, and a gradual and intuitive learning \
curve."
LICENSE = "Apache-2.0"

PV = "2.14.3"

RPM_NAME = "kumactl-2.14.3-1.1.aarch64.rpm"
RPM_HASH = "bcf6cf616c445a183a001152edb557d46ae844e8be023183332de2f5b26d344fe9c78479ee286e5e6dcff404cd178c2cbbb3b0a96361464d7c6fdbcd806c7f8c"

RPROVIDES:${PN} += "kumactl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
