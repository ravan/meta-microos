SUMMARY = "The procps library"
DESCRIPTION = "The procps library can be used to read informations out from /proc \
the process information pseudo-file system."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.7"

RPM_NAME = "libproc2-1-4.0.7-2.1.aarch64.rpm"
RPM_HASH = "7e7576deaa841393b941c9fdcb5529b605bd37e4c9c921bb49522202716e13aefa0963fec59d4bce78952f472806fa05047ef75a44ddb7926914c9253958c603"

RPROVIDES:${PN} += "libproc2-1 \
libproc2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
