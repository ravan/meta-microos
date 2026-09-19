SUMMARY = "More Image Formats for Tk"
DESCRIPTION = "This package contains a collection of image format handlers for the Tk \
photo image type, and a new image type, pixmaps. \
 \
The provided format handlers include bmp, gif, ico, jpeg, pcx, png, \
ppm, ps, sgi, sun, tga, tiff, xbm, and xpm."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "tkimg-2.1.0-1.6.aarch64.rpm"
RPM_HASH = "e5710ff9917c8b3bfa7858b28323bc02f13ec71492f3f0fd002cc2bcfd3e0644afc16c09d0864cb893eb3c7318bb573e7b46efbefd28f6a719936946292b1adf"

RPROVIDES:${PN} += "libjpegtcl9.6.0.so \
libpngtcl1.6.48.so \
libtifftcl4.7.0.so \
libtkimg2.1.0.so \
libtkimgbmp2.1.0.so \
libtkimgdted2.1.0.so \
libtkimgflir2.1.0.so \
libtkimggif2.1.0.so \
libtkimgico2.1.0.so \
libtkimgjpeg2.1.0.so \
libtkimgpcx2.1.0.so \
libtkimgpixmap2.1.0.so \
libtkimgpng2.1.0.so \
libtkimgppm2.1.0.so \
libtkimgps2.1.0.so \
libtkimgraw2.1.0.so \
libtkimgsgi2.1.0.so \
libtkimgsun2.1.0.so \
libtkimgtga2.1.0.so \
libtkimgtiff2.1.0.so \
libtkimgwindow2.1.0.so \
libtkimgxbm2.1.0.so \
libtkimgxpm2.1.0.so \
libzlibtcl1.3.1.so \
tkimg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
