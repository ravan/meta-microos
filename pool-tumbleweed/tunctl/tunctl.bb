SUMMARY = "Create and remove virtual network interfaces"
DESCRIPTION = "tunctl is a tool to set up and maintain persistent TUN/TAP network \
interfaces, enabling user applications access to the wire side of a \
virtual nework interface. Such interfaces is useful for connecting VPN \
software, virtualization, emulation and a number of other similar \
applications to the network stack. \
 \
tunctl originates from the User Mode Linux project."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "tunctl-1.5-28.9.aarch64.rpm"
RPM_HASH = "7fd58158a70672803074fd5793bf441a4bd86402c4224383ca0368f62d40e395e329bb7b9248cdd4828eb4c787188538c3eef5a2a4ac32e0185fa942e4cd0bc7"

RPROVIDES:${PN} += "tunctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
