SUMMARY = "Idle management daemon for Wayland"
DESCRIPTION = "sway's idle management daemon. It is compatible with any Wayland compositor which implements the KDE idle protocol."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "swayidle-1.9.0-1.5.aarch64.rpm"
RPM_HASH = "58f47813ec8f312c92d99033d1f97849a09a85a2ff67eec3e5147f015fa490ede6030d2c73b7b130c6f1ac446ad48b1536395904d3a886a91c7bfb79ec247825"

RPROVIDES:${PN} += "swayidle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libwayland-client.so.0 \
libwayland-server.so.0"

inherit rpm
