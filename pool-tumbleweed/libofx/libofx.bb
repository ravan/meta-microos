SUMMARY = "OFX Command Parser and API"
DESCRIPTION = "LibOFX is a parser and API for applications to support \
OFX command responses, usually provided by financial institutions for \
statement downloads."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.9"

RPM_NAME = "libofx-0.10.9-2.1.aarch64.rpm"
RPM_HASH = "4d0a620f65a3aeb0de81a78e77ceb4e550d9781cc67041e1e719ab549b76bf4d32a9b41311f5e548a7b81c44e0f42a3d9992bfbdd33504a8240800b44f56af6f"

RPROVIDES:${PN} += "libofx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglibmm-2.4.so.1 \
libofx.so.7 \
libstdc++.so.6 \
libxml++-2.6.so.2"

inherit rpm
