SUMMARY = "Container Network Interface - networking for Linux containers"
DESCRIPTION = "The CNI (Container Network Interface) project consists of a \
specification and libraries for writing plugins to configure \
network interfaces in Linux containers, along with a number of \
supported plugins. CNI concerns itself only with network \
connectivity of containers and removing allocated resources when \
the container is deleted. Because of this focus, CNI has a wide \
range of support and the specification is simple to implement."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "cni-1.3.1-2.1.aarch64.rpm"
RPM_HASH = "879666bca90edca5ac5d69b9340a917eaa9f63c72e418d1c73096fc24b94ae1a91a69289de08ee5062917679c5c06539ef2b1a6ab2d832f32c8acfb01b0e8b8a"

RPROVIDES:${PN} += "cni"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
