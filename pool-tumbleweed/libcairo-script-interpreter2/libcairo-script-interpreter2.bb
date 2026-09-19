SUMMARY = "Vector Graphics Library with Cross-Device Output Support"
DESCRIPTION = "Cairo is a vector graphics library with cross-device output support. \
Currently supported output targets include the X Window System, \
in-memory image buffers, and PostScript. Cairo is designed to produce \
identical output on all output media while taking advantage of display \
hardware acceleration when available."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.18.4"

RPM_NAME = "libcairo-script-interpreter2-1.18.4-4.5.aarch64.rpm"
RPM_HASH = "7f9987bbb36d63046a50f1e3a6418aba30f199a3715cffb5975a747ccad23f8f108923967ddadea162109d04761bc3a8454088a7f16c3774b92bea53bce3bb72"

RPROVIDES:${PN} += "libcairo-script-interpreter.so.2 \
libcairo-script-interpreter2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
liblzo2.so.2 \
libm.so.6 \
libz.so.1"

inherit rpm
