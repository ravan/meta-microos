SUMMARY = "Tools to convert a virtual machine to run on KVM"
DESCRIPTION = "Virt-v2v converts a single guest from a foreign hypervisor to run on \
KVM.  It can read Linux and Windows guests running on VMware, Xen, \
Hyper-V and some other hypervisors, and convert them to KVM managed by \
libvirt, OpenStack, oVirt, Red Hat Virtualisation (RHV) or several \
other targets.  It can modify the guest to make it bootable on KVM and \
install virtio drivers so it will run quickly."
LICENSE = "GPL-2.0-or-later"

PV = "2.12.0"

RPM_NAME = "virt-v2v-2.12.0-1.1.aarch64.rpm"
RPM_HASH = "640bba5affc5bd242481a9207f87fbfca89febf7ef31978245430786507e407faf42f55e12b7bcbbdeec5651f21da850f496f4ebf2674485ba0048d8eaf51707"

RPROVIDES:${PN} += "virt-v2v"

RDEPENDS:${PN} += "/usr/bin/gawk \
/usr/bin/gzip \
/usr/bin/qemu-nbd \
/usr/bin/virsh \
guestfs-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libguestfs \
libguestfs-winsupport \
libguestfs.so.0 \
libguestfs0 \
libjson-c.so.5 \
libm.so.6 \
libnbd \
libnbd.so.0 \
libosinfo-1.0.so.0 \
libpcre2-8.so.0 \
libvirt.so.0 \
libxml2.so.16 \
nbdkit \
nbdkit-curl-plugin \
nbdkit-nbd-plugin \
nbdkit-python-plugin \
nbdkit-ssh-plugin \
openssh-clients \
ovmf \
unzip"

inherit rpm
