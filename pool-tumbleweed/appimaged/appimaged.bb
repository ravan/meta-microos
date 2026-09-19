SUMMARY = "Daemon handles (un)registering AppImages with the system"
DESCRIPTION = "appimaged is a daemon that handles registering and unregistering AppImages \
with the system (e.g., menu entries, icons, MIME types, binary delta updates, \
and such). \
 \
The package comes also with appimage.validate CLI tool to verify signature \
of AppImage files."
LICENSE = "MIT"

PV = "10"

RPM_NAME = "appimaged-10-2.9.aarch64.rpm"
RPM_HASH = "5270e13bfd13a0052d4a0e0e4e1139a206f459ba55e5f5fa998d482e9630e4ef51aa85b22d108fc053c00318f8c7bfbb72068bc0231f5d21906ad081b90dc1d1"

RPROVIDES:${PN} += "appimaged"

RDEPENDS:${PN} += "/usr/bin/sh \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libinotifytools.so.0 \
liblzma.so.5 \
libz.so.1 \
zsync"

inherit rpm
