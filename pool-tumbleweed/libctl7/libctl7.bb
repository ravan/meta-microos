SUMMARY = "A guile Library for Scientific Simulations"
DESCRIPTION = "libctl is a free Guile-based library implementing flexible control files \
for scientific simulations. It was written to support MIT Photonic Bands \
and Meep software, but has proven useful in other programs too."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.1"

RPM_NAME = "libctl7-4.5.1-1.18.aarch64.rpm"
RPM_HASH = "41e0867b88ad6acfc8cf0850d3729dc942bd7e6efcca94b158eb94e5a3dfbb4ddfe7884c433834dc85b40d1a8042a8ccfea2050b7b4ff9b4a300086c43396de5"

RPROVIDES:${PN} += "libctl.so.7 \
libctl7 \
libctlgeom.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1 \
libm.so.6"

inherit rpm
