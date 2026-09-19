SUMMARY = "EFL based terminal emulator"
DESCRIPTION = "Fast and lightweight terminal emulator using EFL libraries."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-1.13.0-1.13.aarch64.rpm"
RPM_HASH = "5f86a455d5a5e022d1185cba83611f24ff69bb9c1a06e4954817d1511a69ce9d9aba5b2650e7d2539a2161ef2e65444e0d3bdb0dee32906000cc4d38624536fb"

RPROVIDES:${PN} += "terminology"

RDEPENDS:${PN} += "efl \
elementary \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecore-con.so.1 \
libecore-evas.so.1 \
libecore-file.so.1 \
libecore-imf-evas.so.1 \
libecore-imf.so.1 \
libecore-input.so.1 \
libecore-ipc.so.1 \
libecore.so.1 \
libedje.so.1 \
libeet.so.1 \
libefreet.so.1 \
libeina.so.1 \
libelementary.so.1 \
libemotion.so.1 \
libethumb-client.so.1 \
libevas.so.1 \
libm.so.6 \
terminology-theme-dft"

inherit rpm
