SUMMARY = "Development files for libe131"
DESCRIPTION = "The libe131-devel package contains libraries and header files for \
developing applications that use libe131."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "libe131-devel-1.4.0-1.21.aarch64.rpm"
RPM_HASH = "bb354ee3d936e2c4d45c349f819a7d3ac6a8012f8c6ebae706afaca9ce76a91c69c26aa60918a928ab97e94cf4f54b8c8dbd51aa4ca7dc63af81cc7a42973441"

RPROVIDES:${PN} += "libe131-devel \
pkgconfig-libe131"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libe131-1"

inherit rpm
