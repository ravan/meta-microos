SUMMARY = "The development files for canfigger"
DESCRIPTION = "This package contains the development files for canfigger"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libcanfigger0-devel-0.3.2-1.3.aarch64.rpm"
RPM_HASH = "f51aadb3a3b6e2661e7b161d3ca8315e2fb6bc99582fcd0e493b0917ed6560716dc51868726bff9b7929eebf959652dadccb8ed578d018f78a5a357a86bb9e3f"

RPROVIDES:${PN} += "libcanfigger0-devel \
pkgconfig-canfigger"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcanfigger0"

inherit rpm
