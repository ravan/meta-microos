SUMMARY = "XFree86-DGA extension client library"
DESCRIPTION = "libXxf86dga provides the XFree86-DGA extension, which allows direct \
graphics access to a framebuffer-like region, and also allows \
relative mouse reporting, et al. It is mainly used by games and \
emulators for games."
LICENSE = "MIT"

PV = "1.1.7"

RPM_NAME = "libXxf86dga1-1.1.7-1.4.aarch64.rpm"
RPM_HASH = "f86778d6678570fc9706e70ea8ed846eb735c024fe19883915a5483c61c3ed1286e28a2d10b79776deebcfeee1b9193f5c5aa1f0f6b3ace5801c378baa3e3f48"

RPROVIDES:${PN} += "libXxf86dga.so.1 \
libXxf86dga1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
