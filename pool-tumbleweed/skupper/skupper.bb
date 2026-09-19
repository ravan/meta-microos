SUMMARY = "Virtual Application Network, enabling rich hybrid cloud communication"
DESCRIPTION = "Skupper enables cloud communication by enabling you to create a Virtual \
Application Network. \
 \
This application layer network decouples addressing from the underlying network \
infrastructure. This enables secure communication without a VPN. \
 \
You can use Skupper to create a network from namespaces in one or more \
Kubernetes clusters as described in the Getting Started. This guide describes a \
simple network, however there are no restrictions on the topology created which \
can include redundant paths. \
 \
Connecting one Skupper site to another site enables communication both ways. \
Communication can occur using any path available on the network, that is, \
direct connections are not required to enable communication. \
 \
Skupper supports anycast and multicast communication using the application \
layer network (VAN), allowing you to configure your topology to match business \
requirements. \
 \
Skupper does not require any special privileges, that is, you do not require \
the cluster-admin role to create networks."
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "skupper-2.2.1-1.3.aarch64.rpm"
RPM_HASH = "9f531785b452ea3e52e944edee8e076630bcef5f4ff5cc60766a3794a8abd56ddb212689cf05ee24cab502c4388ffea4764da2f03fc3f8607a62c74887a55693"

RPROVIDES:${PN} += "skupper"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
