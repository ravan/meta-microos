SUMMARY = "Development files for Allegro's loadpng"
DESCRIPTION = "This package is needed to build programs that use Allegro's loadpng."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "libloadpng44-devel-4.4.3.1-1.29.aarch64.rpm"
RPM_HASH = "32e3d45f2a50d02e78f68ef7cef04b5a1e421d34f87183e06c625854e4ba9ab828b55677eaae4fd475ecbd1fbdbdc3e8e6f793330855a5b2e86ccd885ab36fa8"

RPROVIDES:${PN} += "libloadpng-devel \
libloadpng44-devel \
pkgconfig-loadpng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libloadpng4-4 \
pkgconfig-allegro"

inherit rpm
