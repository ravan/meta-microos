SUMMARY = "X Printing Extension client library"
DESCRIPTION = "libXp provides APIs to allow client applications to render to \
non-display devices."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "libXp6-1.0.4-1.12.aarch64.rpm"
RPM_HASH = "2e3fc1b395d2b2d54db9fd84d6940490d815a3212cd53a3bd8fd626237cc47681d375304629e2cafed2f7f0affc3ff74452ba219bf97a5cd4ae839023a0352f5"

RPROVIDES:${PN} += "libXp.so.6 \
libXp6 \
xorg-x11-libXp"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXau.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
