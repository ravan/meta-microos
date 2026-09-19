SUMMARY = "GNOME Calculator Library GTK Interface"
DESCRIPTION = "This package contains a shared library for gnome-calculator."
LICENSE = "GPL-3.0-or-later"

PV = "50.0+16"

RPM_NAME = "libgci-1-0_0_0-50.0+16-1.3.aarch64.rpm"
RPM_HASH = "62ec6017a1fc7d3a0f701ee252b6471672bcfa75aafc679c4d20d247c9912c3917b6c2f563e1078a52eb309d5e8042bac14896141ad188921193bf1d33b0c6a7"

RPROVIDES:${PN} += "libgci-1-0-0-0 \
libgci-1.so.0.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcalc-2.so.1.0.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
