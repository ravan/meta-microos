SUMMARY = "Utility to convert PNG images to Microsoft ICO format"
DESCRIPTION = "pngtoico is a small utility to convert a set of PNG images to Microsoft \
ICO format. Supports transparency."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "pngtoico-1.0.1-146.11.aarch64.rpm"
RPM_HASH = "3865b62f4ba8feecd316ed906892b73be02a99d34b8d04ee44b833013bd632af4023093910e1c6a44095d9716f24565108a21e49fa08a8453346503ab3ed8072"

RPROVIDES:${PN} += "pngtoico"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpng16.so.16"

inherit rpm
