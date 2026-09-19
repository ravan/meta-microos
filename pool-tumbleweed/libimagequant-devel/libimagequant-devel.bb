SUMMARY = "Development files for libimagequant"
DESCRIPTION = "C library for conversion of RGBA images to 8-bit indexed-color \
(palette) images."
LICENSE = "GPL-3.0-or-later"

PV = "2.18.0"

RPM_NAME = "libimagequant-devel-2.18.0-1.15.aarch64.rpm"
RPM_HASH = "f68d408f96d49c1afff10c52b75603e51f9d170f505aebdc57a1b017ae473387fb12c406b0b6f7c28f948652970796267d9d9b7b2d474e2bab316a88304659bf"

RPROVIDES:${PN} += "libimagequant-devel \
pkgconfig-imagequant"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libimagequant0"

inherit rpm
