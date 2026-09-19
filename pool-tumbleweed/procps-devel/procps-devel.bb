SUMMARY = "Development files for procps"
DESCRIPTION = "The procps library can be used to read informations out from /proc \
the process information pseudo-file system. \
 \
This subpackage contains the header files for libprocps."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.0.7"

RPM_NAME = "procps-devel-4.0.7-2.1.aarch64.rpm"
RPM_HASH = "ac538e23891cad99de85b849da2ad677e5ab720dfe2136c3046c6631f8ee526be03d732c567366a83c9c65d7d4369a7fabadf422b9642c35c21728bb5fe82352"

RPROVIDES:${PN} += "pkgconfig-libproc2 \
procps-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libproc2-1"

inherit rpm
