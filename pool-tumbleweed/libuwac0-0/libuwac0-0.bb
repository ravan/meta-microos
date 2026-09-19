SUMMARY = "Use wayland as a client"
DESCRIPTION = "Using wayland as a client (uwac) is a library to provide common \
functionality for wayland clients."
LICENSE = "Apache-2.0"

PV = "3.31.0"

RPM_NAME = "libuwac0-0-3.31.0-1.1.aarch64.rpm"
RPM_HASH = "455df68d506a037b56ea4b3efbde0d8ac275342616c7736af0f50387001d140138b0e92400fbbacbae80c08739b3750ad3535075eb4c10801f8643e9cec9771f"

RPROVIDES:${PN} += "libuwac0-0 \
libuwac0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp3.so.3 \
libm.so.6 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwinpr3.so.3 \
libxkbcommon.so.0"

inherit rpm
