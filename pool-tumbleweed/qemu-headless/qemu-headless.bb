SUMMARY = "Minimum set of packages for having a functional QEMU"
DESCRIPTION = " \
QEMU provides full machine emulation and cross architecture usage. It closely \
integrates with KVM and Xen virtualization, allowing for excellent performance. \
Many options are available for defining the emulated environment, including \
traditional devices, direct host device access, and interfaces specific to \
virtualization. \
 \
This meta-package brings in, as dependencies, the minimum set of packages \
currently necessary for having a functional (headless) QEMU/KVM stack."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-headless-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "1c7167cdf50d23b672effb1629a53ae92fa815ceb01e9f47a7d702bcf24ba7bb6409d099844ed3cf5b8b12cf85f5219a2d71dd1d9ccb4d5a317bca07a58b3034"

RPROVIDES:${PN} += "qemu-headless"

RDEPENDS:${PN} += "qemu \
qemu-block-curl \
qemu-block-nfs \
qemu-img \
virtiofsd"

inherit rpm
