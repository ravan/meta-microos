SUMMARY = "Development environment for the ZBar library"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools needed to compile and link \
applications using the zbar library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.23.93"

RPM_NAME = "libzbar-devel-0.23.93-4.3.aarch64.rpm"
RPM_HASH = "b583731f28aa5f46ebb1d0ab615f63784dda82c12e03e5318eef17d8e6a1708062b251ce4e466825503d2a28d074d93a9d7c233f7b9a402d309a96418b2b0c9f"

RPROVIDES:${PN} += "libzbar-devel \
pkgconfig-zbar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzbar0"

inherit rpm
