SUMMARY = "Files for developing with mypaint-brushes"
DESCRIPTION = "This package contains a pkgconfig file which makes it easier to develop \
programs using these brush files."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "mypaint-brushes1-devel-1.3.1-2.7.noarch.rpm"
RPM_HASH = "d6f118e1a6fe34ed0153c0a7ddfdab4f10dfd08785d40f491b1531f468cc4703ecc48ecd2db25efd40ab5fa246d472f382b37735ade1ab2ef8fafc35097a697d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mypaint-brushes-devel \
mypaint-brushes1-devel \
pkgconfig-mypaint-brushes-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mypaint-brushes1"

inherit rpm
