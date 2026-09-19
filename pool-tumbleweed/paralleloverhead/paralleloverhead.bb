SUMMARY = "An endless runner game"
DESCRIPTION = "Parallel Overhead is a colorful endless runner game where you take control of \
the ships Truth and Beauty on a groundbreaking trip through hyperspace. A \
stable hyperspace tunnel has finally been achieved with the two ships \
supporting it on opposite walls of the tunnel. Well, almost stable... \
It's up to you to keep the ships from falling through the cracks!"
LICENSE = "CC0-1.0 & MIT"

PV = "1.2.0"

RPM_NAME = "paralleloverhead-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "6219a40d1feeb5930b6f55b50992d2f094f7b1c61d93786b3fec5641e2e0839843d4aeeeed93144fd652186f5a5968b63a755ef0ee7d535598e3246f568b9d04"

RPROVIDES:${PN} += "paralleloverhead"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
