SUMMARY = "AT-SPI 2 driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the AT-SPI 2 screen driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.9.1"

RPM_NAME = "brltty-driver-at-spi2-6.9.1-2.1.aarch64.rpm"
RPM_HASH = "875d3a751153a805d1a559565300f5f79771495d23389a1bbb0b9724034074e7ceb5f9ffcbe69ef266dbe45d66982dfdb12ee518769ca4b114f8d17111ed6e61"

RPROVIDES:${PN} += "brltty-driver-at-spi2 \
libbrlttyxa2.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libatspi.so.0 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
