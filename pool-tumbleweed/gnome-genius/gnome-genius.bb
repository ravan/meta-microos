SUMMARY = "GNOME interface for Genius, a general purpose calculator"
DESCRIPTION = "Genius is a general purpose calculator program similar in some aspects \
to BC, Matlab, Maple or Mathematica. It is useful both as a simple \
calculator and as a research or educational tool. The syntax mimics \
how mathematics is usually written."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.29"

RPM_NAME = "gnome-genius-1.0.29-2.3.aarch64.rpm"
RPM_HASH = "4289be407197f7f9fd8eb9cba7fd00537a3f1d0cd47a1ea2e8dc677f83d1f841a29431f9f9d22df34346820ded316a569dbcc0ae703dece66022a345a3c1401c"

RPROVIDES:${PN} += "gnome-genius"

RDEPENDS:${PN} += "genius \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libm.so.6 \
libmpfr.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libreadline.so.8 \
libvte-2.91.so.0"

inherit rpm
