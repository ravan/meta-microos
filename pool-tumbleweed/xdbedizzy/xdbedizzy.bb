SUMMARY = "Demo of X11 Double Buffer Extension"
DESCRIPTION = "xdbedizzy is a demo of the X11 Double Buffer Extension (DBE) \
creating a double buffered spinning scene."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "xdbedizzy-1.1.0-9.37.aarch64.rpm"
RPM_HASH = "6e1c00a41e5ae56d97e05f8390d9c63dbcf09380bbc6d49eee2113d1bdaec1d9345029dc4feb00b8ce3ede6c558c356f7ccc0cf29cc596bf590f811862060182"

RPROVIDES:${PN} += "xdbedizzy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
