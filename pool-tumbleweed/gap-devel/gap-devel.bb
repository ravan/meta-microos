SUMMARY = "Development environment for GAP"
DESCRIPTION = "GAP is a system for computational discrete algebra, with particular \
emphasis on Computational Group Theory. \
 \
This package will pull in the current version of the GAP compiler \
'gac', as well as utilities required to build GAP packages that need \
compilation."
LICENSE = "GPL-2.0-or-later"

PV = "4.16.1"

RPM_NAME = "gap-devel-4.16.1-1.1.aarch64.rpm"
RPM_HASH = "7c7eef1850dec60549843b125a02c82fbd619c393cc35426d326224312d1b39774eead8cd36ffac360b91fd859d9c8845ad49025cc9a2b0ea7079f13b0d72efe"

RPROVIDES:${PN} += "gap-devel \
pkgconfig-libgap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgap11"

inherit rpm
