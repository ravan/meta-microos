SUMMARY = "Header files for the 3270 Virtual Terminal library"
DESCRIPTION = "Originally designed as part of the pw3270 application, this package provides the development files required to libv3270."
LICENSE = "LGPL-3.0-only"

PV = "5.5.0+git20241211"

RPM_NAME = "libv3270-devel-5.5.0+git20241211-2.8.aarch64.rpm"
RPM_HASH = "f4dde613abdb9d443b557ee310eef8c9a427c1ff74bbe7f2d51a586ec10e864d32ee7723272acea3b28e4c64f01c1c0e7d4de72878758397b6b3e064d3400c59"

RPROVIDES:${PN} += "libv3270-devel \
pkgconfig-libv3270"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libv3270-5-5 \
pkgconfig-lib3270"

inherit rpm
