SUMMARY = "Utilities for inspecting GUID partition tables"
DESCRIPTION = "This subpackage contains the utility programs from libvsgpt to \
inspect GUID partition tables."
LICENSE = "LGPL-3.0-or-later"

PV = "20260911"

RPM_NAME = "libvsgpt-tools-20260911-1.1.aarch64.rpm"
RPM_HASH = "76ac09f7847abb204a29b5a0abf4130f446ff9a93ede665d3b98c6fb5f9602566d0163beb2c73f222db63e7dbb5536e508eec4f25668b757f0d7d4fcedf066d8"

RPROVIDES:${PN} += "libvsgpt-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfguid.so.1 \
libvsgpt.so.1"

inherit rpm
