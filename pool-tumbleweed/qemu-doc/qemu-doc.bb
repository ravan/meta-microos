SUMMARY = "Documentation for QEMU"
DESCRIPTION = " \
QEMU provides full machine emulation and cross architecture usage. It closely \
integrates with KVM and Xen virtualization, allowing for excellent performance. \
Many options are available for defining the emulated environment, including \
traditional devices, direct host device access, and interfaces specific to \
virtualization. \
 \
This package contains user and developer documentation for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-doc-11.1.1-1.1.noarch.rpm"
RPM_HASH = "90cb5bafd66ef87ecbe35c5174eb501f27cc34e614d19da895174453d1d13fd7c65a6b28a0f005653158ef49582eab3be86f15b4230b1374649f0baf7d75ff02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-doc"

RDEPENDS:${PN} += ""

inherit rpm
