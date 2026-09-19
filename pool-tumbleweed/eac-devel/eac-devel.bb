SUMMARY = "Development files for libeac"
DESCRIPTION = "This package contains headers and libraries required to build applications that \
use libeac."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.3"

RPM_NAME = "eac-devel-1.1.3-1.9.aarch64.rpm"
RPM_HASH = "ef5f488170188b643919ca22dd11eb7576c1f756dffd41a6014251cc6e2b3226911655a46ae18215120f9f8c46efa2cb70f55512015d47aa4461b2414a61c01a"

RPROVIDES:${PN} += "eac-devel \
pkgconfig-libeac"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libeac3 \
pkgconfig-libcrypto"

inherit rpm
