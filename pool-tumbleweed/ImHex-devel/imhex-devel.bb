SUMMARY = "Development files for ImHex"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that want to make use of ImHex."
LICENSE = "GPL-2.0-only"

PV = "1.38.1"

RPM_NAME = "ImHex-devel-1.38.1-1.8.aarch64.rpm"
RPM_HASH = "376518ac1ff457a47f8d14e6a80aad7bef155e6545a8ab94712b1c06ceabcf44b9d880de2d7244c1e1a4546a765d67efdda52c5f6225e913c40f3359c0e01095"

RPROVIDES:${PN} += "ImHex-devel"

RDEPENDS:${PN} += "libimhex1-38-1"

inherit rpm
