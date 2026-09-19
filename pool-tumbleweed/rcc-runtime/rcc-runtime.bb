SUMMARY = "LibRCC Runtime Environment"
DESCRIPTION = "Runtime environment for the LibRCC package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "rcc-runtime-0.2.13-3.6.aarch64.rpm"
RPM_HASH = "a869f6a85e51581cadd962059080d6ecead43ba7a2ce5d13d1f6a8fe8ad0b00255f8785b6f9a201ca392072f0a2c303ade0c552c539627d3918f9069c162c528"

RPROVIDES:${PN} += "config-rcc-runtime \
libguess-engine.so \
librcd-engine.so \
rcc-runtime"

RDEPENDS:${PN} += "libc.so.6 \
libguess.so.1 \
librcc.so.0 \
librcd.so.0"

inherit rpm
