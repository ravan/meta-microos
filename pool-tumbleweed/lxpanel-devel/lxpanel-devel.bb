SUMMARY = "Devel files for lxpanel"
DESCRIPTION = "Headers and development files for lxpanel."
LICENSE = "GPL-2.0-only"

PV = "0.11.1"

RPM_NAME = "lxpanel-devel-0.11.1-1.4.aarch64.rpm"
RPM_HASH = "216fc9900fa90e99a0fa0b41955fde90b2e592004c6a90a7bc63d91e79008c68924485ad744526fd7babc4729b522d70f8ec8aa9205be9622fce06d00f36c507"

RPROVIDES:${PN} += "lxpanel-devel \
pkgconfig-lxpanel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
liblxpanel0 \
lxpanel \
menu-cache-devel \
pkgconfig \
pkgconfig-gtk+-3.0 \
pkgconfig-libfm"

inherit rpm
