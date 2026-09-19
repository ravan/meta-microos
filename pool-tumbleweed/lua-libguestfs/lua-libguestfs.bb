SUMMARY = "Lua bindings for libguestfs"
DESCRIPTION = "lua-libguestfs contains Lua bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "lua-libguestfs-1.60.1-1.1.aarch64.rpm"
RPM_HASH = "a0882ac6cf5f00b80390003a2133f89e2b509b7eedc53005f44eea1142d612a2acacfd3c59669694c79d190d69c4d01cb3745deb262b1ad2d8ccb83d2c79ab7d"

RPROVIDES:${PN} += "libluaguestfs.so \
lua-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
lua"

inherit rpm
