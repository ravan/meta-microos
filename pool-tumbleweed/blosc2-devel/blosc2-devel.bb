SUMMARY = "Development libraries for libblosc2-9"
DESCRIPTION = "This package provides development libraries and headers \
for libblosc2-9."
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"

PV = "3.3.4"

RPM_NAME = "blosc2-devel-3.3.4-1.1.aarch64.rpm"
RPM_HASH = "3029049d85036fd3f3f0ee8842f20aded009dd6df4859d439bec326dacf372f7f208d3b5dffd35b8a7d99a841072907b700354443c9aeef9f705523cbcb86676"

RPROVIDES:${PN} += "blosc2-devel \
cmake-Blosc2 \
pkgconfig-blosc2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblosc2-9"

inherit rpm
