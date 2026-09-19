SUMMARY = "Development libraries for libblosc1"
DESCRIPTION = "This package provides development libraries and headers \
for libblosc1."
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"

PV = "1.21.6"

RPM_NAME = "blosc-devel-1.21.6-3.3.aarch64.rpm"
RPM_HASH = "464956c63c4948b537c5a7c5eeeef9e0bcd86daecee4b7fdd9c1b4b0da76c65c8c95e5dd59004e3b05f53e315b54d36952bc92aff0c82d5733f36bd9cf9a9d44"

RPROVIDES:${PN} += "blosc-devel \
pkgconfig-blosc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblosc1"

inherit rpm
