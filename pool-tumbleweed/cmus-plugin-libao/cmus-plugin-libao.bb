SUMMARY = "Libao output plugin for the C* Music Player"
DESCRIPTION = "This package provides libao output support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-plugin-libao-2.12.0-3.6.aarch64.rpm"
RPM_HASH = "7bb7cfc807244f7cf4a79da290bff912bce3f161f5ab1302f002ca623d8475e4131ec395ddc24528a447900f2d3cb9180f5dfa71c294467a9599f6c302c17ae6"

RPROVIDES:${PN} += "cmus-plugin-libao"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libao.so.4 \
libc.so.6"

inherit rpm
