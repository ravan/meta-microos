SUMMARY = "Development libraries and headers for libreport"
DESCRIPTION = "Development libraries and headers for libreport"
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-devel-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "d786dd42ab79d9a7294948b2beac932391d5c81aa3f93d8b250f0ac96e814f347c0d3006f4b8c55b81d46f6871f64c54bad57df9cb88ec907ced1f9e8899471b"

RPROVIDES:${PN} += "libreport-devel \
pkgconfig-libreport"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libreport-2 \
pkgconfig-glib-2.0"

inherit rpm
