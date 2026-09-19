SUMMARY = "Viewer and Converter for Images"
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

RPM_NAME = "ImageMagick-7.1.2.30-1.1.aarch64.rpm"
RPM_HASH = "ecabfb5c61de6b29421925bf72c1a785bfadf262d1c185c9d86a39cb85c724d9a5560f022a8221f3b05f910636c76244b5b2fcbc3804e19328cc4570a87fb3db"

RPROVIDES:${PN} += "ImageMagick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libMagickWand-7.Q16HDRI.so.10 \
libc.so.6"

inherit rpm
