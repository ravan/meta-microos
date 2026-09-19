SUMMARY = "Header files and documentation for libsnapper"
DESCRIPTION = "This package contains header files and documentation for developing with \
libsnapper."
LICENSE = "GPL-2.0-only"

PV = "0.13.1"

RPM_NAME = "libsnapper-devel-0.13.1-3.3.aarch64.rpm"
RPM_HASH = "65c9f066ade7be1ec9ecd83e756f20a99fc4e02580a765f85533d429b7c33d4d7ef04c1712dbf44ceff556d3b0c37778dd92c351b8008f3efb1799eca64aa0f6"

RPROVIDES:${PN} += "libsnapper-devel"

RDEPENDS:${PN} += "gcc-c++ \
libacl-devel \
libboost-headers-devel \
libbtrfs-devel \
libmount-devel \
libsnapper8 \
libstdc++-devel \
libxml2-devel"

inherit rpm
