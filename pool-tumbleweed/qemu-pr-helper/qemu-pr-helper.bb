SUMMARY = "QEMU persistent reservation helper"
DESCRIPTION = "This package provides a helper utility for SCSI persistent reservations."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-pr-helper-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "d727e659decd0f6e1a5bf21be5dfd37e0809eda8d4320627547c6e50b5f5859654c2014d6462513340793209da2a0044add3eb5c18b5353ae2409b3d54defb18"

RPROVIDES:${PN} += "qemu-pr-helper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libm.so.6 \
libmpathpersist.so.0 \
libnuma.so.1 \
libpam.so.0 \
libudev.so.1 \
liburing.so.2"

inherit rpm
