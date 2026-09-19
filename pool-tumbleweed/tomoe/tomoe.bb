SUMMARY = "Japanese handwriting recognition engine"
DESCRIPTION = "Japanese handwriting recognition engine (Tegaki Online MOji-ninshiki \
Engine)"
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "tomoe-0.6.0-51.18.aarch64.rpm"
RPM_HASH = "a740b0189c7205d7dfcfb3edb3d614823a1ccfdb7868e7b506254e7f518f8704b863b813f2df0b5864f71e66abab6d93b6e4e01a2c7c69168fb3fbe7c415da9b"

RPROVIDES:${PN} += "libtomoe.so.0 \
tomoe"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
