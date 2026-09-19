SUMMARY = "Single-header testing framework"
DESCRIPTION = "C++98/C++11 single-header testing framework for unit tests and TDD."
LICENSE = "MIT"

PV = "2.5.3"

RPM_NAME = "doctest-devel-2.5.3-1.1.aarch64.rpm"
RPM_HASH = "8b2ed8f368f19f53d81dabdd2330b934b18082a91363a9348d8c20f7b974d7f2b2aaa1ba433de8055dbc2a1c513999851aaddf6733208a1006045dbd8d77c25d"

RPROVIDES:${PN} += "cmake-doctest \
doctest-devel \
pkgconfig-doctest"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
