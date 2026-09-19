SUMMARY = "Development files for modemu2k"
DESCRIPTION = "This package contains the development files (headers, pkg-config file, \
and unversioned shared library symlink) for modemu2k."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.4"

RPM_NAME = "libmodemu2k0-devel-0.2.4-1.2.aarch64.rpm"
RPM_HASH = "6f57a1b06c029a3ac22ad4d501087f98c548a77350cf7facac6851130d3574e532a1aac606f077691502bca853b067712c410939e364fbe4060ff421226385eb"

RPROVIDES:${PN} += "libmodemu2k0-devel \
pkgconfig-modemu2k"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmodemu2k0"

inherit rpm
