SUMMARY = "Development files for the dsdcc library"
DESCRIPTION = "DSDcc is a complete rewrite of the original DSD (Digital Speech Decoder) \
project. It decodes the DMR, dPMR, D-Star and Yaesu System Fusion (YSF) \
standards. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libdsdcc."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.6"

RPM_NAME = "dsdcc-devel-1.9.6-1.1.aarch64.rpm"
RPM_HASH = "dac404490129db9efcc982799cbc7c7c707ee1d247248684a5aa4fdabbf623341d08720c9934a6d82364c2f80aeb20424059742c8beae85fe047b902ea10a542"

RPROVIDES:${PN} += "dsdcc-devel \
pkgconfig-libdsdcc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdsdcc1"

inherit rpm
