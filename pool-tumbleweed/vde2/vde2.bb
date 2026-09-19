SUMMARY = "Virtual Distributed Ethernet"
DESCRIPTION = "VDE is a virtual network that can be spawned over a set of physical \
computer over the Internet \
 \
VDE connects together: \
  (1) real GNU-linux boxes (tuntap) \
  (2) virtual machines: UML-User Mode Linux, qemu, bochs, MPS. \
 \
VDE can be used: \
  (i) to create a general purpose tunnel (every protocol that runs \
    on a Ethernet can be put into the tunnel) \
  (ii) to connect a set of virtual machine to the Internet with no \
    need of free access of tuntap \
  (iii) to support mobility: a VDE can stay interconnected despite \
    of the change of virtual cables, i.e. the change of IP addresses \
    and interface in the real world"
LICENSE = "GPL-2.0-only"

PV = "2.3.2+svn587"

RPM_NAME = "vde2-2.3.2+svn587-6.6.aarch64.rpm"
RPM_HASH = "6f3ad491280f6b2cbbb05db41a3506235b2261569a8fbff2f1f6dbaa939ab124f8aa85db2524afd19631f73346ed27e66921d36fad07af67d47e04a3ab89251c"

RPROVIDES:${PN} += "config-vde2 \
libvdetap.so \
vde2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpcap.so.1 \
libvdehist.so.0 \
libvdemgmt.so.0 \
libvdeplug.so.3"

inherit rpm
