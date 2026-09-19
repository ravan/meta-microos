SUMMARY = "Spice based audio support for QEMU"
DESCRIPTION = "This package contains a module for Spice based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-audio-spice-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "2ccd7526c3193f387b299ffd23a6c3223b180c41cb555ee974a84203e896475a021f441232efb265c274eeae72409e62079d1c77c077e17a59c2cce97442dd22"

RPROVIDES:${PN} += "qemu-audio-spice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
