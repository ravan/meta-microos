SUMMARY = "Slimline Open Firmware - SLOF"
DESCRIPTION = "Slimline Open Firmware (SLOF) is an implementation of the IEEE 1275 standard. \
It can be used as partition firmware for pSeries machines running on QEMU or KVM."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-SLOF-11.1.1-1.1.noarch.rpm"
RPM_HASH = "65155ab491271555bd02a41ade76eea015599593c3473f689465814a0948025c8c6a2773deb99e2371340894df6bf351673397dcdbdcc5d3c47344055165ab6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-SLOF"

RDEPENDS:${PN} += ""

inherit rpm
