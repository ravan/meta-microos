SUMMARY = "An etcd backed network fabric for containers"
DESCRIPTION = "flannel is a virtual network that gives a subnet to each host for use with \
container runtimes. \
 \
Platforms like Google's Kubernetes assume that each container (pod) has a \
unique, routable IP address inside the cluster. The advantage of this model is that it \
reduces the complexity of doing port mapping. \
 \
This package contains the binary to be included into a container image"
LICENSE = "Apache-2.0"

PV = "0.28.7"

RPM_NAME = "flannel-0.28.7-1.2.aarch64.rpm"
RPM_HASH = "03bda992922cdeadf94f68adc20ced244f1c5a836c744879a38e7812535c25003548fa00c0a30dbf748d54d3895824cb27bc038bd972bbd9dbcbf25f975d45fd"

RPROVIDES:${PN} += "flannel"

RDEPENDS:${PN} += "iproute2 \
iptables"

inherit rpm
