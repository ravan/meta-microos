SUMMARY = "Extra codecs for the ImageMagick image viewer/converter"
DESCRIPTION = "This package adds support for djvu, wmf and jpeg2000 formats and \
installs optional helper applications."
LICENSE = "ImageMagick"

PV = "7.1.2.30"

RPM_NAME = "ImageMagick-extra-7.1.2.30-1.1.aarch64.rpm"
RPM_HASH = "fad2a8fad239ef34a50a0412b2d23163eb2cd475e579922c0e9c8f589c7538665a2da1f1c0fe29e1d23ec6963b96946a0dd7f97e53c227cb7734b82888af7476"

RPROVIDES:${PN} += "ImageMagick-extra"

RDEPENDS:${PN} += "ImageMagick \
ld-linux-aarch64.so.1 \
libMagickCore-7-Q16HDRI10 \
libMagickCore-7.Q16HDRI.so.10 \
libMagickWand-7.Q16HDRI.so.10 \
libc.so.6 \
libdjvulibre.so.21 \
libm.so.6 \
libopenjp2.so.7 \
libwmflite-0.2.so.7"

inherit rpm
