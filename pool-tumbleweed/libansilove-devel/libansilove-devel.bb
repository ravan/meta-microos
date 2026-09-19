SUMMARY = "Library for converting ANSI, ASCII, and other formats to PNG"
DESCRIPTION = "This library contains shared code regarding the conversion of ANSI and \
artscene related file formats into PNG images. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libansilove."
LICENSE = "BSD-2-Clause"

PV = "1.4.2"

RPM_NAME = "libansilove-devel-1.4.2-1.5.aarch64.rpm"
RPM_HASH = "c6c8ba951402c87e43c7b824ea99e844f5b02f2479de491b2abbd4dd00a024554912eb7f4b2d5d410cecc0ae0e4a49a1e8cfa8f5516cf29cc1685679c344d512"

RPROVIDES:${PN} += "libansilove-devel"

RDEPENDS:${PN} += "libansilove1"

inherit rpm
