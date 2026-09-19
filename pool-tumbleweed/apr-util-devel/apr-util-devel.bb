SUMMARY = "Development files for the Apache Portable Runtime (APR) Utility Library"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the APR Utility library."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "apr-util-devel-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "86c4f2d495b194eed43efe88a9bdbe8b52c652d91f9923257054a45b590f5879445e4b63f4f0fa632a09b1f22a820dfa235c3c4f334a7c00d5707e4bd5b82517"

RPROVIDES:${PN} += "apr-util-devel \
libapr-util1-devel \
pkgconfig-apr-util-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
apr-devel \
gdbm-devel \
libapr-util1-0 \
libexpat-devel \
openldap2-devel \
pkgconfig-apr-1"

inherit rpm
