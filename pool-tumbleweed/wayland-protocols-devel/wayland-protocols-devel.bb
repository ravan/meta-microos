SUMMARY = "Wayland protocols that add functionality not available in the core protocol"
DESCRIPTION = "This package contains Wayland protocols that add functionality not \
available in the Wayland core protocol. Such protocols either add \
completely new functionality, or extend the functionality of some other \
protocol either in Wayland core, or some other protocol in \
wayland-protocols."
LICENSE = "MIT"

PV = "1.49"

RPM_NAME = "wayland-protocols-devel-1.49-1.3.noarch.rpm"
RPM_HASH = "db3040e7183dbe86cc603c413047696b27a22adc4fd5bfd0d862b301fb201fa986cf9aaa29738cf14c6005615039e2e3ceda7ae470072861d3617c6007a82b07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-wayland-protocols \
wayland-protocols-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
