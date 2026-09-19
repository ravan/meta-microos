SUMMARY = "Development files for libcap"
DESCRIPTION = "Development files (Headers, libraries for static linking, etc) for \
libcap. \
 \
libcap is a library for getting and setting POSIX.1e (formerly POSIX 6) \
draft 15 capabilities. \
 \
Install libcap-devel if you want to develop or compile applications \
using libcap."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.78"

RPM_NAME = "libcap-devel-2.78-1.4.aarch64.rpm"
RPM_HASH = "447c43063a0a89616c253d55b09a8c00a7a127084e7d8b874168e86e06417552b86e865bebbd02b93d2b0e8698b04738fb505e812d427985776f315dff3aa9b5"

RPROVIDES:${PN} += "libcap-devel \
pkgconfig-libcap \
pkgconfig-libpsx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libcap2 \
libpsx2"

inherit rpm
