SUMMARY = "GNU Astronomy Utilities"
DESCRIPTION = "The GNU Astronomy Utilities (Gnuastro) contains various programs and \
library functions for the manipulation and analysis of astronomical \
data."
LICENSE = "GPL-3.0-or-later"

PV = "0.24"

RPM_NAME = "gnuastro-0.24-1.5.aarch64.rpm"
RPM_HASH = "db8c40c2184a8e997fd7e3245146ceb0b839a36c4db8949a0af9ea52b5ab82cfc9c8d381f5bf306543bbd1fb74a031e7d1cb388e9a2ca8eeb729627861487948"

RPROVIDES:${PN} += "config-gnuastro \
gnuastro"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libgnuastro.so.22 \
libgsl.so.28 \
libm.so.6 \
libwcs.so.8"

inherit rpm
