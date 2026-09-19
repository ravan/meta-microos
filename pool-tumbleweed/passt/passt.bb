SUMMARY = "User-mode networking daemons for virtual machines and namespaces"
DESCRIPTION = "passt implements a translation layer between a Layer-2 network interface and \
native Layer-4 sockets (TCP, UDP, ICMP/ICMPv6 echo) on a host. It doesn't \
require any capabilities or privileges, and it can be used as a simple \
replacement for Slirp. \
 \
pasta (same binary as passt, different command) offers equivalent functionality, \
for network namespaces: traffic is forwarded using a tap interface inside the \
namespace, without the need to create further interfaces on the host, hence not \
requiring any capabilities or privileges."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "20260612.a9c61ff"

RPM_NAME = "passt-20260612.a9c61ff-1.3.aarch64.rpm"
RPM_HASH = "b9643613ef349c7527b9fe6a0f263c23d0461f94bf61cd81b319d71a2ea2c3090e6dcc9756bf23ac9b7cf85c45b5e84cebbcc1f82a16daaea050ccbac929caf5"

RPROVIDES:${PN} += "passt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
