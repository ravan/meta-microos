SUMMARY = "Development files for rav1e"
DESCRIPTION = "The rav1e-devel package contains libraries and header files for \
developing applications that use rav1e."
LICENSE = "BSD-2-Clause & ISC"

PV = "0.8.1"

RPM_NAME = "rav1e-devel-0.8.1-2.4.aarch64.rpm"
RPM_HASH = "0d746c3a5ed1d3a61d126e0e28f6b9f61eac8cb2ac148e31bf5dbc1c97dc2ef38c6dc157068bbd47aea2dea17c1f91adc4b9bcf3d1d715ee35daa718622b7a7f"

RPROVIDES:${PN} += "pkgconfig-rav1e \
rav1e-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librav1e0-8"

inherit rpm
