SUMMARY = "Displays warning and error messages in sway"
DESCRIPTION = "Displays warning and error messages in sway."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "swaynag-1.12-12.3.aarch64.rpm"
RPM_HASH = "941cb91d3d09adf109450347d61920845df93c0a9bc965d1c256a1d3535eef1a7fd40b07eb338b0640a987d9eb54faef447224e71731e794d5b62bbf67c4e99a"

RPROVIDES:${PN} += "swaynag"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
sway"

inherit rpm
