SUMMARY = "Headers and Static Library for htmlcxx"
DESCRIPTION = "The htmlcxx-devel package contains libraries and header files for \
developing applications that use htmlcxx."
LICENSE = "Apache-2.0 & LGPL-2.0-only"

PV = "0.87"

RPM_NAME = "htmlcxx-devel-0.87-3.1.aarch64.rpm"
RPM_HASH = "674cddd5b44beb8b5a463b46e3621a247346602fd74a995c7ef24d3a44f34df209ad816732b55a699b8bb837cd835b0b8ae134a93b102c02fee79915e4667692"

RPROVIDES:${PN} += "htmlcxx-devel \
pkgconfig-htmlcxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
htmlcxx"

inherit rpm
