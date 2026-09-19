SUMMARY = "Ethernet DOS File System server"
DESCRIPTION = "EtherDFS is a DOS installable filesystem, mapping a DOS drive letter \
to a remote share. This package contains the server side of EtherDFS, \
a daemon exporting one or more directories for remote access by the \
EtherDFS DOS TSR."
LICENSE = "MIT"

PV = "0~20180203"

RPM_NAME = "etherdfs-0~20180203-1.11.aarch64.rpm"
RPM_HASH = "b641db8f9fd195628c6451cad3b9942f5fe9344d335acc2671a8f3b9e4802beaad678aa39966d5fb8a2bceb6458de7ae78544a22760b1f286e0764cfbc587ccf"

RPROVIDES:${PN} += "etherdfs \
etherdfs-server \
ethersrv-linux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
