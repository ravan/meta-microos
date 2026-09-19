SUMMARY = "Modules and packages for SPICE"
DESCRIPTION = " \
QEMU provides full machine emulation and cross architecture usage. It closely \
integrates with KVM and Xen virtualization, allowing for excellent performance. \
Many options are available for defining the emulated environment, including \
traditional devices, direct host device access, and interfaces specific to \
virtualization. \
 \
This meta-package brings in, as dependencies, the modules and packages \
necessary for having SPICE working for your VMs."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-spice-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "ded7a4df9d186dff2f642b13475ac04cee33a0c3195b3559144e65b7e716631feaee0ccfc08df4f355e79677d9c12cba8d210c5349f40969b1ca8a74f93c3787"

RPROVIDES:${PN} += "qemu-spice"

RDEPENDS:${PN} += "qemu-audio-spice \
qemu-chardev-spice \
qemu-headless \
qemu-hw-display-qxl \
qemu-hw-usb-redirect \
qemu-ui-spice-core"

inherit rpm
