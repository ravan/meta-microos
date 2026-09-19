SUMMARY = "Development headers for Boost.Regex library"
DESCRIPTION = "This package contains development headers for Boost.Regex library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_regex1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "17732106b834ca1e8ec85fe0520fe848b002fc51fa99ae1143b72f1b5ba28909d1a8c8e21cded5177de4be3c2cdbc70a9ccf589fe042157401cebc8f10f6e0d7"

RPROVIDES:${PN} += "libboost-regex-devel-impl \
libboost-regex1-91-0-devel"

RDEPENDS:${PN} += "libboost-headers1-91-0-devel \
libboost-regex1-91-0 \
libicu-devel"

inherit rpm
