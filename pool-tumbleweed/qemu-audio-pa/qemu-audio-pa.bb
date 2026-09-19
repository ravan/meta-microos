SUMMARY = "Pulse Audio based audio support for QEMU"
DESCRIPTION = "This package contains a module for Pulse Audio based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-audio-pa-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "8e68f077ee1cede18d55d2447ceea75ff471dda0aea45fceaa0e13a9e9167e7bf490aa0efc8706a34d606b6b9d989c16602a21ad62cca1def8eb27434ee138ad"

RPROVIDES:${PN} += "qemu-audio-pa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpulse.so.0"

inherit rpm
