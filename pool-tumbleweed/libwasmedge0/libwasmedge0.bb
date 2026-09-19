SUMMARY = "WasmEdge library"
DESCRIPTION = "Library for WasmEdge."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.1"

RPM_NAME = "libwasmedge0-0.16.1-2.5.aarch64.rpm"
RPM_HASH = "d21734bb154a68e3b03bd4170e19c86e3894031930943a74d6421171ac137a62a996a0bcd9274f103776386a552e472cade40ff78312c02c9f9dbf9e61ec4c89"

RPROVIDES:${PN} += "libwasmedge.so.0 \
libwasmedge0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfmt.so.12 \
libgcc-s.so.1 \
libm.so.6 \
libspdlog.so.1.17 \
libstdc++.so.6"

inherit rpm
