SUMMARY = "Container Network Interface plugins"
DESCRIPTION = "The CNI (Container Network Interface) project consists of a \
specification and libraries for writing plugins to configure \
network interfaces in Linux containers, along with a number of \
supported plugins. CNI concerns itself only with network \
connectivity of containers and removing allocated resources when \
the container is deleted. Because of this focus, CNI has a wide \
range of support and the specification is simple to implement. \
 \
These are the additional CNI network plugins provided by \
the containernetworking team."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "cni-plugins-1.6.2-1.10.aarch64.rpm"
RPM_HASH = "3a14164c7e6becec63213725f67449b71379da265044a08ecea15da7a76cd5e866c8466b78019f21f0b9e2ee2764e330290c4e70ac5f37e868c549ec4d7f1286"

RPROVIDES:${PN} += "cni-plugins"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
cni \
fillup \
iptables \
libc.so.6 \
systemd"

inherit rpm
