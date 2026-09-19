SUMMARY = "Tools for Working with the GIF Library"
DESCRIPTION = "A tool for converting GIFs to various formats."
LICENSE = "MIT"

PV = "5.2.2"

RPM_NAME = "giflib-progs-5.2.2-4.3.aarch64.rpm"
RPM_HASH = "2b47f273dc3aeb75b7fa3310d0b88ee144410ccb5666e0d96d10ed626fbac1fc03b070a68d314728b3701b94a4fb9e3cd9ec1389244c8a4bfa0747e2a96fc0e8"

RPROVIDES:${PN} += "giflib-progs \
ungif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
