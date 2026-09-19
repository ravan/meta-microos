SUMMARY = "Extract meta information from image files"
DESCRIPTION = "This module provides functions to extract various kinds of meta information \
from image files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.450.0"

RPM_NAME = "perl-Image-Info-1.450.0-1.10.noarch.rpm"
RPM_HASH = "9c7e57b47bce0d0a0e4b452800f7c1d402451dd238a7e65f77413bfe6f9daf205484a5e616bbecd99812f47f0a81151ea244a14176c16fd4c06c2cf241b9da04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Bundle--Image--Info--Everything \
perl-Bundle--Image--Info--PNG \
perl-Bundle--Image--Info--SVG \
perl-Bundle--Image--Info--XBM \
perl-Bundle--Image--Info--XPM \
perl-Image--Info \
perl-Image--Info--AVIF \
perl-Image--Info--BMP \
perl-Image--Info--GIF \
perl-Image--Info--ICO \
perl-Image--Info--JPEG \
perl-Image--Info--PNG \
perl-Image--Info--PPM \
perl-Image--Info--Result \
perl-Image--Info--SVG \
perl-Image--Info--SVG--XMLLibXMLReader \
perl-Image--Info--SVG--XMLSimple \
perl-Image--Info--TIFF \
perl-Image--Info--WBMP \
perl-Image--Info--WEBP \
perl-Image--Info--XBM \
perl-Image--Info--XPM \
perl-Image--TIFF \
perl-Image--TIFF--Rational \
perl-Image-Info"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
