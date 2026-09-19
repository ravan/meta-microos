SUMMARY = "Development files of libvterm"
DESCRIPTION = "This package contains the development files of libvterm."
LICENSE = "MIT"

PV = "0.3.3"

RPM_NAME = "libvterm-devel-0.3.3-1.11.aarch64.rpm"
RPM_HASH = "4c2eae94b6f04dccde6839b4744d7aea263236020e1b03814532d5c299b3f0821f69d348cc5360fd642ca4479e5f9fad42493b2482992dc15af3dfeab2e83b74"

RPROVIDES:${PN} += "libvterm-devel \
pkgconfig-vterm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvterm0"

inherit rpm
