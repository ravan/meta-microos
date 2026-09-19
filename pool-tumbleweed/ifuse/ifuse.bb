SUMMARY = "Filesystem access for Apple devices"
DESCRIPTION = "iFuse is a FUSE filesystem driver which uses `libimobiledevice` to connect to \
devices without the need for a jailbreak. \
It is using the native Apple 'AFC' protocol, over the normal USB cable in order \
to access the iPhone's, iPod Touch's or iPad's media files under Linux."
LICENSE = "LGPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "ifuse-1.2.1-1.3.aarch64.rpm"
RPM_HASH = "45e8a2f7bad7abf85809185096620735a8c748d20e96a1afd0aa4689f35106448b692512f0fc70128db128d50cbd99e4bee5122ff28892f5b4b593645b0c2297"

RPROVIDES:${PN} += "ifuse"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
libimobiledevice-1.0.so.6 \
libplist-2.0.so.4"

inherit rpm
