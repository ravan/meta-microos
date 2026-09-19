SUMMARY = "Files for developing with mypaint-brushes"
DESCRIPTION = "This package contains a pkgconfig file which makes it easier to develop \
programs using these brush files."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.2"

RPM_NAME = "mypaint-brushes-devel-2.0.2-1.17.noarch.rpm"
RPM_HASH = "07546d9a68514ea67d6c0abe1fa8809df4b10d1d8a9b1ae87bd69a5cc36e1ffcf2cd130d504ea015843345a9d8dd2c0d6cc6ff59af69be056be1e5ca8db29e7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mypaint-brushes-devel \
pkgconfig-mypaint-brushes-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mypaint-brushes"

inherit rpm
