SUMMARY = "KVM Virtualization Host and tools"
DESCRIPTION = "This will provide all minimal system to get a running KVM Hypervisor \
and be able to configure, manage, and monitor virtual machines on a \
single physical machine."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-kvm_tools-20250313-5.2.aarch64.rpm"
RPM_HASH = "50598fe98e7b6f55471cd2be5825dc4b114c20774ede4c0d4de6b8e6bf030fe815f8c3e2a0c02a7319f4187414a1d04f485cfb8e0169d38f75c8e7872ecea037"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-server-kvm-tools"

RDEPENDS:${PN} += "libvirt-client \
libvirt-daemon-config-network \
libvirt-daemon-qemu \
pattern- \
virt-manager"

inherit rpm
