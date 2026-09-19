SUMMARY = "Development files for libscrypt"
DESCRIPTION = "The libscrypt-devel package contains libraries and header files for developing applications that use libscrypt."
LICENSE = "BSD-1-Clause"

PV = "1.22"

RPM_NAME = "libscrypt-devel-1.22-1.12.aarch64.rpm"
RPM_HASH = "df5313a52eade71a936fb237b23c2d7d0f724b0241df0ffe82756fd2bc46557237ff7c00e4059f1980acd43c15f7232c4193e1aa384e1aa5cd8c92b93115f897"

RPROVIDES:${PN} += "libscrypt-devel"

RDEPENDS:${PN} += "libscrypt0"

inherit rpm
