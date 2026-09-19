SUMMARY = "Development files for ImageMagick's C interface"
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

RPM_NAME = "ImageMagick-devel-7.1.2.30-1.1.aarch64.rpm"
RPM_HASH = "41f729d6358e54a2d52a79c4c161396317aab0ecf47f94c2bf07a3b0a4cb959142d3c60470584a195f067a34f2a75dd7edea3ad9df41095e29c7a143e74a09cb"

RPROVIDES:${PN} += "ImageMagick-devel \
pkgconfig-ImageMagick \
pkgconfig-ImageMagick-7.Q16HDRI \
pkgconfig-MagickCore \
pkgconfig-MagickCore-7.Q16HDRI \
pkgconfig-MagickWand \
pkgconfig-MagickWand-7.Q16HDRI"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
ImageMagick \
glibc-devel \
libMagickCore-7-Q16HDRI10 \
libMagickWand-7-Q16HDRI10 \
pkgconfig-MagickCore-7.Q16HDRI \
pkgconfig-bzip2"

inherit rpm
