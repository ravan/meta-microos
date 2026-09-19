SUMMARY = "Development files for erfa"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use erfa."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "erfa-devel-2.0.1-1.11.aarch64.rpm"
RPM_HASH = "f721204abf25306ff9f18513f28eb8844195c404d8e85d8ef39986e2ebe1709934939c87ed369a7c6f9e43da155366e4c7b1b30d463bf2a61ba699870372cf2c"

RPROVIDES:${PN} += "erfa-devel \
pkgconfig-erfa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liberfa1"

inherit rpm
