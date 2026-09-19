SUMMARY = "Symlink package for OVMF x86_64"
DESCRIPTION = "Provides the default links for OVMF \
for software which doesn't use the QEMU firmware files \
such as LXD and Incus"
LICENSE = "MIT"

PV = "20241211"

RPM_NAME = "lxd-ovmf-setup-x86_64-20241211-2.1.noarch.rpm"
RPM_HASH = "a6c058baf32c0d4534f92a6a9d39eadc1069c01447bae026d86f1320fcd3befbaa4dacd78851a83cb41d86acc1ede076ba8dba88bdc65bed6bc8100945d6432c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxd-ovmf-setup-x86-64"

RDEPENDS:${PN} += "qemu-ovmf-x86-64"

inherit rpm
