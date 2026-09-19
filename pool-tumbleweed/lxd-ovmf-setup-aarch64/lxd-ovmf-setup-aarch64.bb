SUMMARY = "Symlink package for OVMF aarch64"
DESCRIPTION = "Provides the default links for OVMF \
for software which doesn't use the QEMU firmware files \
such as LXD and Incus"
LICENSE = "MIT"

PV = "20241211"

RPM_NAME = "lxd-ovmf-setup-aarch64-20241211-2.1.noarch.rpm"
RPM_HASH = "dfd71ddc35cbe08335f4c531d9678c9bc1fac2a87d76d3ba6eba4d43e1814be91d523457451ef9dca654cb985e7aa516ed0ed87b16eab001525ce27a05d2600f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxd-ovmf-setup-aarch64"

RDEPENDS:${PN} += "qemu-uefi-aarch64"

inherit rpm
