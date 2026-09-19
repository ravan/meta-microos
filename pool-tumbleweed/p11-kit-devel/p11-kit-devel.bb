SUMMARY = "Library to work with PKCS#11 modules -- Development Files"
DESCRIPTION = "p11-kit provides a way to load and enumerate PKCS#11 modules, as well \
as a standard configuration setup for installing PKCS#11 modules in \
such a way that they're discoverable."
LICENSE = "BSD-3-Clause"

PV = "0.26.2"

RPM_NAME = "p11-kit-devel-0.26.2-1.6.aarch64.rpm"
RPM_HASH = "10e38d2aaa3ca8327b23e645125119ca8c38b493d8e78baca9461d558e35a483ab7810eb7ba894a73dd43b880a057cfe2773c579ea2ae14a60be18859ee5d070"

RPROVIDES:${PN} += "p11-kit-devel \
pkgconfig-p11-kit-1 \
rpm-macro-pkidir-cfg \
rpm-macro-pkidir-static \
rpm-macro-trustdir-cfg \
rpm-macro-trustdir-static"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libp11-kit0"

inherit rpm
