SUMMARY = "The LAME MP3 encoder"
DESCRIPTION = "LAME is an educational tool to be used for learning about MP3 encoding. \
The goal of the LAME project is to use the open source model to improve the \
psycho acoustics, noise shaping and speed of MP3. \
Another goal of the LAME project is to use these improvements for the basis of \
a patent free audio compression codec for the GNU project."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "lame-3.100-5.15.aarch64.rpm"
RPM_HASH = "c83588bffcb4e320b03daa206a94f8c71662aeb301f5cfe1fa6d29cd22101d84d7af36372202dc5f1f018183b3ffeb41066d1cd2dca5234b23a5d399aa58f770"

RPROVIDES:${PN} += "lame"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmp3lame.so.0 \
libmp3lame0 \
libtinfo.so.6"

inherit rpm
