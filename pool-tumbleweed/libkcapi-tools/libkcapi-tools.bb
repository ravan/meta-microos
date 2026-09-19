SUMMARY = "Linux Kernel Crypto API User Space Tools"
DESCRIPTION = "libkcapi user space tools to access certain hash algorithms."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "1.5.0"

RPM_NAME = "libkcapi-tools-1.5.0-1.9.aarch64.rpm"
RPM_HASH = "4f951b994b71a050ca1981303964691773a980dc992408d095499abeceb8361f4993555eb9bd958b959c46fe4007fcaf8ecd5607a188bb0b7563e6fc1b845ab2"

RPROVIDES:${PN} += "libkcapi-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkcapi.so.1"

inherit rpm
