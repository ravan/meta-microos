SUMMARY = "Machine emulator and virtualizer"
DESCRIPTION = " \
QEMU provides full machine emulation and cross architecture usage. It closely \
integrates with KVM and Xen virtualization, allowing for excellent performance. \
Many options are available for defining the emulated environment, including \
traditional devices, direct host device access, and interfaces specific to \
virtualization. \
 \
This package acts as an umbrella package to the other QEMU sub-packages."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "cad72b8389be63ddc93ff1abc79e2d3a2f49b2ab768ed1c0bdc7bf0b04bf37f8c669c16d74dba7f0e28749903d078275db6d5ad09b36e660a2102033307b6776"

RPROVIDES:${PN} += "kvm \
qemu \
qemu-kvm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
acl \
coreutils \
group-kvm \
group-qemu \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
passt \
qemu-arm \
udev \
user-qemu"

inherit rpm
