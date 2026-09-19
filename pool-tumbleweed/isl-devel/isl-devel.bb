SUMMARY = "Development tools for ISL"
DESCRIPTION = "Development tools and headers for the ISL."
LICENSE = "MIT"

PV = "0.27"

RPM_NAME = "isl-devel-0.27-1.8.aarch64.rpm"
RPM_HASH = "eea9a53915f5d9059cc7f6b831a88eb255ef0093a36569314018f211648e97934f0c8c5742151e9d8a04f48fdce4e5df694ed921c20086846a62787fcddc6537"

RPROVIDES:${PN} += "isl-devel \
pkgconfig-isl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libisl23"

inherit rpm
