SUMMARY = "Build Result Compare Script"
DESCRIPTION = "This package contains scripts to find out if the build result differs \
to a former build."
LICENSE = "GPL-2.0-or-later"

PV = "20260622T095938.6416d96"

RPM_NAME = "build-compare-20260622T095938.6416d96-1.3.noarch.rpm"
RPM_HASH = "24e52079319c07b4d325c73c0aa98c8e4d228bbd78511377c9564c7c10f3e78f63e1ec09a38fe6e3f39d1207bef7911ad8f243a6af5feb421240b43ac0efddb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-compare"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
coreutils \
cpio \
diffutils \
file \
gawk \
grep \
rpm \
sed"

inherit rpm
