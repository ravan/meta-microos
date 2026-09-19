SUMMARY = "Development files for libpolyclipping"
DESCRIPTION = "The polyclipping-devel package contains libraries and header files for \
developing applications that use polyclipping."
LICENSE = "BSL-1.0"

PV = "6.4.2"

RPM_NAME = "libpolyclipping-devel-6.4.2-2.19.aarch64.rpm"
RPM_HASH = "157c597493f00d4bee16eb662e3380c68512e433eb258c927d105c7313858a1f201f55a395e33553ad528f79e272caa498bd4e8104fd01239285ec6dc9548d3d"

RPROVIDES:${PN} += "libpolyclipping-devel \
pkgconfig-polyclipping"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpolyclipping22"

inherit rpm
