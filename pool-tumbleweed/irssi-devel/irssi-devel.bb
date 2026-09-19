SUMMARY = "Development package for irssi"
DESCRIPTION = "This package contains the development files for irssi. It allows to \
compile plugins for the irssi package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "irssi-devel-1.4.5-3.17.aarch64.rpm"
RPM_HASH = "208e8c403fb3453d7ac9341df7ad8ae22b51b49fb4abca90f9fa5366e3a350a6fac4a207f7c7c6eb4866cb4f8722bbfbf2004d377316ebc1a1a601f405e8d695"

RPROVIDES:${PN} += "irssi-devel \
pkgconfig-irssi-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dante-devel \
irssi \
pkgconfig-glib-2.0"

inherit rpm
