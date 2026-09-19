SUMMARY = "Development files for smooth"
DESCRIPTION = "The smooth-devel package contains libraries and header files for \
developing applications that use smooth."
LICENSE = "Artistic-2.0"

PV = "0.9.10"

RPM_NAME = "smooth-devel-0.9.10-1.16.aarch64.rpm"
RPM_HASH = "d948371ccd3e810bf3f187ffd3443b522779dfa6a4200679aafeb434fa762ff08c4d85cb5b3617847e12c9f08dab8993ec74f50426f865ad02365738cdb78a4a"

RPROVIDES:${PN} += "smooth-devel"

RDEPENDS:${PN} += "libsmooth-0-9-0 \
pkgconfig-x11"

inherit rpm
