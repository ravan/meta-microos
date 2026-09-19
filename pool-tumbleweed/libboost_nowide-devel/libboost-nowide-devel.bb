SUMMARY = "Development library for Boost.Nowide"
DESCRIPTION = "This package contains the Boost.Nowide development library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_nowide-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "cc2ab5ee8db9cd7d5f516b710260e1507bea1effb9ab6c5f8ae850cbe82582f648400fb9a015053adcc20c1975bd74055f2b617f723931839f1a79a2725bda9e"

RPROVIDES:${PN} += "libboost-nowide-devel"

RDEPENDS:${PN} += "libboost-nowide1-91-0-devel"

inherit rpm
