SUMMARY = "General purpose calculator and mathematics tool"
DESCRIPTION = "Genius is a general purpose calculator program similar in some aspects \
to BC, Matlab, Maple or Mathematica. It is useful both as a simple \
calculator and as a research or educational tool. The syntax \
mimics how mathematics is usually written. \
 \
GEL (Genius Extenseion Language) is the name of its extension language. \
Many of the standard genius functions are written in GEL itself."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.29"

RPM_NAME = "genius-1.0.29-2.3.aarch64.rpm"
RPM_HASH = "46f65e8094fac0462eaad4602525c92df89073fb5f54d95622290ae762fa0dcabc9ae49420550dd8a8760837f8e6c0d9c66a42417602c219f9615447c93b46a6"

RPROVIDES:${PN} += "genius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
