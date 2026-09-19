SUMMARY = "LV2 ports of LADSPA swh plugins"
DESCRIPTION = "This is an early experimental port of my LADSPA plugins to the LV2 \
specification, c.f. http://lv2plug.in/ . It is still quite early days, but most \
things should work as well or not as they did in LADSPA."
LICENSE = "GPL-3.0"

PV = "1.0.16"

RPM_NAME = "lv2-swh-plugins-1.0.16-3.10.aarch64.rpm"
RPM_HASH = "f3f5ae0b43e8674a0aedcf16f50ba969373175a41d0a9bd9f04638e3195c5997a2256ebadbf74665b863fd16c95a7ef7d04ce0e2e317d1e5734ef21bc25e58a0"

RPROVIDES:${PN} += "lv2-swh-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libm.so.6 \
lv2"

inherit rpm
