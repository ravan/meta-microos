SUMMARY = "Perl interface for the GraphicsMagick image conversion library"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images. \
 \
This package contains perl interface to GraphicsMagick library."
LICENSE = "MIT"

PV = "1.3.48"

RPM_NAME = "perl-GraphicsMagick-1.3.48-2.1.aarch64.rpm"
RPM_HASH = "9c84598bb3cd90258d69a968dce3fc79fdeecb01021574fc2a941579a416e4a11b1897e07a2142351447c118fa242d6fdba3af4e35ba946de47c0500f29d2c1b"

RPROVIDES:${PN} += "perl-Graphics--Magick \
perl-GraphicsMagick"

RDEPENDS:${PN} += "GraphicsMagick \
ld-linux-aarch64.so.1 \
libGraphicsMagick-Q16.so.3 \
libc.so.6 \
libm.so.6 \
perl"

inherit rpm
