SUMMARY = "Development Files for libspecimen0"
DESCRIPTION = "Header and development files for font-specimen library."
LICENSE = "GPL-2.0+"

PV = "20150202"

RPM_NAME = "font-specimen-devel-20150202-3.30.aarch64.rpm"
RPM_HASH = "6f119d1e7725345fcefef97b7a89bec7f0b6dba07c8ee07593a747281fe2a81d868d9aed1a368120afb4283e6c4e18274eb08874d0a11b15e9be37da910d5aa2"

RPROVIDES:${PN} += "font-specimen-devel \
pkgconfig-font-specimen"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libfont-specimen0"

inherit rpm
