SUMMARY = "Deflate64 compression/decompression library"
DESCRIPTION = "A python package to provide compression and decompression feature with Enhanced Deflate algorithm."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "python313-inflate64-1.0.4-1.6.aarch64.rpm"
RPM_HASH = "e95f1775dd2553ecaf3dd474927aa9c33783e53a66f2e959d0019cca94731eaae695f32e71fc5f4def7a5cf80b221ec08c0a882988aca124820600d9bc343434"

RPROVIDES:${PN} += "python3-inflate64 \
python3.13dist-inflate64 \
python313-inflate64 \
python3dist-inflate64"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
