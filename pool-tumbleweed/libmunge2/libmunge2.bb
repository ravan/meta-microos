SUMMARY = "Libraries for applications using MUNGE"
DESCRIPTION = "A shared library for applications using the MUNGE authentication service."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.5.18"

RPM_NAME = "libmunge2-0.5.18-1.4.aarch64.rpm"
RPM_HASH = "fc2bd532600855120975a36a9c8acdb82e87a3e942265dfc6b7801b8ff91bb995bda029d3aed43b252374f7816bb0cd365cdf2d80e5688207be44f654461e213"

RPROVIDES:${PN} += "libmunge.so.2 \
libmunge2 \
munge-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
