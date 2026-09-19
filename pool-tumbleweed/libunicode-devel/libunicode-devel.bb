SUMMARY = "Development files for libunicode"
DESCRIPTION = "The libunicode-devel package contains libraries and header files for \
developing applications that use libunicode."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "libunicode-devel-0.6.0-1.7.aarch64.rpm"
RPM_HASH = "7b3f0594880f87cd9fcae8d7504ab568eb2381c1c667589533a5174a31c376929dc5a81a0a6699ffdaaf39d8345b67f04d2c334f754c93e710461349067d6c81"

RPROVIDES:${PN} += "cmake-libunicode \
libunicode-devel"

RDEPENDS:${PN} += "libunicode0-6"

inherit rpm
