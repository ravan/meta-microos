SUMMARY = "C runtime library for ImageMagick"
DESCRIPTION = "ImageMagick is a robust collection of tools and libraries to read, \
write, and manipulate an image in many image formats, including popular \
formats like TIFF, JPEG, PNG, PDF, PhotoCD, and GIF. With ImageMagick, \
you can create images dynamically, making it suitable for Web \
applications. You can also resize, rotate, sharpen, color-reduce, or \
add special effects to an image and save your completed work in many \
different image formats. Image processing operations are available from \
the command line as well as through C, C++, and Perl-based programming \
interfaces."
LICENSE = "ImageMagick"

PV = "7.1.2.30"

RPM_NAME = "libMagickWand-7_Q16HDRI10-7.1.2.30-1.1.aarch64.rpm"
RPM_HASH = "64c861a9d2b19c781f60cefbfb4b3ec932799fd6b8e3b29fcd8f9adb3182c043e900b56dc86a7bcce2317220a250d0295fcf3f237f6604b21e2e27f5895a1093"

RPROVIDES:${PN} += "libMagickWand-7-Q16HDRI10 \
libMagickWand-7.Q16HDRI.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
