SUMMARY = "KVM Host Server"
DESCRIPTION = "Software to set up a server for configuring, managing, and monitoring virtual machines on a single physical machine."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-kvm_server-20250313-5.2.aarch64.rpm"
RPM_HASH = "cd21147f3242826fc08b61fa89d2ba0b8f43657978592858e48df083ccda5afe599544c2925fbe40db0431ed6d62085f92f6f3b5322741cb5541df3a18b09847"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-kvm-server \
patterns-server-kvm-server"

RDEPENDS:${PN} += "libvirt-daemon-config-network \
libvirt-daemon-driver-network \
libvirt-daemon-driver-qemu \
libvirt-daemon-driver-storage-core \
pattern- \
tftp"

inherit rpm
