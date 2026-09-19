SUMMARY = "Development files for libcom_err"
DESCRIPTION = "Development files for the com_err error message display library."
LICENSE = "MIT"

PV = "1.47.3"

RPM_NAME = "libcom_err-devel-1.47.3-2.2.aarch64.rpm"
RPM_HASH = "d0684f3c0fdce6d66528dc30e59aeae3bc6aedb21063fe1a29784037ea2ace3fe6c7403102a2395993e4cf80a1093fd9fba2d50faf218ef71d41dee8ebfb88e7"

RPROVIDES:${PN} += "libcom-err-devel \
pkgconfig-com-err \
pkgconfig-ss"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libcom-err2 \
pkgconfig-com-err"

inherit rpm
