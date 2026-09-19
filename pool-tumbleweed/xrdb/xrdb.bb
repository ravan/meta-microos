SUMMARY = "X server resource database utility"
DESCRIPTION = "Xrdb is used to get or set the contents of the RESOURCE_MANAGER property \
on the root window of screen 0, or the SCREEN_RESOURCES property on the \
root window of any or all screens, or everything combined."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "xrdb-1.2.3-1.2.aarch64.rpm"
RPM_HASH = "7d5ed902fa8394601e5489ddb5cfce037a91fdf9ffae319e57f6f4b9b8aa252141017cea6d9dada3ac86dbeeeb1b4ef9d10b34527348734dc3fbd7333d577de5"

RPROVIDES:${PN} += "xrdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmuu.so.1 \
libc.so.6"

inherit rpm
