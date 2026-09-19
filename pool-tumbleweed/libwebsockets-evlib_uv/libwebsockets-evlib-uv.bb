SUMMARY = "Shared library for evlib_uv plugin"
DESCRIPTION = "This package contains the shared library for evlib_uv plugin."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "libwebsockets-evlib_uv-5.0.0-2.1.aarch64.rpm"
RPM_HASH = "3545f442ce2f14a435c5d4e54da78a1f4cacd6d315568fb8b738923ce2fe8af77a5390b814cc36f583a854565955381be6b64fc0a6bfd96b15f42bef28b92023"

RPROVIDES:${PN} += "libwebsockets-evlib-uv \
libwebsockets-evlib-uv.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
libwebsockets.so.22 \
libwebsockets22"

inherit rpm
