SUMMARY = "Development files for libbson"
DESCRIPTION = "The bson-devel package contains libraries and header files for \
developing applications that use libbson."
LICENSE = "Apache-2.0 & ISC & MIT & Zlib"

PV = "2.5.3"

RPM_NAME = "bson-devel-2.5.3-1.1.aarch64.rpm"
RPM_HASH = "ee391b81d2bc7991a3fb34d15acabcfb968734d55e2529e1a2448a707bd196f49fca24843e97f93cafd67c24cfee6872c81ff8d03c0d4dbfa04883b8bbcfca18"

RPROVIDES:${PN} += "bson-devel \
cmake-bson \
pkgconfig-bson2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbson2"

inherit rpm
