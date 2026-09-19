SUMMARY = "Fasttracker II clone"
DESCRIPTION = "Multi-platform clone of the classic music making software \
Fasttracker II. It can load XM, MOD, S3M, STM module files."
LICENSE = "BSD-3-Clause & CC-BY-NC-SA-4.0"

PV = "2.23"

RPM_NAME = "ft2-clone-2.23-1.1.aarch64.rpm"
RPM_HASH = "159442a29e972405267111ca014938d6fc0af669a5b26faccb44580ba3bd30287598f9133367f811d8a8e66dfe64177c2a388bd4f9b33b25b062bc50537e1be6"

RPROVIDES:${PN} += "bundled-rtmidi \
ft2-clone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmvec.so.1 \
libstdc++.so.6"

inherit rpm
