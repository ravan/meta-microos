SUMMARY = "Perl interface for ImageMagick"
DESCRIPTION = "PerlMagick is an objected-oriented Perl interface to ImageMagick. Use \
the module to read, manipulate, or write an image or image sequence \
from within a Perl script. This makes it suitable for Web CGI scripts."
LICENSE = "ImageMagick"

PV = "7.1.2.30"

RPM_NAME = "perl-PerlMagick-7.1.2.30-1.1.aarch64.rpm"
RPM_HASH = "60a42d818bd8f9ed7c900f69051faaa46c2e57055e00dc9e543ff159b5e8a985895ade95e1935e6ddabb37507fbd4dd7898205b595f2e0a41bce4a83b76109bb"

RPROVIDES:${PN} += "perl-Image--Magick \
perl-Image--Magick--Q16HDRI \
perl-PerlMagick"

RDEPENDS:${PN} += "ImageMagick \
ld-linux-aarch64.so.1 \
libMagickCore-7-Q16HDRI10 \
libMagickCore-7.Q16HDRI.so.10 \
libc.so.6 \
libm.so.6 \
perl"

inherit rpm
