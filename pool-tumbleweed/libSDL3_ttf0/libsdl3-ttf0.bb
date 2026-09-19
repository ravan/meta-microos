SUMMARY = "Simple DirectMedia Layer Truetype library"
DESCRIPTION = "This is a library that allows using TrueType fonts in SDL applications."
LICENSE = "Zlib"

PV = "3.2.2"

RPM_NAME = "libSDL3_ttf0-3.2.2-1.4.aarch64.rpm"
RPM_HASH = "feca607e2de119c456d0d57d252210c34f0eee938f45fdeb9a824f4265616a6f70b6767fe142b534d5bd0e47266d2fde71b80c1bdfc4a4b77787b59897b9a7f1"

RPROVIDES:${PN} += "libSDL3-ttf.so.0 \
libSDL3-ttf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
